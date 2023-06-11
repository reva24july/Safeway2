
Feature:Adding an item to cart
  

  @sanity
  Scenario: Add item to cart
    Given  logged in on the Safeway website
    When  search for an item "<milk>"
    And click on the first search result
    And click the add to cart  button
    Then  item should be added to my cart
  

 
