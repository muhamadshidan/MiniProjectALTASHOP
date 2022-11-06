Feature: PayItem

  Scenario Outline: User can pay item
    Given User login navigate to homepage and choose item
    When User navigate to cart and can added or reduce item
    Then User click Pay button

  