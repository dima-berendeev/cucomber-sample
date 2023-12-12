Feature: What is on wiki page
  Everybody wants to know what is on wiki the web page

  Scenario: Page title is correct
    Given Page is wiki
    Then the page header is "Wiki"

  Scenario: Page title is correct
    Given Page is wiki
    Then the page header is "Wiki - wrong"

