@login
Feature: Login page functionality

  Background:
    Given I am on the Login page

  @ignore
  Scenario Outline:lp1: As a valid user I should able to login and navigate to profile page
    And I enter email "<email>"
    And I enter password "<password>"
    When I click on the Log In submit button
    Then I expect to be on profile home page
    Examples:
      | email                | password |
      | sonali.jot@gmail.com | ******** |

  Scenario Outline:lp2: As a invalid user I shouldn't be able to login.
    And I enter email "<email>"
    And I enter password "<password>"
    When I click on the Log In submit button
    Then I expect to see an error message as "We didn't recognize that email and/or password. Need help?"
    And The Log In button is disabled
    Examples:
      | email                | password |
      | s@gmail.com          | password |
      |                      |          |
      |                      | password |
      | sonali.jot@gmail.com |          |
      | 12121212             |          |

  Scenario:lp3: Need help link must takes you Login help page
    When I click on the Need help? link
    Then I expect to be see Login Help form




