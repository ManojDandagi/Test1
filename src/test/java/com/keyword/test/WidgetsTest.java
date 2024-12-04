package com.keyword.test;

import com.demoqa.base.BaseTest;
import com.keyword.util.KeyEngine;
import org.testng.annotations.Test;

import java.io.IOException;

public class WidgetsTest extends BaseTest {

    private KeyEngine keyEngine;

    @Test
    public void sliderTest () throws IOException {
        keyEngine = new KeyEngine();
        extentTest = extentReports.createTest("Execution of widget test")
                .assignAuthor("Manoj").assignCategory("Automation Test").assignDevice("Windows 11");
        extentTest.info("Initization of Script");

        keyEngine.service(
                "C:\\Users\\QapitolQA\\IdeaProjects\\DemoQA\\src\\test\\resources\\Tests.xlsx",
                "Widgets");

        extentTest.pass("Script end");
        logger.info("Info");
        logger.debug("Debug");
        logger.error("Error");
        logger.warn("Warn");
    }
}
