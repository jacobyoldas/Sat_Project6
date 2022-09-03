Feature: Add New Address Functionality

  Background:
    Given User navigate to website
    When User enter valid username and password
      | yasinyoldas66@outlook.com | Yozgat-66 |
    Then User should login successfully
  @Regression
  Scenario Outline: Add new Address
    Given Click on Manage Addresses
    When Add new address with "<phone>","<address>","<city>","<stateProvince>","<zipCode>","<country>"
    Then Validate Address created successfully

    Examples:
      | phone      | address             | city     | stateProvince | zipCode | country |
      | 3457684567 | 123 Apple Rd        | Atlanta  | 4             | 30339   | AL      |
      | 2346548765 | 53 Tucker Rd        | Chicago  | 5             | 30139   | BT      |
      | 2347586906 | 23123 Cumberland Rd | New York | 6             | 33339   | CM      |