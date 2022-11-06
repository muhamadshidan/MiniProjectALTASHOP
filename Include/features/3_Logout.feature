Feature: Logout 

  Scenario Outline: User logout account
    Given User navigate to homepage
    When User click people button
    Then User click logout button

Examples: 
      | Email                   | Password   |
      | muhamadshidan@gmail.com | bogor12345 |