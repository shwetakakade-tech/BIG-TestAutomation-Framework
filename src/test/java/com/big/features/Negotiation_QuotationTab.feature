@test
Feature: This feature file will send non binding refusal email
   As a Case Manager
   I want to send a non‑binding refusal email

Background:
		Given User login to Appian application as "CaseManager"
    Then User navigates to Home category
        
 
@appianHome
 Scenario Outline: Send non‑binding refusal email
    Given User enters the case "133572" from the list
    And User navigates to the "<stage>" tab
    When User clicks "Send Binding Non Refusal" in Actions
    Then User sends the non‑binding refusal email via Action
    And  User verifies the email in "Communiction" tab
    
     Examples:
     | stage |
     |Negotiation/Quotation|
     
     
       
      
       
       
        
       
      
       
            