Feature: Internet Herokuapp
@Internet
Scenario Outline: Validating Basic Authentication
    Given I navigate to the website 
    When I Click on Basic Auth and enter "<UserName>" and "<Password>"
    Then I should be Successfully loged in and congratulations page should be loded
    Examples: 
      |UserName|Password|
      |admin|admin|
@BrokenImages
Scenario: Validating Broken Images
    Given I navigate to the website 
    When I Click on Broken Images
    Then broken Images should be validated
   

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
