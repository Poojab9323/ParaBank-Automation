Feature: ParaBank Login

Scenario: Successful Login with Valid credentials
Given User is on Login Page
Given User enters username and password
And User clicks on Login button
Then User should be redirected to Account Overview Page
