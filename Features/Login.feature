
Feature: signing in with valid credentials 
 

  @sanity
  Scenario Outline:Successful login with valid credentials
    Given Launching the browser
    When Navigate to signin menu
    And Click signin option
    And Enter "<username>" and "<password>"
    And click login 
    Then  user navigates to account page

     Examples: 
      | username | password | 
      | reva24july@gmail.com |   Temp@123 | 
    
 
    