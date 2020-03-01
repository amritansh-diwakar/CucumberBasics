Feature: Learning Cucumber with Selenium

  Scenario: Login
    Given I navigate to login page
    When I enter username and password
      | username | password      |
      | admin    | adminpassword |
    And Click Submit
    Then Login is successful
