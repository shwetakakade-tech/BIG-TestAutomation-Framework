package com.big.stepdef;

import org.junit.jupiter.api.Assertions;

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
         Thread.sleep(2000);
         actuarialLegalobj.selectActions(actions);          
     }

     @When("User selects from Assign Program - Actuarial Analysis popup {string}")
     public void user_selects_from_assign_program_actuarial_analysis_popup(String ActuarialAnalysis) throws InterruptedException {
    	 Thread.sleep(4000);
    	 actuarialLegalobj.selectActuarialAnalysis(ut.getCellValue("Credentials",ActuarialAnalysis,"Assignee"));
     }

     @When("User selects from Assign Program - Legal Analysis popup {string}")
     public void user_selects_from_assign_program_legal_analysis_popup(String LegalAnalysis) throws InterruptedException {
    	 Thread.sleep(4000);
    	 actuarialLegalobj.selectLegalAnalysis(ut.getCellValue("Credentials",LegalAnalysis,"Assignee"));
     }

     @Then("Actuarial labels should display assigned values {string}")
     public void actuarial_labels_should_display_assigned_values(String ActuarialAnalysis) throws InterruptedException {
    	 Thread.sleep(4000);
       String actuariallabelfromUI = actuarialLegalobj.ActuarialAnalystlabel();
       String actuariallabelfromTestData = ut.getCellValue("Credentials",ActuarialAnalysis,"Assignee");
       Thread.sleep(5000);
             Assertions.assertEquals(actuariallabelfromUI, actuariallabelfromTestData);
             System.out.println(actuariallabelfromUI);
      
     }

     @Then("Legal labels should display assigned values {string}")
     public void legal_labels_should_display_assigned_values(String LegalAnalysis) throws InterruptedException {
    	 Thread.sleep(4000);
    	 String legallabelfromUI = actuarialLegalobj.LegalAnalystlabel();
         String legallabelfromTestData = ut.getCellValue("Credentials",LegalAnalysis,"Assignee");
         Thread.sleep(5000);
         Assertions.assertEquals(legallabelfromUI, legallabelfromTestData);
         System.out.println(legallabelfromUI);
   }
}




