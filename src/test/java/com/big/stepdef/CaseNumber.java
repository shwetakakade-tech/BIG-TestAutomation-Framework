package com.big.stepdef;

import com.big.pageObjects.CommonObj;
import com.big.pageObjects.QPRHomePage_Actions;
import com.big.pageObjects.QPRLogin_Actions;
import com.big.utils.Utilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CaseNumber {
	
	Utilities ut = new Utilities();
	CommonObj co = new CommonObj();
	QPRHomePage_Actions qprActionObj = new QPRHomePage_Actions();
	
	@Given("User selects the case {string} from the list")
	public void user_selects_the_case_from_the_list(String string) {
		
		
	   System.out.println("Hello");
	}

	@Given("User navigate to {string} CaseMenu tab")
	public void user_navigate_to_case_menu_tab(String string) {
		qprActionObj.searchCaseNumber() ;
	}

	@When("User navigate to {string} paragraphtab")
	public void user_navigate_to_paragraphtab(String string) {
		System.out.println("Hello2");
	}

	@When("User selects {string} of case")
	public void user_selects_of_case(String string) {
		System.out.println("Hello3");
	}

}
