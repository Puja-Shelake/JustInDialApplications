@All
Feature: Just Dial Application User stories Journeys

  ##############Login Related Test Cases #################
  Background: 
    Given User navigates to the application url

  @Smoke
  Scenario: 1. User is able to Sign up in the application
    When User clicks on Sign up link at the top right corner of the application
    And User enters name as "Pooja" and Phone number as "9370142439" and clicks on Submit Button
    Then User is displayed with the message as "OTP is sent on number"

  @Regression
  Scenario: 2. User receives an error message when tries to enter incorrect mobile number in the Login pop up
    When User clicks on Login-in link at the top right corner of the application
    And User enters name as "Pooja" and Phone number as "1234567890" and clicks on Submit Button
    Then User gets error message as "Please Enter valid Mobile number!"

  @Sanity
  Scenario: 3. User receives an error message when tries to enter incorrect name in the Login pop up
    When User clicks on Login-in link at the top right corner of the application
    And User do not enter any name and phone number but clicks on Submit Button
    Then User gets error message as "Please enter a valid name !!"

  @Mobile
  Scenario: 4. User is able to enter only 10 digits in the Mobile Text box
    When User clicks on Login-in link at the top right corner of the application
    Then User is able to enter only "10" digits in the Mobile text field

  @Restaurants
  Scenario: 5. User is able to search the Application
    When User enters "Restaurants" in search text box
    And User clicks search button
    Then User is able to see search result related to "Restaurants"

  @Search_Resta
  Scenario: 6. User is able to see the drop down when he keys in the text in the search box
    When User enters "resta" in search text box
    Then User is able to see the drop down under search text box with all the items with text "resta"

  @Menu
  Scenario Outline: 7. User is able to navigate to left side menu links to navigate to various categories
    When User clicks on "<SIDE_MENU_LINK_NAME>"
    Then User is navigates to the corresponding link realted to "<SIDE_MENU_LINK_NAME>"

    Examples: 
      | SIDE_MENU_LINK_NAME |
      | Baby Care           |
      | Bus                 |
      | Medical             |
      | Real Estate         |
      | Travel              |
      | Wedding             |

  @Datatable
  Scenario: DataTable
    Given User Navigate to the URL
    When Fill form using below data
      | Pooja  | Shelake | Pujashelke@gmail.com  |
      | Shamal | Davane  | ShamalDavane@gmai.com |
