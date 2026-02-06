
Feature: CreateJobOpening_positive @feature_create_job_opening

Background: 
  Given the recruiter is on the Dashboard

@successful_navigation
Scenario Outline: Create Job Opening
  When the recruiter clicks on the "<job_opening_option>" option in the side navigation
  Then the Job Opening screen should be displayed
  And the "<add_job_opening_button>" button should be visible

Examples:
  | job_opening_option     | add_job_opening_button |
  | Job Opening            | Add Job Opening        |

@feature_create_job_opening
@open_job_opening_form
Scenario Outline: Create Job Opening
  When the recruiter clicks on the "Add Job Opening" button
  Then the Create New Job Opening form should be opened
  And the "Save" and "Cancel" buttons should be displayed

Examples:
  | action                       |
  | Add Job Opening              |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects the Job Role as "<job_role>"
    And the recruiter selects the Location as "<location>"
    And the recruiter enters the Minimum Experience as "<min_experience>"
    And the recruiter enters the Maximum Experience as "<max_experience>"
    And the recruiter enters the Qualification as "<qualification>"
    And the recruiter enters the Short Job Description as "<short_job_description>"
    And the recruiter enters the Responsibilities as "<responsibilities>"
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

  Examples:
    | job_role          | location   | min_experience | max_experience | qualification        | short_job_description | responsibilities     |
    | Software Engineer  | New York   | 2              | 5              | Bachelor's Degree     | a * 100              | a * 100             |

  @feature_create_job_opening
  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects a Job Role
    And the recruiter selects a Location
    And the recruiter enters Minimum Experience
    And the recruiter leaves Maximum Experience blank
    And the recruiter enters Qualification
    And the recruiter enters Short Job Description
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | Job Role          | Location   | Minimum Experience | Maximum Experience | Qualification       | Short Job Description                                      |
      | Software Engineer  | New York   | 2                  |                    | Bachelor's Degree    | This is a short job description that outlines the responsibilities and requirements of the position. |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects the Job Role "<job_role>"
  And the recruiter selects the Location "<location>"
  And the recruiter enters Minimum Experience "<min_experience>"
  And the recruiter enters Maximum Experience "<max_experience>"
  And the recruiter selects Employment Type "<employment_type>"
  And the recruiter selects Work Mode "<work_mode>"
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

Examples:
  | job_role         | location   | min_experience | max_experience | employment_type | work_mode |
  | Software Engineer | New York   | 2              | 5              | Full-time       | Remote    |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects the Job Role <job_role>
    And the recruiter selects the Location <location>
    And the recruiter enters Minimum Experience <min_experience>
    And the recruiter enters Maximum Experience <max_experience>
    And the recruiter enters Tags <tags>
    And the recruiter selects the Vendor <vendor>
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

  Examples:
    | job_role          | location   | min_experience | max_experience | tags          | vendor     |
    | Software Engineer  | New York   | 2              | 5              | Urgent, Tech  | Vendor A   |

@valid-job-opening
Scenario Outline: Create Job Opening
  When I select "<job_role>" as the Job Role
  And I select "<location>" as the Location
  And I enter "<minimum_experience>" as the Minimum Experience
  And I enter "<maximum_experience>" as the Maximum Experience
  And I enter "<qualification>" as the Qualification
  And I enter "<short_job_description>" as the Short Job Description
  And I enter "<responsibilities>" as the Responsibilities
  And I enter "<primary_skills>" as the Primary Skills
  And I enter "<secondary_skills>" as the Secondary Skills
  And I enter "<total_openings>" as the Total Openings
  And I select "<employment_type>" as the Employment Type
  And I select "<duration>" as the Duration
  And I select "<work_mode>" as the Work Mode
  And I select "<status>" as the Status
  And I enter "<department>" as the Department
  And I enter "<industry_type>" as the Industry Type
  And I enter "<tags>" as the Tags
  And I select "<vendors>" as the Vendors
  And I click on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

Examples:
  | job_role          | location   | minimum_experience | maximum_experience | qualification       | short_job_description         | responsibilities              | primary_skills | secondary_skills | total_openings | employment_type | duration   | work_mode | status | department   | industry_type         | tags         | vendors   |
  | Software Engineer  | New York   | 2                  | 5                  | Bachelor's Degree    | Short job description a * 100 | Responsibilities a * 100     | Java, Python    | JavaScript      | 3              | Full-time      | 6 months   | Remote    | Active | Engineering   | Information Technology | Tag1, Tag2  | Vendor1   |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects a Job Role "<job_role>"
    And the recruiter selects a Location "<location>"
    And the recruiter enters Minimum Experience "<min_experience>"
    And the recruiter enters Maximum Experience "<max_experience>"
    And the recruiter selects a valid Status "<status>"
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

    Examples:
      | job_role          | location   | min_experience | max_experience | status |
      | Software Engineer  | New York   | 2              | 5              | Open   |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects a Job Role <job_role>
    And the recruiter selects a Location <location>
    And the recruiter enters Minimum Experience <min_experience>
    And the recruiter enters Maximum Experience <max_experience>
    And the recruiter enters Responsibilities <responsibilities>
    And the recruiter enters Primary Skills <primary_skills>
    And the recruiter enters Secondary Skills <secondary_skills>
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

  Examples:
    | job_role          | location   | min_experience | max_experience | responsibilities                                               | primary_skills         | secondary_skills         |
    | Software Engineer  | New York   | 2              | 5              | Develop software applications, Collaborate with cross-functional teams | Java, Python, SQL      | JavaScript, HTML, CSS     |

@valid-job-opening
Scenario Outline: Create Job Opening with Valid Duration
  When the recruiter selects the Job Role "<job_role>"
  And the recruiter selects the Location "<location>"
  And the recruiter enters Minimum Experience "<min_experience>"
  And the recruiter enters Maximum Experience "<max_experience>"
  And the recruiter selects a valid Duration "<duration>"
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

Examples:
  | job_role          | location   | min_experience | max_experience | duration   |
  | Software Engineer  | New York   | 2              | 5              | 6 months   |
