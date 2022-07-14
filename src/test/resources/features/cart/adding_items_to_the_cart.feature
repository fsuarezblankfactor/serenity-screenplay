Feature: Adding items to the cart
  Rule: Items added from the catalog page should appear in the cart
    Example: Colin adds some  items to his cart
      Given Colin is logged on to the application
      And he is browsing the catalog
      When he adds the following items to the cart:
      | Sauce Labs Backpack |
      | Sauce Labs Fleece Jacket |
      Then the shopping cart count should be 2
      And the items should appear in the cart
