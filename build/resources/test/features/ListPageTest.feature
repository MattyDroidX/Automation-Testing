Feature: I can find a city inside the state.

@List
Scenario Outline: As a Test Engineer, I want to validate that a text is present inside a list.
  When I search <state> in the list
  Then I can find <city> in the list

  Examples:
  |   state    |        city         |
  | Washington | Seattle, Washington |
  | Chicago    | Chicago, Illinois   |