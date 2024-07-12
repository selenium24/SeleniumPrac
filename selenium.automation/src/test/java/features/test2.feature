
@insta
Feature: Title of your feature
  I want to use this template for my feature file

  @insta1
  Scenario Outline: instagram login page
    Given navigate to instagram login page 
    When I check for the username "<username>" 
    And I check for password "<password>"
    Then I verify the login status "<status>" 

    Examples: 
      | username  | password | status  |
      | minnie    |     5    | success |
      | kitty     |     7    | Fail    |
