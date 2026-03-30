Feature: SauceDemo ordering from database

  Scenario: First user places order from database
    Given user data exists in database
    When the user logs in with credentials from database
    And adds products from database
    And proceeds to checkout
    Then the order is completed successfully