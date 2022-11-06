Feature: Register
  
  Scenario Outline: Register
    Given I set POST endpoint
    When I set body parameter fullname <fullname> email <email> and password <password>
    And I send POST HTTP method
    And I receive valid HTTP response code 200
    Then I receive valid data for new account

    Examples: 
      | Nama Lengkap  | Email                   | Password   |
      | testsatudua   | testsatudua@gmail.com   | bogor12345 |
      |               | muhamadshidan@gmail.com | bogor12345 |
      | Muhamadshidan |                         | bogor12345 |
      | Muhamadshidan | muhamadshidan@gmail.com |            |
      | Muhamadshidan |                         |            |
      |               | muhamadshidan@gmail.com |            |
      |               |                         | bogor12345 |
      |               |                         |            |
      | Muhamadshidan | muhamadshidan@gmail.com | bogor12345 |
      