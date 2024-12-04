package com.demoqa.tests;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.ElementsPage;
import com.demoqa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    @Test
    public void clickButtonTest() {
        ElementsPage elementsPage = new HomePage().clickOnElements().clickOnButtons();
        Assert.assertTrue(elementsPage.isButtonsTitlePresent());
    }
}
