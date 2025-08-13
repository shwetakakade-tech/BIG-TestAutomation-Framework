package com.big.stepdef;

import com.big.pageObjects.ActuarialLegalAssignmentobj;
import com.big.pageObjects.HomePage_Actions;
import com.big.utils.Utilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActuarialLegalAssignmentStep {

	
	Utilities ut = new Utilities();
	HomePage_Actions homeAtionobj= new HomePage_Actions();
	ActuarialLegalAssignmentobj actuarialLegalobj = new ActuarialLegalAssignmentobj();
	
	 @When("User selects the action section from {string}")
     public void user_selects_the_action_section_from(String actions) throws InterruptedException {
         Thread.sleep(4000);
         actuarialLegalobj.selectActions(actions);          
         System.out.println("Action");
     }

     @When("User selects from Assign Program - Actuarial Analysis popup {string}")
     public void user_selects_from_assign_program_actuarial_analysis_popup(String ActuarialAnalysis) throws InterruptedException {
    	 Thread.sleep(6000);
    	 actuarialLegalobj.selectActuarialAnalysis(ut.getCellValue("Credentials",ActuarialAnalysis,"Assignee"));
          System.out.println("Printing Excel Test Data Value Priyanka's email" +ut.getCellValue("Credentials",ActuarialAnalysis,"Assignee"));
          System.out.println("ActuarialAnalysis");
     }

     @When("User selects from Assign Program - Legal Analysis popup {string}")
     public void user_selects_from_assign_program_legal_analysis_popup(String LegalAnalysis) throws InterruptedException {
    	 Thread.sleep(6000);
    	 actuarialLegalobj.selectLegalAnalysis(ut.getCellValue("Credentials",LegalAnalysis,"Assignee"));
          System.out.println("Printing Excel Test Data Value Priyanka's email" +ut.getCellValue("Credentials",LegalAnalysis,"Assignee"));
          System.out.println("LegalAnalysis");
     }

     @Then("Actuarial labels should display assigned values")
     public void actuarial_labels_should_display_assigned_values() throws InterruptedException {
    	 Thread.sleep(3000);
       boolean isACtuarialAnalystBlank = actuarialLegalobj.isActuarialAnalystBlank();
       
       if (isACtuarialAnalystBlank ) {
           throw new AssertionError("❌ ActuarialAnalyst value is blank: " +
                     "\nActuarialAnalyst blank? " + isACtuarialAnalystBlank );
           }
       System.out.println("Actuarial Analyst label are populated.");
     }

     @Then("Legal labels should display assigned values")
     public void legal_labels_should_display_assigned_values() throws InterruptedException {
    	 boolean isLegalAnalystBlank = actuarialLegalobj.isLegalAnalystBlank();
    	 
    	 if (isLegalAnalystBlank ) {
    	       throw new AssertionError("❌ ActuarialAnalyst value is blank: " +
                       "\nLegalAnalyst blank? " + isLegalAnalystBlank );
     }
         System.out.println("Legal Analyst label are populated.");
     }
}




