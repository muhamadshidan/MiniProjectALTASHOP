Feature: BuyItem

  Scenario Outline: User can buy item
    Given User login account
    When User click buy button
    Then User navigate to buy page

Examples: 
     | Email                   | Password   |
     | muhamadshidan@gmail.com | bogor12345 |