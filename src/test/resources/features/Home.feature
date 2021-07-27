@home
Feature: Home page functionality

  Background:
    Given I am on the Home page
  
  @navigateLogin
  Scenario:hp1: Navigate to hudl login page
    When I click on the Log In button
    Then I expect to be on the login page
