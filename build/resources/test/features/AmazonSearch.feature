@Test
Feature: Test Amazon search functionality

  @Cart
  Scenario Outline: As a costumer when i search for Alexa, i want to see if the third option on the second page is available
    for purchase and can be added to the cart.
    Given the user navigate to www.amazon.com
    And Searches for <Product>
    And Navigate to the page number 2
    And Selects the third item
    Then the user would be able to add it to the cart

    Examples:
      | Product     |
      |  Alexa      |
      | Playstation |