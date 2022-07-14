Feature: Login

  Rule: Customers need to provide valid credentials to access the product catalog

    Example: Colin log in with valid credentials
      Given Colin is on the login page
      When Colin logs in with valid credentials
      Then he should be presented with the product catalog