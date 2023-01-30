@Smoke
Feature: F06_Different Categories selection|Logged user could select different Categories
  Scenario: Logged user could select different Categories
    Given user logged to the system

    When user hover on any category
    And user open any subcategory
    Then user show subcategory's selected page