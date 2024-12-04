package com.demoqa.util;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class FileLibrary {

    public Object[][] getExcelData() throws EncryptedDocumentException, IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\QapitolQA\\IdeaProjects\\DemoQA\\src\\test\\resources\\Data1.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        String[][] str = new String[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= 2; j++) {
                str[i][j] = wb.getSheet("Sheet1").getRow(i+1).getCell(j).getStringCellValue();
                System.out.println(str[i][j]);
            }
        }
        return str;
    }
}
