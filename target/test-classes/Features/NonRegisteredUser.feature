@nonRegisteredUser
Feature: non-registered User should not able to reffred a link to friend
  Scenario: non-registered User Should not able to reffered a link of product to a friend and see error message
    Given user is on Homepage
    When User navigate to Computers category
    And Select the the Notebooks from Notebooks category
    And Navigate to Email a Friend page
    And enter all details in Email A Friend
    Then User should not be able to send a Link to friend and see Error Message

