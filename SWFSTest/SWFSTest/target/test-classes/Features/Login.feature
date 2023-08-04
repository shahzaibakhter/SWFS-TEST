Feature: Login Page Test

  Scenario Outline: Verify login is successful with valid credentials
    Given browser  opens
    And user is at the login page
    When user enter <username> and <Password>
    And user click on login
    Then user is navigated to dashboard

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |


