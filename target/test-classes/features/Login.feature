Feature: Login Functionality

  @endpoint
  Scenario: Valid Login
    #Given I navigated to the Wikipedia Login page
    When I enter a valid username
    And I enter a valid password
    And I click on the login button
    Then I validate that I am logged in
    #And I will quit the browser
