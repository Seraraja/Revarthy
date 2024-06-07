@login
Feature: To validate login functionlity of facebook application

@smoke @regression

Scenario: To validate login function with invalid credential
Given User navigate to the facebook application
When User enter username "sera" and password "9898"
And User click login button
Then User navigate to invalid page

@sanity @regression
Scenario: To validate login function with valid credential
Given User navigate to the facebook application
When User enter username "raja" and password "1234"
And User click login button
Then User navigate to invalid page
