Feature: RatingItem

  Scenario Outline: User can rating item
    Given User login account
    When User click star button
    Then User have rating item

Examples: 
     | Email                   | Password   |
     | muhamadshidan@gmail.com | bogor12345 |