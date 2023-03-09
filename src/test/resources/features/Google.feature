Feature: Testing Google Search

Rule: Check the search criteria of any word on Google
@Test
Scenario: As a user i enter a search criteria in Google
  Given Go throw Google
  When Searching for something
  And Click on the search button
  Then Getting results
