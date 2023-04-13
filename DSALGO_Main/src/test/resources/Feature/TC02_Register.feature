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
@RegisterPage
Feature: RegisterPage

Background: User launch home page of an dsalgo project
Given The user opens DS Algo portal link
When The user clicks the Get Started button
Then The user should be redirected to homepage
When The user clicks Register

Scenario Outline: Validating Register Functionality

Given The user is on the Register page
When The user fills the form '<UserName>' '<Password>'  '<PasswordConfirmation>' 
Then The user clicks RegisterButton
Examples:
|UserName|Password|PasswordConfirmation|
|null    |null    |Siva@1234|
|SivaShan|DsAlgo@123|DsAlgo@123|
|DianaWill|PeterJack@123|PeterJack@123|
|RajPatel|TestNg@123 |TestNg@123|