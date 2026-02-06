
Feature: SchedulePanelInterview_positi @feature_user_login

  Background: 
    Given the recruiter is on the Schedule Interview section

  @valid-schedule-interview
  Scenario Outline: Schedule Panel Interview
    When the recruiter clicks on Create Interview
    And the recruiter selects a Job Opening from the dropdown
    And the recruiter selects a Location from the available options
    And the recruiter enters the Candidate's email address "<candidate_email>" and selects the candidate
    And the recruiter chooses the Panel Interview option
    And the recruiter selects the interview Date "<interview_date>" and Start Time "<start_time>"
    And the recruiter selects Attendees "<attendees>" and Interview Round "<interview_round>"
    And the recruiter selects the Interview Provider "<interview_provider>"
    And the recruiter clicks on Next
    And the recruiter attaches required files "<required_files>"
    And the recruiter clicks on Confirm and Send
    Then the system navigates to the interview summary page
    And a confirmation message appears indicating the interview is scheduled
    And notifications are sent to all selected participants
    And the scheduled interview appears in the interview calendar
    And the interview details are correctly displayed in the system
    And the candidate receives an email notification with interview details

  Examples:
    | candidate_email        | interview_date | start_time | attendees            | interview_round | interview_provider | required_files |
    | candidate@example.com  | 2023-10-15     | 10:00 AM   | attendee@example.com  | Round 1        | Provider Name      | file.pdf       |

  @valid-scheduling
  Scenario Outline: Schedule Panel Interview
    When the recruiter clicks on Create Interview
    And the recruiter selects a Job Opening from the dropdown
    And the recruiter selects a Location from the available options
    And the recruiter enters the Candidate's email address "<candidate_email>" and selects the candidate
    And the recruiter chooses the Panel Interview option
    And the recruiter selects the interview Date and Start Time
    And the recruiter selects Attendees and Interview Round
    And the recruiter selects the Interview Provider
    And the recruiter fills in optional fields "<interview_notes>" and "<special_instructions>"
    And the recruiter clicks on Next
    And the recruiter attaches required files
    And the recruiter clicks on Confirm and Send
    Then the system navigates to the interview summary page
    And a confirmation message appears indicating the interview is scheduled
    And all optional information is correctly displayed in the interview details
    And notifications are sent to all selected participants
    And the scheduled interview appears in the interview calendar
    And the candidate receives an email notification with interview details

  Examples:
    | candidate_email        | interview_notes            | special_instructions       |
    | candidate@example.com  | Interview notes: a * 100  | Special instructions: a * 100 |

@edit-panel-interview
Scenario Outline: Schedule Panel Interview
  When the user selects the scheduled panel interview to edit
  And the user clicks on Edit
  And the user changes the Date and Time of the interview
  And the user adds or removes Attendees
  And the user clicks on Save Changes
  Then the system saves the changes successfully
  And a confirmation message appears indicating the interview has been updated
  And notifications are sent to all updated participants
  And the updated interview details are displayed in the interview calendar

Examples:
  | Date and Time       | Attendees          |
  | <date_time>        | <attendees>       |

  @panel-interview-notification
  Scenario Outline: Schedule Panel Interview
    When I schedule a panel interview with multiple attendees
    And I complete the scheduling process
    Then each attendee should receive an email notification with the interview details
    And the email should contain the correct Date, Time, and Location of the interview
    And the email should include a calendar invite for the interview

  Examples:
    | attendees |
    | attendee1 |
    | attendee2 |
    | attendee3 |

@cancel-interview
Scenario Outline: Schedule Panel Interview
  When the recruiter selects the scheduled panel interview to cancel
  And the recruiter clicks on Cancel
  And the recruiter confirms the cancellation
  Then the system cancels the interview successfully
  And a confirmation message appears indicating the interview has been canceled
  And notifications are sent to all participants informing them of the cancellation
  And the canceled interview no longer appears in the interview calendar

Examples:
  |   |
  |   |

  @view-scheduled-interviews
  Scenario Outline: Schedule Panel Interview
    When the user navigates to the Interview Calendar section
    Then all scheduled panel interviews are displayed in the calendar
    And each interview shows the correct Date, Time, and Attendees
    And the user can click on an interview to view detailed information

  Examples:
    |  |
    |  |
