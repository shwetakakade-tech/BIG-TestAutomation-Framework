package com.big.pageObjects;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.big.utils.TestReusables;
import com.big.utils.Utilities;

public class UpdateOverallConsideration_Actions extends TestReusables {
	
Utilities ut = new Utilities();
	
	public UpdateOverallConsideration_Actions()
	{
		super();
	}
	
	@FindBy(xpath="//div[@class='RecordActionWidget---button_layout_inner_wrapper']/descendant::button[1]")
	WebElement updateOverallConsideration;
	
	
	//@FindBy(xpath="(//div[@class='ColumnArrayLayout---column_layout ColumnArrayLayout---standard_spacing appian-context-last-in-list'])[3]/descendant::iframe")
	
	
	//WebElement iframe;
	
	@FindBy(xpath="//div[@class='note-editing-area']/child::div[2]/child::p")
	WebElement enterDescription;
	
	@FindBy(xpath="//div[@class='ColumnArrayLayout---column_layout ColumnArrayLayout---standard_spacing']/descendant::span[contains(text(),'SAVE')]")
	WebElement clickSave;
	
	
	public void verify_case_ID()
	{
		WebElement ele = driver.findElement(By.xpath("//div[@class='ColumnArrayLayout---column_layout ColumnArrayLayout---standard_spacing ColumnArrayLayout---minHeight_buttonSmall appian-context-last-in-list']/descendant::h1"));
		String actual = ele.getText();
		System.out.println(actual);
		
		
		//String expected = "#";
		
        try {
			
			Assert.assertTrue("Case Id mismatch!", actual.contains("#"));
			writeintoReport(actual + " text matches expected text", "Pass");
			
		    }
		catch (Exception e)
		{
			e.printStackTrace();
			writeintoReport(actual + " text not matches expected text", "Fail");
		}
				
	}
	
	
	public void scroll_and_click() throws InterruptedException
	{
		Thread.sleep(3000);
		//scrolltoElement(updateOverallConsideration);
		click(updateOverallConsideration, "Update Overall Consideration");
	}
	
	
	
	public void enter_descrpn_in_considerations_textarea() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("In-1");
        driver.switchTo().defaultContent();
        WebElement f1 = driver.findElement(By.xpath("(//iframe[contains(@src, 'richTextFieldWithTables/index.html')])[2]"));
    
        System.out.print("Frame==" + f1.getAttribute("id"));
        String frameID = f1.getAttribute("id");
    
        driver.switchTo().frame(f1);
        System.out.println("In-111111");
       // System.out.println("Text"+ driver.findElement(By.xpath("//div[@role='textbox']//p")).getText());
        driver.findElement(By.xpath("//div[@role='textbox']//p")).clear();
        driver.findElement(By.xpath("//div[@role='textbox']//p")).sendKeys("New Text Entered");
   
	}
	
	public void click_save_button()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, 300);"); 
		click(clickSave, "Save");
	}

}
