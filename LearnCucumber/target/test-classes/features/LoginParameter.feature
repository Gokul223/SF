Feature: Leaftaps Login functionality

Scenario: Login Leaftaps with positive credential

    Given Launch the 'chrome' browser
    And Load the application url
    And Enter the username as 'demosalesmanager'
    And Enter the password as 'crmsfa'
    When Click on the login button
    Then Homepage should be displayed
    When Click on the crmsfa link 
    Then Verify the HomePage title as 'My Home | opentaps CRM'
    When Click on the leads tab
    And Click on the Create lead
    Given Enter the companyName as 'Testleaf'
    And Enter the firstName as 'Gokul'
    And Enter the lastName as 'Sekar'
    When Click on the CreateLead button
    Then Verify Lead is Created as 'View Lead | opentaps CRM'
    And Close the browser  