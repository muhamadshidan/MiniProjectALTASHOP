Feature: SearchBar

  Scenario Outline: User can use search bar
    Given User Login account
    When User click Search Bar
    And User click item name
    Then User navigate to item page

	Examples:
   | Email                   | Password   |
   | muhamadshidan@gmail.com | bogor12345 |