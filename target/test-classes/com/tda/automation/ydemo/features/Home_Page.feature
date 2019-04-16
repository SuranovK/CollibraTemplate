Feature: home page search functionality

Scenario: Verify home page title
	Given User has right url
	When User typed url on browser
	Then User should be navigated home page 
Scenario: Verify search result
	Given User is home page
	When User enters search term
	And clicks the search button
	Then User should able to see search result 
