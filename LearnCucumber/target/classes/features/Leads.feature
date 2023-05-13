Feature: Lead funtionality

Scenario Outline: leads tab scenario

Given enter the userName as <username>
And enter the password as <password>
When click on the login button
Then verify the title as crmsfa
When click on the crmsfa link
Then verify the title as welcomePage
When click on the leads tab

Examples:
|username|password|
|demosalesManager|crmsfa|