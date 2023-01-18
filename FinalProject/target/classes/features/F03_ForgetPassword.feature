@Smoke
Feature: F03_ForgetPassword| users could use forget password to reset password
  Scenario: user could login with valid email and forget password
    Given user could go to login page

    When user login with valid "test@example.com"
    And user press on forget password?
    And user enter email "test@example.com" again
    Then user show message that email is sent to his/her email