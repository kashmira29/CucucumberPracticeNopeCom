@RegisteredUserCheckout
Feature: registered User should be able to Buy Product successfully
  Scenario: user Should be Able to Buy product Successfully and should see Success Message
    Given User is on Registration page
    When user enter all details on Registration Page
    And Navigate to Books Category
    And add item in to shopping cart
    And Navigate to Checkout Page and fill checkout Details
    Then user should be able to buy the item and should see Success Message
