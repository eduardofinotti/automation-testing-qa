@send-email
Feature: Send E-mail

  @send-email-success
  Scenario: Send e-mail success
    Given I am on send e-mail page
    And fill out the form Vehicle Data
    And fill out the form Insurant Data
    And fill out the form Product Data
    And fill out the form Price Option
    And fill out the form Send Quote
    When send the form
    Then see "Sending e-mail success!" on the screen
