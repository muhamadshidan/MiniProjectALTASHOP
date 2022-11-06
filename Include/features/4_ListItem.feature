Feature: ListItem
  
  Scenario Outline: User can see list item
    Given User register account
    When user navigate to homepage
    Then user can see list item

    | Email                   | Password   |
    | muhamadshidan@gmail.com | bogor12345 |