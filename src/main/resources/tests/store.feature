Feature: feature

  Scenario: Buy bag in the store
    Given open application
    And user enters "standard_user" username
    And user enters "secret_sauce" password
    And user clicks on Login Button
    And user adds the bag to the cart
    And navigates to cart
    And the bag is in the cart
    And user clicks on checkout
    And fills in the form
    And clicks continue
    And checks delivery is free
    And clicks finish
    Then success message is displayed



