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
@tag
Feature: Datadriven testing form
  

  @tag1
  Scenario Outline: Title of your scenario outline
    Given User Opens the Chrome browser and navigate to form website 
    When User Enters "<Firstname>", "<Lastname>", "<Email>" 
    And User Enters "<ContactNumber>", "<Message>"
    And Users clicked on Submit button
    Then All the data entered successfully

    Examples: 
      | Firstname  | Lastname | Email 					 | ContactNumber  | Message 				 |
      | Vijay    	 | R        | abc123@gmail.com | 9876543210 	  | Hello im Vijay   |
      | Harshad    | R        | def123@gmail.com | 9999999999 	  | Hello im harshad |
      | Vishal     | R        | ghi123@gmail.com | 8888888888 	  | Hello im Vishal  |
      | Sai				 | J        | jkl123@gmail.com | 7777777777 	  | Hello im Sai     |
      | @#$ 		   | J        | mno123%gmail.com | rome@gmail.com | 97459279         |
     