package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
	public static Object[][] getTestData(String filePath, String sheetName) throws IOException 
	{
		FileInputStream fis = new FileInputStream(filePath); //read excelpath
		XSSFWorkbook workbook = new XSSFWorkbook (fis); //get excel workbook
		XSSFSheet sheet = workbook.getSheet(sheetName); //to get the sheet
		
		int rows = sheet.getLastRowNum();//excluding header
		int cols = sheet.getRow(0).getLastCellNum();
		
		System.out.println(rows);
		System.out.println(cols);
		
		Object[][] data = new Object[rows][cols];//create the 2d object array,it can store multiple row and column
		DataFormatter formatter = new DataFormatter();//convert all cell values to string
		
		for (int i = 1; i<=rows; i++)//start from 1 (skip header)
		{
			for(int j = 0; j< cols; j++)
			{
				data[i -1][j] = formatter.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		workbook.close();
		fis.close();
		
		return data;
	}

}
