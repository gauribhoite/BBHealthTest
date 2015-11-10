Feature: Login Test

  Background:
    Given I am on login screen of babylon app

  Scenario: User can login with valid user name and password
    Given As a new user I click on Sign up button on loginscreen
    When I enter details like <email> and <password> on the Sign up screen
    Then I am successfully registered as a new user

    Examples:
	    | email 					|  password | 
	    | gauri.rb27@gmail.com 		|  password1234 |
	    | gauri.rb27+1@gmail.com 	|  babylontest456789090812 |        
	    | gauri+bhoite@gmail.com 	|  123 |    
	    | bhoite@yahoo.com			|  &09*3#% |
	    | gauri						|  &09*3#% |    
	    

