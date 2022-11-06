Feature: ReduceItem

  Scenario Outline: User can reduce item
    Given User login and redirected to homepage
    When User clik buy
    And User clik cart and navigate to cart page
    Then User clik - icon for reduce item
    
   