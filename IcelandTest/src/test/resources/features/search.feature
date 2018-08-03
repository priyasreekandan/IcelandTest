@search
Feature: Search

Scenario: Search with Valid Data as a Guest User
Given Guest User is on HomePage
And Guest User close the pop up window
And Guest User click on the SearchTextBox
When Guest User enter valid SearchTerm
And Guest User click on SearchButton
Then the valid product should be display on the PLP

Scenario: validate the  autosearch functionality with valid first three characters
Given Guest User is on HomePage
And Guest User close the pop up window
And Guest User click on the SearchTextBox
When Guest User enter valid first three characters in SearchTextBox
Then Guest User can able to see the autosearch options
#And Guest User click on SearchButton
#Then the valid product should be display on the PLP


