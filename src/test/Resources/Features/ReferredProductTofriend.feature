@emailAFriend
Feature: Registered User should be able to refferd a product to a friend
  Scenario: User should be able to reffered a product to a friend and see Success message
    Given User is on Registered page
    When User enter all registerd details
    And navigate to Computer Category
    And Select the Notebook in Notebook Category
    And navigate to Email a friend
    And enter all details
    Then User should be able to send a link to friend and see the Success message