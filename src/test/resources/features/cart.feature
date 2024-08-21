@Cart
Feature: Launching the tested web browser to login
  Background:
  Scenario Outline: Adding product to a cart

    Given Navigate to the <url> TC02v2
    When Login using username and password TC02v2
    Then Add sauce labs onesie TC02v2
    Then Navigate to cart and check out the product TC02v2
    Then Populate the required fields TC02v2

    Examples:
      | username    | password        | url |
      |  |  |     |