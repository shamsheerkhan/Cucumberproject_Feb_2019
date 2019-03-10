package com.write_excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class WriteExcelData {
	
	public static File file;
	public static FileInputStream fis;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static FileOutputStream fos;
	//**************************************************************//
	/*
	 * Method Name := create_excel_file()
	 * 
	 * Input Parameter := Test-Data_Path
	 * 
	 * OutPut Parameter :=  
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
	public static void create_excel_file(String email_id, String password,String arg3,String arg4,String sheetName,int parameter_no) {
		System.out.println("Writing Excel File");
		String path = System.getProperty("user.dir") + "\\TestData\\ResultData.xlsx";
		file = new File(path);
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		}
		try {
			book = new XSSFWorkbook(fis);
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		if (book.getSheet(sheetName) == null) {
			sheet = book.createSheet(sheetName);
		}

		sheet = book.getSheet(sheetName);

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		// Get the first row from the sheet
		Row row = null;
		if (sheet.getRow(rowCount) == null) {
			row = sheet.createRow(rowCount);
			for (int j = 0; j < parameter_no; j++) {

				// Fill data in row
				Cell cell = row.createCell(j);
				if (j == 0) {
					cell.setCellValue("Email_id");
				} else if (j == 1) {
					cell.setCellValue("Password");
				}else if (j == 2) {
					cell.setCellValue("arg3");
				}else if (j == 3) {
					cell.setCellValue("arg4");
					}
		}
			}
		// Create a new row and append it at last of sheet
		Row newRow = sheet.createRow(rowCount + 1);

		// Create a loop over the cell of newly created Row
		for (int j = 0; j < parameter_no; j++) {

			// Fill data in row
			Cell cell = newRow.createCell(j);
			if (j == 0) {
				cell.setCellValue(email_id);
			} else if (j == 1) {
				cell.setCellValue(password);
			}
			else if (j == 2) {
				cell.setCellValue(arg3);
			}
			else if (j == 3) {
				cell.setCellValue(arg4);
			}

		}

		try {
			fos = new FileOutputStream(file);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			book.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fos.flush();
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
//**************************************************************************************************//

}
