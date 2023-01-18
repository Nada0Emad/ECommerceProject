@Smoke
Feature: F05_currencies Change| users could switch between currencies
  Scenario: user could switch between currencies
    Given user logged to the system
    When user go to home page and clicks on currency list
    And user chose the euro
    Then user will show the change of currency on any product