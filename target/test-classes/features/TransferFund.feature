Feature: Transfer Funds

Scenario: Successful Transfer of Funds
Given User navigates to Transfer Funds 
When User enters amount "2000"  
And User selects from account and to account 
And User Clicks on Transfer button
Then Transfer should be successful with confirmation message 