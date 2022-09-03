Feature: Add New Address Functionality

  Background:
    Given User navigate to website
    When User enter valid username and password
    Then User should login successfully

  Scenario Outline: Add new Address
    Given Click on Manage Addresses
    When Add new address with "<phone>","<address>","<city>","<stateProvince>","<zipCode>","<country>"
    Then Validate Address created successfully

    Examples:
      | phone      | address             | city     | stateProvince | zipCode | country  |
      | 3457684567 | 123 Apple Rd        | Atlanta  | Alabama       | 30339   | Andorra  |
      | 2346548765 | 53 Tucker Rd        | Chicago  | Arizona       | 30139   | Brazil   |
      | 2347586906 | 23123 Cumberland Rd | New York | Delaware      | 33339   | Colombia |