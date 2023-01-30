@Smoke
Feature:F07_Logged user could filter with color
  Scenario: Logged user could filter with color
    Given user logged to the system

    When user press on Apparel Menu Icon
    And  user choose Shoes submenu
    And  user select red color from checkbox
    Then user shows the product which match with the color


