Feature: Login Luma Functionality

  Scenario Outline: Login with valid username and password as positive test
    Given User navigate to website
    When User enter valid "<email>" and "<password>"
    Then User should login successfully

    Examples:
      | email                     | password  |
      | yasinyoldas66@outlook.com | Yozgat-66 |

  Scenario Outline: Login with invalid username or password as negative test
    Given User navigate to website
    When User enter invalid "<email>" or invalid "<password>"
    Then User should NOT login and receive error message

    Examples:
      | email                     | password   |
      | yasinyoldas66@outlook.com | #1234hello |
      | apple@gmail.sad           | Yozgat-66  |
      | bee@grer.com              | chelsea    |

