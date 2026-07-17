#encoding: iso-8859-1
################################################
########## Scenarios: Automations Tests ################
################################################
@API_AllTests
Feature: Automation Tests Scenarios API

  @001_API_APITestsError
  Scenario: Realizo um GET para o endpoint de usuarios error
    When Realizo um GET para o endpoint de usuarios status 200 error

  @002_API_APITestsRight
  Scenario: Realizo um GET para o endpoint de usuarios right
    When Realizo um GET para o endpoint de usuarios status 401 right