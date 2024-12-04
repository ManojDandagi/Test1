package com.demoqa.pages;

import com.demoqa.base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By elementsDiv = By.xpath("//h5[contains(.,'Elements')]/../../..");
    private final By formsDiv = By.xpath("//h5[contains(.,'Forms')]/../../..");
    private final By alertsDiv = By.xpath("//h5[contains(.,'Alerts')]/../../..");

    public ElementsPage clickOnElements() {
        scrollToView(elementsDiv);
        waitForElementToBeClickable(elementsDiv).click();
        return new ElementsPage();
    }

    public FormsPage clickOnForms() {
        scrollToView(formsDiv);
        waitForElementToBeClickable(formsDiv).click();
        return new FormsPage();
    }

    public AlertsPage clickOnAlerts() {
        scrollToView(alertsDiv);
        waitForElementToBeClickable(alertsDiv).click();
        return new AlertsPage(driver);
    }
}
