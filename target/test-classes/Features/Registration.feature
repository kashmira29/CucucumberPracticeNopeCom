@register
Feature: User should be registered Succesfully
  Scenario: User should be registerd successfully and see confirmation message
    Given user is on register page
    When user enter all registration details
    Then user should be registerd successfully

