#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@HomePage
Feature: HomePage

Scenario: User launch home page of an dsalgo project
Given The user opens DS Algo portal link
When The user clicks the Get Started button
Then The user should be redirected to homepage

Scenario: User is on Home page and click on sign in
Given The user opens Home Page
When The user clicks Sign In
Then The user should be redirected to Sign in page

Scenario:  User is on Home page and click on Register
Given The user opens Home Page
When The user clicks Register
Then The user should be redirected to Register form