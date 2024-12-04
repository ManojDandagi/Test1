package com.demoqa.pages;

import com.demoqa.base.BasePage;
import org.openqa.selenium.By;

public class ElementsPage extends BasePage {

    private final By buttonsTab = By.xpath("//span[contains(.,'Buttons')]/..");
    private final By buttonsTitle = By.xpath("//h1[contains(.,'Buttons')]");

    public ElementsPage clickOnButtons() {
        clickElement(buttonsTab);
        return this;
    }

    public boolean isButtonsTitlePresent() {
        return isElementDisplayed(buttonsTitle);
    }
}
