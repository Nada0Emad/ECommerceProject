@Smoke
Feature:F11_Logged user could add different products to compare list
  Scenario:  Logged user could add different products to compare list
    Given user logged to the system

    When user choose "Apple MacBook Pro 13-inch"and press add to compare list icon below it
    Then user show success compare message
