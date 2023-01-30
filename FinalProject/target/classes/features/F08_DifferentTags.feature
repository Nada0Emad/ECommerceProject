@Smoke
Feature:F08_Logged user could select different tags
  Scenario: Logged user could select different tags
    Given user logged to the system
    And user clicked on any product image

    When user pressed specific tag
    And  user mapped to this url "https://demo.nopcommerce.com/apparel-2"
    Then user shows "Products tagged with" specific tag
