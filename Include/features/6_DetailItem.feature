Feature: DetailItem
  
  Scenario Outline: User can see detail item
    Given User login to account
    When User redirected to homepage
    And User click detail button
    Then User navigate to detail page

    Examples: 
     | Email                   | Password   |
     | muhamadshidan@gmail.com | bogor12345 |