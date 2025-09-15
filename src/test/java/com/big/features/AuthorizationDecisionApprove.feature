@AuthorizationApprove
Feature: Add Quotation when the user navigates to the Negotiation/Quotation tab
 
#Author:Namita
#Prerequisite for this Scenario is to select case Number from Assigned Program where Legal Analyst is already being assigned*/

  
Background:
    Given User login to Appian application as "CaseManager"
    Then User navigates to Home category
  

Scenario Outline: User is on Home tab, opens the case and navigates to Authorization/Refusal tab
    When User opens a contract case from the Assigned Programs "<testCaseID>"
    Given the user navigates to the "<stage>" tab
    When the user clicks "Proceed to Next Level Authorization" in Actions
    And the user selects the user from dropdown and submits
    Then the Actions options should be available:
      | UPDATE OVERALL CONSIDERATIONS       |
      | PROCEED TO NEXT LEVEL AUTHORIZATION |
      | AUTHORIZATION DECISION              |
      | UPDATE WRITTEN LINES                |
      | SEND AUTHORIZATION EMAIL            |
      | UPDATE SIGNED LINES                 |
      | SIGN CONTRACT                       |
      | SEND SIGNED CONTRACT                |
      | CLOSE PROGRAM                       |

# The user will click Authorization Decision and click Approve/Reject button    
    When the user clicks AUTHORIZATION DECISION in Actions
    Then the user selects Actions: 
      | APPROVE  |
      | REJECT   |

     Examples:
    | stage                 | testCaseID |
    | Authorization/Refusal | TC_009    |
    