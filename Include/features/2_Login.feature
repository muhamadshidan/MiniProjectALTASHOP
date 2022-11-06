Feature: Login
  
  Scenario Outline: User Login Account
    Given user set POST endpoint
    When User set parameter fullname <fullname> email <email> and password <password>
    And user send POST HTTP method
    And user receive valid HTTP response code 200
    Then user receive valid data for new account
    Examples: 
      | Email                   | Password   |
      | testsatu@gmail.com      | 12345wewe  |
      | muhamadshidan@gmail.com |            |
      |                         | bogor12345 |
      |                         |            |
      | muhamadshidan@gmail.com | bogor12345 |
     