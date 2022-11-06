Feature: FilteringByPrice

  Scenario Outline: User can filtering item by price
    Given User login and going to homepage
    When User choose item differenty price
    And User redirecting to transection page
    Then User click Price and click descending and ascending icon

    