Feature:  LogIn Action Test //otodom.pl
  Description: This feature will test a LogIn and LogOut functionality

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters Credentials and LogIn
    |tester1@onet.com.pl|Qwerty1|
    Then Message displayed Login Successfully
    When User LogOut from the Application
    Then Message displayed LogOut Successfully

