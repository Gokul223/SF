Feature: Leaftaps Login functionality

Scenario: Login Leaftaps with positive credential

    Given Launch the browser
    Given Load the application url
    Given Enter the username as DemoSalesManager
    Given Enter the password as crmsfa
    When Click on the login button
    Then Homepage should be displayed