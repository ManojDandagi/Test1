package com.demoqa.pages;

import com.demoqa.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage extends BasePage {

    @FindBy(xpath = "//span[contains(.,'Modal Dialogs')]/..")
    private WebElement modalDialogsTab;

    public AlertsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public AlertsPage clickOnModalDialogsTab() {
        clickElement(modalDialogsTab);
        return this;
    }
}
