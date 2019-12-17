Feature: Belly

  Scenario Outline: a few cukes
    Given I have "<number>" cukes in my belly cukes in my belly
    When I wait "<hours>" hour
    Then my belly should growl
    Then I have to visit "<where_to_go>" asap
    Examples:
      | number | hours | where_to_go |
      |   12   |   3   |    WC       |
      |   7    |   2   |    Kitchen  |
      |   123  |   12  |    Doctor   |
