Feature: Login funtionality

Scenario Outline: login scenario

Given enter the userName as <username>
And enter the password as <password>
When click on the login button
Then verify the title as crmsfa

Examples:
|username|password|
|demosalesManager|crmsfa|