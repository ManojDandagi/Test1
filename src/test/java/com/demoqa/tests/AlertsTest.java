package com.demoqa.tests;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.AlertsPage;
import com.demoqa.pages.HomePage;
import org.testng.annotations.Test;

public class AlertsTest extends BaseTest {

    @Test
    public void smallModalTest() {
        extentTest = extentReports.createTest("Execution of small modal test")
                .assignAuthor("Manoj").assignCategory("Automation Test").assignDevice("Windows 11");
        extentTest.info("Initization of Script");
        AlertsPage alertsPage = new HomePage().clickOnAlerts().clickOnModalDialogsTab();
        extentTest.pass("Script end");
        logger.info("Info");
        logger.debug("Debug");
        logger.error("Error");
        logger.warn("Warn");
    }
}
