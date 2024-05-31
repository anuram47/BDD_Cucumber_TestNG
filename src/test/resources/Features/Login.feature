Feature: Login page automation of saucedemo app

  Scenario Outline: Check login is successful with valid credentials
    Given User is on login page
    When User enter the valid <username> and <password>
    And Clicks on login button
    Then User is navigate to home page
    And Close the Browser

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      
