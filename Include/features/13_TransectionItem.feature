Feature: TransectionItem
  
  Scenario Outline: User can check transection item
    Given User login and redirected homepage
    When User can buy item and navigate to cart item
    And User click Pay icon
    Then User redirected to transection page

    