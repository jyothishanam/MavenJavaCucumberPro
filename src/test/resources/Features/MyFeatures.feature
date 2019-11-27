Feature: Automated End to End Tests

  @Latest
  Scenario Outline: Customer place an order by purchasing an item
    Given user navigates to the website
    When user Clicks on Signin
    And Enters "<EmailAddress>" and "<Password>"
    And selects women tab
    And Clicks on first item to get the product details
    And Clicks on Add to cart button
    And Choose to proceed to checkOut
    And Click on proceed to CheckOut button in Shoping Cart Summary Page
    And user Clicks on add a new address in Address Page
    And Add user Address Details
    And Selects The address to deliver items and click on proceed to checkout
    And Accepts TC and Clicks on Proceed to checkout in shipping page
    And Choose the payment method option PayByCheck
    And Confirms the order
    Then confirmation information should be displayed 

    Examples: 
      | EmailAddress        | Password   |
      | ydunde123@gmail.com | Automation |

  Scenario Outline: Order Confirmation for Women Items
    Given user navigates to the website
    When user clicks on SignIn link and Enters "<EmailAddress>" and "<Password>"
    And Add an item to the cart and check out
    Then Order should be placed and confirmation information should be displayed with below details
 

    Examples: 
      | EmailAddress        | Password   |
      | ydunde123@gmail.com | Automation |

  Scenario: Order Confirmation for Mens Items
    Given I Navigate to the shopping website
    When I successfully login with userName "" and Password ""
    And I add item "Trousure" from "Men" tab to basket and checkout
    Then Order should be placed and confirmation information should be displayed.
    And I add item "T-Shirt" with color "black" and Size "XL" from "Women" tab to basket and checkout
