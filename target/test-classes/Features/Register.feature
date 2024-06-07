@register
Feature: To validate login functionlity of facebook application

@regression
Scenario: To validate register function with invalid credential
Given User navigate to the facebook application
When User click create button
And User enter firstname and lastname
And User click signup button
Then User successfully registered

@retest
Scenario: To validate register function with valid credential
Given User navigate to the facebook application
When User click create button
And User enter firstname and lastname
And User click signup button
Then User successfully registered
