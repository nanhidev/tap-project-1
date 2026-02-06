package com.tap-project-1.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.tap-project-1.pages.CreateJobOpeningPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CreateJobOpening extends DriverFactory {
CreateJobOpeningPage createJobOpeningPage = new CreateJobOpeningPage(driver);
@Given("the recruiter is on the Dashboard")
public void the_recruiter_is_on_the_dashboard() {
driver = DriverFactory.getDriver();
createJobOpeningPage.navigateToDashboard();
}
@When("the recruiter clicks on the {string} option in the side navigation")
public void the_recruiter_clicks_on_the_option_in_the_side_navigation(String job_opening_option) {
createJobOpeningPage.clicksOnJobOpeningOption(job_opening_option);
}
@Then("the Job Opening screen should be displayed")
public void the_job_opening_screen_should_be_displayed() {
createJobOpeningPage.isJobOpeningScreenDisplayed();
}
@And("the {string} button should be visible")
public void the_button_should_be_visible(String add_job_opening_button) {
createJobOpeningPage.isButtonVisible(add_job_opening_button);
}
@When("the recruiter clicks on the {string} button")
public void the_recruiter_clicks_on_the_button(String action) {
createJobOpeningPage.clicksOnAddJobOpeningButton(action);
}
@Then("the Create New Job Opening form should be opened")
public void the_create_new_job_opening_form_should_be_opened() {
createJobOpeningPage.isCreateNewJobOpeningFormOpened();
}
@And("the {string} and {string} buttons should be displayed")
public void the_and_buttons_should_be_displayed(String saveButton, String cancelButton) {
createJobOpeningPage.isButtonVisible(saveButton);
createJobOpeningPage.isButtonVisible(cancelButton);
}
@When("the recruiter selects the Job Role as {string}")
public void the_recruiter_selects_the_job_role_as(String job_role) {
createJobOpeningPage.selectJobRole(job_role);
}
@When("the recruiter selects the Location as {string}")
public void the_recruiter_selects_the_location_as(String location) {
createJobOpeningPage.selectLocation(location);
}
@When("the recruiter enters the Minimum Experience as {string}")
public void the_recruiter_enters_the_minimum_experience_as(String min_experience) {
createJobOpeningPage.enterMinimumExperience(min_experience);
}
@When("the recruiter enters the Maximum Experience as {string}")
public void the_recruiter_enters_the_maximum_experience_as(String max_experience) {
createJobOpeningPage.enterMaximumExperience(max_experience);
}
@When("the recruiter enters the Qualification as {string}")
public void the_recruiter_enters_the_qualification_as(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@When("the recruiter enters the Short Job Description as {string}")
public void the_recruiter_enters_the_short_job_description_as(String short_job_description) {
createJobOpeningPage.enterShortJobDescription(short_job_description);
}
@When("the recruiter enters the Responsibilities as {string}")
public void the_recruiter_enters_the_responsibilities_as(String responsibilities) {
createJobOpeningPage.enterResponsibilities(responsibilities);
}
@When("the recruiter clicks on {string}")
public void the_recruiter_clicks_on(String action) {
createJobOpeningPage.clicksOn(action);
}
@Then("the job opening should be saved successfully")
public void the_job_opening_should_be_saved_successfully() {
createJobOpeningPage.isJobOpeningSavedSuccessfully();
}
@Then("the job opening should be available in the Job Opening list")
public void the_job_opening_should_be_available_in_the_job_opening_list() {
createJobOpeningPage.isJobOpeningAvailableInList();
}
@When("the recruiter selects Employment Type {string}")
public void the_recruiter_selects_employment_type(String employment_type) {
createJobOpeningPage.selectEmploymentType(employment_type);
}
@When("the recruiter selects Work Mode {string}")
public void the_recruiter_selects_work_mode(String work_mode) {
createJobOpeningPage.selectWorkMode(work_mode);
}
@When("the recruiter enters Tags {string}")
public void the_recruiter_enters_tags(String tags) {
createJobOpeningPage.enterTags(tags);
}
@When("the recruiter selects the Vendor {string}")
public void the_recruiter_selects_the_vendor(String vendor) {
createJobOpeningPage.selectVendor(vendor);
}
@When("the recruiter selects a valid Status {string}")
public void the_recruiter_selects_a_valid_status(String status) {
createJobOpeningPage.selectStatus(status);
}
@When("the recruiter enters Primary Skills {string}")
public void the_recruiter_enters_primary_skills(String primary_skills) {
createJobOpeningPage.enterPrimarySkills(primary_skills);
}
@When("the recruiter enters Secondary Skills {string}")
public void the_recruiter_enters_secondary_skills(String secondary_skills) {
createJobOpeningPage.enterSecondarySkills(secondary_skills);
}
@When("the recruiter selects a valid Duration {string}")
public void the_recruiter_selects_a_valid_duration(String duration) {
createJobOpeningPage.selectDuration(duration);
}

@Given("I enter {string} as the primary skills")
public void i_enter_primary_skills(String primarySkills) {
createJobOpeningPage.enterPrimarySkills(primarySkills);
}
@When("I clickElement on save")
public void i_click_on_save() {
createJobOpeningPage.clickSave();
}
@Given("I select {string} as the employment type")
public void i_select_employment_type(String employmentType) {
createJobOpeningPage.selectEmploymentType(employmentType);
}
@Given("The recruiter selects a location {string}")
public void the_recruiter_selects_a_location(String location) {
createJobOpeningPage.selectLocation(location);
}
@Given("I select {string} as the vendors")
public void i_select_vendors(String vendors) {
createJobOpeningPage.selectVendors(vendors);
}
@Given("I select {string} as the job role")
public void i_select_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@When("The recruiter clicks on save")
public void the_recruiter_clicks_on_save() {
createJobOpeningPage.clickSave();
}
@Given("I select {string} as the status")
public void i_select_status(String status) {
createJobOpeningPage.selectStatus(status);
}
@Given("I enter {string} as the secondary skills")
public void i_enter_secondary_skills(String secondarySkills) {
createJobOpeningPage.enterSecondarySkills(secondarySkills);
}
@Given("The recruiter enters maximum experience {string}")
public void the_recruiter_enters_maximum_experience(String maxExperience) {
createJobOpeningPage.enterMaxExperience(maxExperience);
}
@Given("I enter {string} as the total openings")
public void i_enter_total_openings(String totalOpenings) {
createJobOpeningPage.enterTotalOpenings(totalOpenings);
}
@Given("I enter {string} as the department")
public void i_enter_department(String department) {
createJobOpeningPage.enterDepartment(department);
}
@Given("I enter {string} as the industry type")
public void i_enter_industry_type(String industryType) {
createJobOpeningPage.enterIndustryType(industryType);
}
@Given("I enter {string} as the responsibilities")
public void i_enter_responsibilities(String responsibilities) {
createJobOpeningPage.enterResponsibilities(responsibilities);
}
@Given("I enter {string} as the tags")
public void i_enter_tags(String tags) {
createJobOpeningPage.enterTags(tags);
}
@Given("I enter {string} as the short job description")
public void i_enter_short_job_description(String shortJobDescription) {
createJobOpeningPage.enterShortJobDescription(shortJobDescription);
}
@Then("The save cancel buttons should be displayed")
public void the_save_cancel_buttons_should_be_displayed() {
createJobOpeningPage.areSaveCancelButtonsDisplayed();
}
@Given("The recruiter leaves maximum experience blank")
public void the_recruiter_leaves_maximum_experience_blank() {
createJobOpeningPage.leaveMaxExperienceBlank();
}
@Given("The recruiter enters qualification")
public void the_recruiter_enters_qualification() {
createJobOpeningPage.enterQualification();
}
@When("The recruiter clicks on the add job opening button")
public void the_recruiter_clicks_on_the_add_job_opening_button() {
createJobOpeningPage.clickAddJobOpeningButton();
}
@Given("I select {string} as the duration")
public void i_select_duration(String duration) {
createJobOpeningPage.selectDuration(duration);
}
@Given("The recruiter enters minimum experience {string}")
public void the_recruiter_enters_minimum_experience(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@Given("I select {string} as the work mode")
public void i_select_work_mode(String workMode) {
createJobOpeningPage.selectWorkMode(workMode);
}
}