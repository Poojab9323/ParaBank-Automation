Feature: ParaBank Register

Scenario: Successful Registration of new User
Given User is on Login Page
When User clicks on Register link
And User enters all the required information 
And User clicks on Register button
Then User should be see registration confirmation