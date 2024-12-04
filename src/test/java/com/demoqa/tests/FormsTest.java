package com.demoqa.tests;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.FormsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SubmissionDetailsPage;
import com.demoqa.util.FileLibrary;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class FormsTest extends BaseTest {

    @DataProvider(name = "formData")
    public static Object[][] credentials() throws IOException {
        FileLibrary fileLibrary = new FileLibrary();
        return fileLibrary.getExcelData();
    }

    @Test(dataProvider = "formData")
    public void submitFormTest(String fn, String ln, String n) throws IOException {
        FormsPage formsPage = new HomePage().clickOnForms().clickOnPracticeForm();
        SubmissionDetailsPage submissionDetailsPage = formsPage.fillForm(fn, ln, n).clickSubmit();
        Assert.assertTrue(submissionDetailsPage.isSubmissionTitlePresent());
    }
}
