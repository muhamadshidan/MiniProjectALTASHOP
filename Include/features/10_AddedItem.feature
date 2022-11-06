Feature: AddedItem

  Scenario Outline: User can added item
    Given User login and navigate to homepage
    When User click buy icon
    And User click cart and navigate to cart page
    Then User click + button for added item

    