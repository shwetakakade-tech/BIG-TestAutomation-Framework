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

	
	 @FindBy(xpath =" ")
	 private  WebElement searchCase;



	public void searchCaseNumber() {
		
		System.out.println("Search Case Number");
	}

	
}
