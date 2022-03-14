Feature: Search and Place the Order for Products

  Scenario: Search Experience for Product search in home and offers page
    When user searched a product with shortname "greenCartHome" and extracted the actual product
    Then user searched a product with the same shortname in offers page to check if product exist