@Smoke
Feature: F10_WishlistAddProduct| Logged user could add different products to Wishlist
  Scenario: Logged user could add different products to Wishlist
    Given user logged to the system

    When user go to HTC One M8 Android L 5.0 Lollipop product
    And user clicks on heart icon below the product
    Then user will see success message