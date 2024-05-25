Feature: Watchlist 
  I want to add and remove watchlist

  Background: 
    Given user is logged in with valid credentials
   

  @endpoint
  Scenario: Add Watchlist
    When user clicks on search box
    And user enters "Canada"
    And user clicks on star icon
    And user clicks on search button
    And user enters "USA"
    And user clicks on star icon
    Then validate that watchlist include USA and Canada
    
    
    @endpoint
  Scenario: Remove Watchlist
    When user clicks on search box
    And user enters "Canada"
    And user clicks on star icon
    Then validate that Canada removed from watchlist
    And validate that USA still on the watchlist page
    
    
    @endpoint
  Scenario: Validate Watchlist
    When user navigates to article page from watchlist page
    Then validate that title matches
   
    
    
    