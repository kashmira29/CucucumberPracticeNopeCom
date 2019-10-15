@GuestuserCheckout
Feature: guest user should Be able to Buy A Product Successfully
  Scenario: guest User Should be able to Buy a Product successfully And see Success Message
    Given user navigate to Books category on Homepage
    When user add item in to Shopping Cart
    And checkout As A guest user
    And Navigate to Checkout Page
    Then user should be able to buy the product and should see Success Message
