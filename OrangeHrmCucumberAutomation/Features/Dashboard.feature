



Feature: Dashboard elements validation

  
  Scenario: Verify quick launch menu options on dashboard
    Given user successfuly login to orange crm
    And user redirect to the dashboard
    Then quicklaunch <menu options> available to user
    
    #example
    |menu options|
    |Assign Leave|
    |Leave List|
    |Timesheets|
    |Apply Leave|
    |My Leave|
    |My Timesheet|
   