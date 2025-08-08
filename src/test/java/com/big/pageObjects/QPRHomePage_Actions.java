package com.big.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.big.utils.TestReusables;
import com.big.utils.Utilities;

public class QPRHomePage_Actions extends TestReusables {
	Utilities ut = new Utilities();

	public QPRHomePage_Actions() {
		super();
	}

	
	 @FindBy(xpath ="//input[@class=\"TextInput---text TextInput---align_start TextInput---inSideBySideItem\"][1]")
	 private  WebElement searchCaseForUnassignedPrograms;

	 @FindBy(xpath="//button//span[text()=\"Search\"][1]")
	 private WebElement searchButtonForCaseNumber;

	public void searchCaseNumber(String searchCaseID) {
		enterText(searchCaseForUnassignedPrograms, "caseNumber",searchCaseID);
		click(searchButtonForCaseNumber, searchCaseID); 
		System.out.println("Search Case Number");
	}

	
}
