Feature:  LogIn Action Test //otodom.pl
  Description: This feature will test a LogIn and LogOut functionality

  Scenario Outline: Successful Login with Valid Credentials
    Given User is on HP
    When User Navigate to LogIn_Page
    And User enters "<username>" and "<password>"
    Then Message displayed Login Successfully
    When User LogOut from the Application
    Then Message displayed LogOut Successfully

    Examples:
      |username|password|
      |tester1@onet.com.pl|Qwerty1|
      |krzysiekcabaj@gmail.com|kajman|

