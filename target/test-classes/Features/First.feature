Feature: This feature tests the Signup Functionality of the ijmeet application


Background:
	// Given Chrome browser should be opened and user is an signup page
	
	//why background using ...Becouse one class all test cases are background file are execute 

Scenario: Vefity if application accepts black full name 
	
	Given Chrome browser should be opened and user is an signup page
	
	When user leaves full name empty and clicks on Signup button
	
	Then user should see an error message 