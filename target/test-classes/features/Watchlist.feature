Feature: Watchlist
  I want to add and remove watchlist and validate

  Background: 
    Given user is logged in with valid credentials

  @endpoint
  Scenario: Add Watchlist
    When user clicks on search box
    And user enters first "Canada"
    And user clicks on search button
    And user clicks on star icon
    And user clicks on search box
    And user enters second "USA"
    And user clicks on search button
    And user clicks on star icon
    And user clicks on watchlist icon
    And user clicks on View and Edit Watchlist
    Then validate that watchlist include USA and Canada

  @endpoint
  Scenario: Remove Watchlist
    When user clicks on search box
    And user enters first "Canada"
    And user clicks on search button
    And user clicks on star icon to remove
    And user clicks on watchlist icon
    And user clicks on View and Edit Watchlist
    Then validate that Canada removed from watchlist
    And validate that USA still on the watchlist page
    And user clicks on article
    Then validate that title matches
