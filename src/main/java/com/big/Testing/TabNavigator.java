package com.big.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabNavigator {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

	      // Initialize ChromeDriver
	      WebDriver driver = new ChromeDriver();

	      // Navigate to a URL (optional)
	      driver.get("https://bigappmarket-dev.appiancloud.com/suite/sites/demo-qpr-underwriting-workbench\r\n"
	      		+ "");
	}  
	
}