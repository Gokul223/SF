Feature: Leaftaps Login functionality

Scenario Outline: Login Leaftaps with positive credential

    Given Launch the <browser> browser
    And Load the application url
    And Enter the username as <username>
    And Enter the password as <password>
    When Click on the login button
    Then Homepage should be displayed
    When Click on the crmsfa link 
    Then Verify the HomePage title as 'My Home | opentaps CRM'
    When Click on the leads tab
    And Click on the Create lead
    Given Enter the companyName as <cname>
    And Enter the firstName as <fname>
    And Enter the lastName as <lname>
    When Click on the CreateLead button
    Then Verify Lead is Created as 'View Lead | opentaps CRM'
    And Close the browser  
    
Examples:
|browser|username|password|cname|fname|lname|
|'chrome'|'demosalesmanager'|'crmsfa'|'Testleaf'|'Gokul'|'Sekar'|
|'chrome'|'DemoCSR'|'crmsfa'|'QEagle'|'Raghu'|'Ganeshan'|
|'edge'|'demosalesmanager'|'crmsfa'|'Testleaf'|'Gokul'|'Sekar'|
|'edge'|'DemoCSR'|'crmsfa'|'QEagle'|'Raghu'|'Ganeshan'|
    
    
Scenario: Login Leaftaps with negative credential

    Given Launch the 'chrome' browser
    And Load the application url
    And Enter the username as 'demosalesmanager'
    And Enter the password as 'crmsfa'
    When Click on the login button
    Then Homepage should be displayed