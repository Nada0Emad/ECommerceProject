@Smoke
Feature:F12_Create successful Order
  Scenario:Create successful Order
    Given user logged to the system
    And user added products to shopping cart

    When user open shopping cart
    And user press checkbox of "I agree with the terms of service and I adhere to them unconditionally (read)"
  #class="terms-of-service"
    And user press Checkout button
    And user navigate to this url "https://demo.nopcommerce.com/onepagecheckout#opc-billing"
    And user should select country as "Egypt", city as "Sharqia", address1 as "Zagazig" , zip code as "44598", and phone Number as "01234567890"
    And user press Continue button
    And user choose "Ground ($0.00)"
    And user press continue button 2
    And user chose  Check / Money Order
    And user press continue button 3
    And user press continue button 4
    And user press confirm button
    Then user should be navigated to "https://demo.nopcommerce.com/checkout/completed"
    And user show this message "Your order has been successfully processed!"




