
Feature: Login Tests for app
  Scenario: Login using username and password
    Given  Login page is open
    When  user enters info
    Then  login should be successful
  Scenario: Enter Invalid Username and Password
    Given  Login page is open
    When  user enters invalid username and password
    Then  login should not be successful