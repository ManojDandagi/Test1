package com.demoqa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends Base {

    private WebElement element (By by) {
        return driver.findElement(by);
    }
    public void clickElement(By by) {
        clickElement(element(by));
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public WebElement waitForElementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        return element(by);
    }

    public void scrollToView(By by) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        WebElement e = element(by);
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",e);
    }

    public void scrollToView(String type, String value) {
        scrollToView(getBy(type, value));
    }

    public boolean isElementDisplayed(By by) {
        return element(by).isDisplayed();
    }

    public void setText(By by, String text) {
        element(by).sendKeys(text);
    }

    public void setText(String type, String value, String text) {
        element(getBy(type,value)).sendKeys(text);
    }

    public void clickElement(String type, String value) {
        clickElement(getBy(type,value));
    }

    private By getBy (String type, String value) {
        return switch(type) {
            case "xpath" -> By.xpath(value);
            case "id" -> By.id(value);
            case "className" -> By.className(value);
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
