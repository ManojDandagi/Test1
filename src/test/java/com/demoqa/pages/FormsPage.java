package com.demoqa.pages;

import com.demoqa.base.BasePage;
import org.openqa.selenium.By;

import java.io.IOException;

public class FormsPage extends BasePage {

    private final By practiceFormTab = By.xpath("//span[contains(.,'Practice Form')]/..");
    private final By firstNameBox = By.xpath("//input[@id='firstName']");
    private final By lastNameBox = By.xpath("//input[@id='lastName']");
    private final By maleRadioButton = By.xpath("//label[@for='gender-radio-1']");
    private final By numberBox = By.xpath("//input[@id='userNumber']");
    private final By submitButton = By.xpath("//button[@id='submit']");

    public FormsPage clickOnPracticeForm() {
        clickElement(practiceFormTab);
        return this;
    }

    public FormsPage fillForm(String firstName, String lastName, String number) {
        setText(firstNameBox, firstName);
        setText(lastNameBox, lastName);
        clickElement(maleRadioButton);
        setText(numberBox, number);
        return this;
    }

    public SubmissionDetailsPage clickSubmit() {
        scrollToView(submitButton);
        clickElement(submitButton);
        return new SubmissionDetailsPage();
    }
}
