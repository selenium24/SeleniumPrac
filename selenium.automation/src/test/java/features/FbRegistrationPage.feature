@Reg
Feature: Registration for Facebook Application

 @Reg_01
  Scenario Outline: Register with valid details
    Given user navigate to Url
    When Enter username "<username>"
    And Enter new password "<password>"
    And Enter Date of birth
    And Enter Firstname "<firstname>"
    And Enter Surname "<surname>"
    And Select gender
    And Click on Signin button
    Then User should register successfully

    Examples: 
      | username        | password | firstname  | surname   |
      | abcd1@gmail.com |    12345 | Prashanthi | Kancharla |
