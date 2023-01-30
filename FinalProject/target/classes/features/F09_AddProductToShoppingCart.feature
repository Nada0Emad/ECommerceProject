@Smoke
Feature:F09_Logged user could add different products to Shopping cart
  Scenario: Logged user could add different products to Shopping cart
    Given user logged to the system

    When user choose "Apple MacBook Pro 13-inch"and press add to cart icon below it
    And  user navigated to product page clicked
    And user pressed Add to cart icon
    Then user show message success message
    And user shows shopping cart item increased by 1


