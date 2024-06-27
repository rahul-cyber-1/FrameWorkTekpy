package com.comcast.crm.generic.FileUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.format.CellNumberFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDataFromExcel(String sheetName, int rownum, int cellnum) throws Throwable {

		FileInputStream fis = new FileInputStream("./TestScriptData/testScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;

	}

	public int getRowcount(String sheetName) throws Throwable {

		FileInputStream fis = new FileInputStream("./TestScriptData/testScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int data = wb.getSheet(sheetName).getLastRowNum();
		wb.close();

		return data;

	}

	public void setDataIntoExcel(String sheetName, int rowNum,int cellnum, String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\murtuza\\Desktop\\testScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet(sheetName).getRow(rowNum).createCell(cellnum);

		FileOutputStream fos = new FileOutputStream("C:\\Users\\murtuza\\Desktop\\testScriptData.xlsx");
		wb.write(fos);
		wb.close();

	}

}
