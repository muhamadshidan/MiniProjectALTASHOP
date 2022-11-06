Feature: FilteringByProduct
 
  Scenario Outline: User can filtering by product
    Given User login and acces homepage
    When User choose an item differenty
    And User navigate to transection page
    Then User click product and click descending and ascending

    