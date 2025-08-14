package com.big.stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableExample {
   public static void main(String[] args) {
      // Set up WebDriver (Assuming ChromeDriver here)
	   WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();

      // Navigate to the desired webpage
      driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

      // Find the table element
      WebElement tableElement = driver.findElement(By.tagName("table"));
      List<WebElement> rows = tableElement.findElements(By.tagName("tr"));

      // Iterate through each row
      for (WebElement rowElement : rows) {
         List<WebElement> cells = rowElement.findElements(By.tagName("td"));

         // Iterate through each cell in the row
         for (WebElement cellElement : cells) {
            String cellData = cellElement.getText();
            // Process the cell data as needed
            System.out.print(cellData + "\t");
         }

         // Move to the next line after processing each row
         System.out.println();
      }

      // Close the browser
      driver.quit();
   }
}