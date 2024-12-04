package com.keyword.util;

import com.demoqa.base.BasePage;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class KeyEngine extends BasePage {

    public void service (String filePath, String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        for (Row row: sheet) {
            if (row.getRowNum() == 0) continue;
            String keyword = row.getCell(0).getStringCellValue();
            String locatorType = row.getCell(1).getStringCellValue();
            String locatorValue = row.getCell(2).getStringCellValue();
            String data = row.getCell(3).getStringCellValue();
            switch (keyword) {
                case "setText":
                    setText(locatorType, locatorValue, data);
                    break;
                case "click":
                    clickElement(locatorType, locatorValue);
                    break;
                case "scroll":
                    scrollToView(locatorType, locatorValue);
                    break;
                case "-":
                    break;
                default:
                    System.out.println("Invalid keyword: " + keyword);
            }
        }
    }
}
