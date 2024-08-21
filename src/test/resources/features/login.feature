@OrderOnesie
  Feature: Launching the tested web broweser to login
    Background:
      Scenario : Verifying that user can log on to an online store, add a product to cart, check out and view payment information

        Given Navigate to url TC01v2
        When Login using username as standarduser and password as secretsauce TC01v2
        And Add Sauce Labs Onesie to the cart TC01v2
        And Navigate to Cart and checkout the product TC01v2
        And Enter first name last name postal code and click Continue TC01v2
        Then Read SauceCard number under Payment Information and print it in console TC01v2

