Feature: Trello LogIn
@test1
  Scenario: LogIn with correct credentials
  	Given I Open Trello Environment
    When I click in LogIn button
    And I enter correct email in email searchbox
    And I click in continue button
    And I enter correct password in password searchbox
    And I click in Log in button real
    Then I should get my trello boards page
    Then I close the browser
@test1    
  Scenario: LogIn with incorrect credentials
    Given I Open Trello Environment
    When I click in LogIn button
    And I enter incorrect email in email searchbox
    And I click in continue button
    And I enter incorrect password in password searchbox
    And I click in Log in button fake
    Then I should get LogIn error message
    Then I close the browser
@test1  
  Scenario: LogIn with Google
  	Given I Open Trello Environment
  	When I click in LogIn button
  	And I click in Continue with Google
  	Then I should be redirected to Google account authenticator page
    Then I close the browser
@test1  
  Scenario: LogIn with Microsoft
  	Given I Open Trello Environment
  	When I click in LogIn button
  	And I click in Continue with Microsoft
  	Then I should be redirected to Microsoft account authenticator page
    Then I close the browser  	
@test1  
  Scenario: LogIn with Apple
  	Given I Open Trello Environment
  	When I click in LogIn button
  	And I click in Continue with Apple
  	Then I should be redirected to Apple account authenticator page
    Then I close the browser    
@test1  
  Scenario: LogIn with Slack
  	Given I Open Trello Environment
  	When I click in LogIn button
  	And I click in Continue with Slack
  	Then I should be redirected to Slack account authenticator page
    Then I close the browser    
    
    
    
    
    