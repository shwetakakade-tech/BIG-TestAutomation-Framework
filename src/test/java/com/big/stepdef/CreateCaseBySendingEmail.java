package com.big.stepdef;

import com.big.pageObjects.CommonObj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateCaseBySendingEmail {

	CommonObj co = new CommonObj();
	@Given("User send email with attachment")
	public void user_send_email_with_attachment() {
		CommonObj.sendEmailWithMultiAttachement();
	}

	@Then("case is being created under Home tab.")
	public void case_is_being_created_under_home_tab() {
	    System.out.println("Case is being created");
	}

	@Then("verify case created and add Case ID to Excel")
	public void verify_case_created_and_add_case_id_to_excel() {
		System.out.println("Case is being created");
	}

	
}
