@Smoke
Feature: F04_Search for a product| Logged User could search for any product
  Scenario: Logged user could search for any product
    Given user logged to the system
    When  user search about "computer" in searchbox
    And user click on search button
    Then user show the product on the page

