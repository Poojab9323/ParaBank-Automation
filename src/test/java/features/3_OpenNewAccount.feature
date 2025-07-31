Feature: Open New Account
Scenario: User open a savings accoutn successfully

Given User navigates to Open New Account 
When user selects savings account type
And user selects existing account to transfer funds
And user clicks on Open Account button
Then New Account should be created and confirmation displayed