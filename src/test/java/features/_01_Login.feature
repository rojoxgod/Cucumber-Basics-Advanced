Feature: Application login

  #prerequisited code, running only once for the feature where it's declared
  Background:
    Given validate the browser
    When browser is triggered
    Then check if browser appeared


  @RegressionTest @SmokeTest
  Scenario: Homepage default login

    Given user is on Banking landing page
    When user login into app with username "Rick" and password "000"
    Then homepage is populated
    And cards displayed "true"

  @SmokeTest
  Scenario: Homepage default login

    Given user is on Banking landing page
    When user login into app with username "John" and password "123"
    Then homepage is populated
    And cards displayed "false"


  Scenario: Homepage default login

    Given user is on Banking landing page
    When user sign up with following details
      | Willy | 0000 | willy@gmail.com | Italy | 3932123456 |
    Then homepage is populated
    And cards displayed "false"

  @SmokeTest
  Scenario Outline: Homepage default login

    Given user is on Banking landing page
    When user login into application with username <username> and password <password>
    Then homepage is populated
    And cards displayed "false"

    Examples:
      | username | password |
      | user1    | 1111     |
      | user2    | 2222     |
      | user3    | 3333     |
      | user4    | 4444     |

