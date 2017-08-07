Feature: Signing in
  Description: User is able to log in to application using credentials

  Scenario: User log in to application
    Given User in on Home Page
    When user goes to login page
    And user enters credentials
    Then user will be logged in to app