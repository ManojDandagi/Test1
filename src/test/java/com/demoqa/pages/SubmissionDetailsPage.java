package com.demoqa.pages;

import com.demoqa.base.BasePage;
import org.openqa.selenium.By;

public class SubmissionDetailsPage extends BasePage {

    private final By submissionTitle = By.xpath("//div[@class='modal-title h4']");

    public boolean isSubmissionTitlePresent() {
        return isElementDisplayed(submissionTitle);
    }

}
