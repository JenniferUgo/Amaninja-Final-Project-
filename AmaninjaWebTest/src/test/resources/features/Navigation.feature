Feature: Website navigations
  Scenario: As a user I want to make sure navigation work as expected
    Given User is on AnaNinja Home Page "https://amaninja.co.uk"
    Then clicking each tab navigates to correct URL
      |Home| https://amaninja.co.uk|
      |Shop|https://amaninja.co.uk/collections/all|
      |Contact| https://amaninja.co.uk/pages/contact|
      |About Us| https://amaninja.co.uk/pages/about-us|

  Scenario: As a User I want to navigate to correct tab when selected a product
    Given User is on AnaNinja Home Page "https://amaninja.co.uk"
    Then Clicking on a product navigates User to "products" pages
    And Clicking on "Choose Option" shows a dialog
    And Clicking "Add to Cart" shows message "Item added to your cart"
    Then User Exits