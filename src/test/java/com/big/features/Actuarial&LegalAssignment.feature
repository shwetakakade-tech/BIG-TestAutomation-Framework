@qa
Feature: This feature file allow user to perform ACTUARIAL & LEGAL ASSIGNMENT Actions 
  
  
Background:
        Given User login to Appian application as "CaseManager"
        Then User navigates to Home category
      
#  sceario written by suraj umale.
#  precondition for this scenario is for the selected case id program filling preparation is completed  
  
@actuarialassignment
 Scenario Outline: User should be able to do Actuarial Assignment
       When  User opens a contract case "133587" from the Home tab
       And   User navigate to "<CaseMenu>" CaseMenu tab
       When  User navigate to "Upfront Analysis" paragraphtab 
       When  User selects the action section from "<ActionTab>"
       And   User selects from Assign Program - Actuarial Analysis popup "ActuarialAnalysis"
       Then  Actuarial labels should display assigned values "ActuarialAnalysis"
Examples:
 |CaseMenu|    ActionTab        | 
 |Summary |Actuarial Assignment | 
 

@legalassignment
 Scenario Outline: User should be able to do Legal Assignment
       When  User opens a contract case "133587" from the Home tab
       And   User navigate to "<CaseMenu>" CaseMenu tab
       When  User navigate to "Upfront Analysis" paragraphtab 
       When  User selects the action section from "<ActionTab>"
       And   User selects from Assign Program - Legal Analysis popup "LegalAnalysis"
       Then  Legal labels should display assigned values "LegalAnalysis"
Examples:
 |CaseMenu|    ActionTab        | 
 |Summary |Legal Assignment     | 




 