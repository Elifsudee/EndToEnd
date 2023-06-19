
@create_room @api
Feature: Create Room By Api

  Scenario: TC01_Create_Room

    Given send post request creating room
    Then get the response and validate
