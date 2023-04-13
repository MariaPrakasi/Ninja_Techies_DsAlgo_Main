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
@Graph
Feature: Graph

  
#Given The user opens DS Algo portal link
#When The user clicks the Get Started button
#Then The user should be redirected to homepage
#When The user clicks Sign In
#Given The user is on the SignIn page
#When The user fills the form with the data from sheet '<WorkSheetName>' and clicks LoginButton
#Then The user sign in successfully 

  Scenario: Graph page validation
    
    When User clicks on Getstarted button under Graph
   
    When User clicks on Graph
    When User clicks on Try here under Graphpagevalidation
     When User enters the pythonCode of Graphpagevalidation
   And clicks on Run button of Graphpagevalidation
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
   
     
  Scenario: GraphRepresentations
 
  When User clicks on Getstarted button under Graph 
     When  User clicks on GraphRepresentations
    Then User clicks on Try here under GraphRepresentations
    When User enters the pythonCode of GraphRepresentations
  Then clicks on Run button of GraphRepresentations
   Then user is navigated to Graph_home page "https://dsportalapp.herokuapp.com/home"
  #Then user click on Sign Out 

  

  
    

  

  