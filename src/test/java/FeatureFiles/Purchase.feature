Feature: Purchase Functionality

  Background:
    Given User navigate to website
    When User enter valid username and password
      | yasinyoldas66@outlook.com | Yozgat-66 |
    Then User should login successfully
  @SmokeTest   @Regression
  Scenario: Purchase an item
    Given Select any product and complete checkout process
    Then  Validate you successfully purchase product