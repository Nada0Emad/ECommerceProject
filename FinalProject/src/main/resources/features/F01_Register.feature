@Smoke
  Feature: F01_Register| user could register with new account
    Scenario: guest user could register with valid data successfully
      Given user go to register page

      When user could select gender type
      And user enter firstname "automation"and last name "tester"
      And user enter date of birth
      And user enter email "test@example.com"
      And user fills password fields "P@ssw0rd" "P@ssw0rd"
      And user clicks on register button
      Then success message will be displayed