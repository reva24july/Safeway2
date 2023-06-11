Feature:  Second Product adding

 @sanity
  Scenario: Adding a Second Product
    Given User is on the product page
    When  Search  for the second product
    And   Select the second product
    Then  click on the "Add to Cart" button for the second product
    Then  should see both products in the shopping cart
   
