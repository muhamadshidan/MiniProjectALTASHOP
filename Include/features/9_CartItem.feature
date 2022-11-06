Feature: CartItem

  Scenario Outline: User can acces cart item
    Given User Redirected to login account
    When User go to homepage
    And User click Cart button
    Then User navigate to cart page

   Examples: 
     | Email                   | Password   |
     | muhamadshidan@gmail.com | bogor12345 |