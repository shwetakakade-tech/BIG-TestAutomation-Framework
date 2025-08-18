
Feature: This feature file will Add Quotation in Negotiation Quatation tab
   As a Case Manager
   I want to add quotation in "Add Quoatation" screen

Background:
		Given User login to Appian application as "CaseManager"
    Then User navigates to Home category
        
 

 Scenario Outline: User is on Add Quotation screen
    Given User enters the case "133572" from the list
    And User navigates to the "<stage>" tab
    When User clicks "Add Quotation" in Actions
    And User adds values in "Quotation" section 
    And  User clicks submit button
    Then  User navigates to "Non-Binding Quotation" tab
    And User verifies the Quotation values 
     Examples:
     | stage |
     |Negotiation/Quotation|
     
     
       
      
       
       
        
       
      
       
            