Feature: Landing Page TestCases

@LogTest
  Scenario: Validating Landing Page Title
    Given user navigates to the website 
    When website is loaded
    Then check the page title is "My Store"
    
   @First
   Scenario Outline: Validating Sucessful Login
   Given user navigates to the website 
   When user Clicks on Signin
   And  Enters "<EmailAddress>" and "<Password>"
   Then User should be successfully Logedin
   
   Examples:
   |EmailAddress|Password|
   |ydunde123@gmail.com|Automation|
 