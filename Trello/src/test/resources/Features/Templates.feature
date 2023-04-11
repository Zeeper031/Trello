Feature: Trello Templates
@test2
  Scenario: Validating create each Main Template
    Given I Open Trello Environment
    When I click in LogIn button
    And I enter correct email in email searchbox
    And I click in continue button
    And I enter correct password in password searchbox
    And I click in Log in button real
    
    
    Then I click on each main tamplete, and I validate if new board was created successfully
    