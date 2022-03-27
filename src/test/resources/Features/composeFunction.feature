Feature: Compose Function in gmail
description: the purpose is to automate the compose functionality

Scenario: User is login and sending the mail

	Given User is at sign-in page
	When user provides the credentials and clicks on next
	And user clicks on compose button
	And enters the email id of receiver person
	And enters the subject and email body
	And clicks on sent button
	And user closes the browser