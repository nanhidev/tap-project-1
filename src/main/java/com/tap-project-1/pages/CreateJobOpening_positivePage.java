package com.backend.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class CreateJobOpeningPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "dashboard")
    private WebElement dashboard;
    @FindBy(id = "jobOpeningOption")
    private WebElement jobOpeningOption;
    @FindBy(id = "jobOpeningScreen")
    private WebElement jobOpeningScreen;
    @FindBy(id = "addJobOpeningButton")
    private WebElement addJobOpeningButton;
    @FindBy(id = "createJobOpeningForm")
    private WebElement createJobOpeningForm;
    @FindBy(id = "saveButton")
    private WebElement saveButton;
    @FindBy(id = "cancelButton")
    private WebElement cancelButton;
    @FindBy(id = "jobRoleDropdown")
    private WebElement jobRoleDropdown;
    @FindBy(id = "locationDropdown")
    private WebElement locationDropdown;
    @FindBy(name = "minExperience")
    private WebElement minExperienceInput;
    @FindBy(name = "maxExperience")
    private WebElement maxExperienceInput;
    @FindBy(name = "qualification")
    private WebElement qualificationInput;
    @FindBy(name = "shortJobDescription")
    private WebElement shortJobDescriptionInput;
    @FindBy(name = "responsibilities")
    private WebElement responsibilitiesInput;
    @FindBy(id = "employmentTypeDropdown")
    private WebElement employmentTypeDropdown;
    @FindBy(id = "workModeDropdown")
    private WebElement workModeDropdown;
    @FindBy(name = "tags")
    private WebElement tagsInput;
    @FindBy(id = "vendorDropdown")
    private WebElement vendorDropdown;
    @FindBy(id = "statusDropdown")
    private WebElement statusDropdown;
    @FindBy(name = "primarySkills")
    private WebElement primarySkillsInput;
    @FindBy(name = "secondarySkills")
    private WebElement secondarySkillsInput;
    @FindBy(id = "durationDropdown")
    private WebElement durationDropdown;
    @FindBy(id = "vendorsButton")
    private WebElement vendorsButton; // Added for vendor selection
    @FindBy(id = "departmentField")
    private WebElement departmentField; // Added for department input
    @FindBy(id = "totalOpeningsField")
    private WebElement totalOpeningsField; // Added for total openings input
    @FindBy(id = "industryTypeDropdown")
    private WebElement industryTypeDropdown; // Added for industry type selection

    public CreateJobOpeningPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToDashboard() {
        try {
            elementUtils.clickElement(dashboard);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnJobOpeningOption() {
        try {
            elementUtils.clickElement(jobOpeningOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(jobOpeningScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isButtonVisible(String buttonId) {
        try {
            WebElement button = driver.findElement(By.id(buttonId));
            return elementUtils.isElementDisplayed(button);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clicksOnAddJobOpeningButton() {
        try {
            elementUtils.clickElement(addJobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isCreateNewJobOpeningFormOpened() {
        try {
            return elementUtils.isElementDisplayed(createJobOpeningForm);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectJobRole(String jobRole) {
        try {
            elementUtils.selectOptionInDropdown(jobRoleDropdown, jobRole);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectLocation(String location) {
        try {
            elementUtils.selectOptionInDropdown(locationDropdown, location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMinimumExperience(String minExperience) {
        try {
            elementUtils.clearAndSendKeys(minExperienceInput, minExperience);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMaximumExperience(String maxExperience) {
        try {
            elementUtils.clearAndSendKeys(maxExperienceInput, maxExperience);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterQualification(String qualification) {
        try {
            elementUtils.clearAndSendKeys(qualificationInput, qualification);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterShortJobDescription(String shortJobDescription) {
        try {
            elementUtils.clearAndSendKeys(shortJobDescriptionInput, shortJobDescription);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterResponsibilities(String responsibilities) {
        try {
            elementUtils.clearAndSendKeys(responsibilitiesInput, responsibilities);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickSave() {
        try {
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningSavedSuccessfully() {
        // Implement logic to check if the job opening is saved successfully
        return true; // Placeholder return
    }

    public boolean isJobOpeningAvailableInList() {
        // Implement logic to check if the job opening is available in the list
        return true; // Placeholder return
    }

    public void selectEmploymentType(String employmentType) {
        try {
            elementUtils.selectOptionInDropdown(employmentTypeDropdown, employmentType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectWorkMode(String workMode) {
        try {
            elementUtils.selectOptionInDropdown(workModeDropdown, workMode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterTags(String tags) {
        try {
            elementUtils.clearAndSendKeys(tagsInput, tags);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectVendor(String vendor) {
        try {
            elementUtils.selectOptionInDropdown(vendorDropdown, vendor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectStatus(String status) {
        try {
            elementUtils.selectOptionInDropdown(statusDropdown, status);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPrimarySkills(String primarySkills) {
        try {
            elementUtils.clearAndSendKeys(primarySkillsInput, primarySkills);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterSecondarySkills(String secondarySkills) {
        try {
            elementUtils.clearAndSendKeys(secondarySkillsInput, secondarySkills);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectDuration(String duration) {
        try {
            elementUtils.selectOptionInDropdown(durationDropdown, duration);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean areSaveCancelButtonsDisplayed() {
        try {
            return elementUtils.isElementDisplayed(saveButton) && elementUtils.isElementDisplayed(cancelButton);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void leaveMaxExperienceBlank() {
        try {
            elementUtils.clearElement(maxExperienceInput);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectVendors() {
        try {
            elementUtils.clickElement(vendorsButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDepartment(String department) {
        try {
            elementUtils.clearAndSendKeys(departmentField, department);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterTotalOpenings(int totalOpenings) {
        try {
            elementUtils.clearAndSendKeys(totalOpeningsField, String.valueOf(totalOpenings));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterIndustryType(String industryType) {
        try {
            elementUtils.selectOptionInDropdown(industryTypeDropdown, industryType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}