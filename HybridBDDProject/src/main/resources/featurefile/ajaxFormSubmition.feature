Feature: Test collection for Ajax form Submission

  Scenario Outline: Test Ajax form Submission
    Given User is on the Base Page
    When User navigets to Ajax form submission
    And checks that the Ajax Form Submit with Loading icon heading is getting displayed
    And User provides the <name> and <comment> field values
    And Clicks on the Sumbit button
    Then Form submited Successfully message should be visible

    Examples: 
      | name     | comment     |
      | Debasish | TestMessage |

  Scenario Outline: Test Ajax form Submission from Excel data Source
    Given User is on the Base Page
    When User navigets to Ajax form submission
    And checks that the Ajax Form Submit with Loading icon heading is getting displayed
    And User provides the Form Data from Sheet "<SheetName>" and RowNumber <rowNumber>
    And Clicks on the Sumbit button
    Then Form submited Successfully message should be visible

    Examples: 
      | SheetName     | rowNumber |
      | SampleBDDData |         3 |
