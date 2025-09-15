package com.big.stepdef;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;

import com.big.pageObjects.AuthorizationDecisionApprove_Actions;
import com.big.pageObjects.Negotiation_QuotationTabPO;
import com.big.utils.Utilities;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class AuthorizationDecisionApprove_Steps {
	
	Utilities ut = new Utilities();
	//Negotiation_QuotationTabPO negotiationQuotationObj = new Negotiation_QuotationTabPO();

	AuthorizationDecisionApprove_Actions DecisionApproveObj = new AuthorizationDecisionApprove_Actions();
	
	
	
	
	@Given("^the user navigates to \"([^\"]*)\" tab$")
    public void user_navigates_to_stage_tab(String stage) throws InterruptedException {
		
	     DecisionApproveObj.get_Tab_Name();
        
    }

    @When("^the user clicks \"([^\"]*)\" in Actions$")
    public void user_clicks_in_actions(String action) {
    	
       	DecisionApproveObj.click_Action_button();
        
    }

    @And("the user selects the user from dropdown and submits")
    public void user_selects_user_from_dropdown_and_submits() {
    
    	DecisionApproveObj.click_submit();
    	
    }

    @Then("the Actions options should be available:")
    public void the_actions_options_should_be_available(DataTable dataTable) throws InterruptedException {
    	
    	Thread.sleep(4000);
    	List<String> expectedButtons = dataTable.asList();
    	DecisionApproveObj.get_list_of_buttons(expectedButtons);
    	
    	
        
    }

    @When("the user clicks AUTHORIZATION DECISION in Actions")
    public void click_authorization_decision()
    {
    	DecisionApproveObj.click_Authorization_Decision();
    
    }
    
    
    @Then("the user selects Actions:")
    public void the_user_selects_actions_as(DataTable dataTable) throws InterruptedException {
    	List<String> actions = dataTable.asList();
    	
    	DecisionApproveObj.select_Action(actions);
        
            }
  
}


