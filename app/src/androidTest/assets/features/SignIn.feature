Feature: Sign In with Email Test

  Scenario: Registered User Sign In
    Given I am on SignIn screen using email
    When I enter <email> and <password> details
    Then I am om babylon homescreen

    Examples:
	    | email 					|  password | 
	    | gauri.rb27@gmail.com 		|  password1234 |
	    | gauri.rb27+1@gmail.com 	|  babylontest456789090812 |   