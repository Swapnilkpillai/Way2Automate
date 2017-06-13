package com.test.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromXL {
	static HashMap hashmap;
	public ReadFromXL(){
		hashmap = new HashMap();
	}
	
	public static void ReadXL(String fileName, String filePath, String sheetName) throws IOException{
		
		File file = new File(filePath +"\\" +fileName);
		
		FileInputStream fileinputstream = new FileInputStream(file);
		
		Workbook workbook = null;
		
		String fileExtension = fileName.substring(fileName.indexOf("."));
		
		 if(fileExtension.equals(".xlsx")){
				//If it is xlsx file then create object of XSSFWorkbook class
				 
			 workbook = new XSSFWorkbook(fileinputstream);
				 
			 }
			 
			//Check condition if the file is xls file
			 else if(fileExtension.equals(".xls")){
				
				 //If it is xls file then create object of XSSFWorkbook class
				 workbook = new HSSFWorkbook(fileinputstream);
			}
			 else{
				 System.out.println("The file is not Excel file");
			 }
			 
			 //Read sheet inside the workbook by its name
			 
			 Sheet testSheet = workbook.getSheet(sheetName);
			 
			//Find number of rows in excel file
			 
			 int rowCount = testSheet.getLastRowNum() - testSheet.getFirstRowNum();
			
			//Create a loop over all the rows of excel file to read it
			 
			 for (int i = 0; i < rowCount+1; i++){
				 Row row = testSheet.getRow(i);
				 
				//Create a loop to print cell values in a row
				 for (int j = 0; j < row.getLastCellNum(); j = j+2){
					//Print excel data in console
					  hashmap.put(row.getCell(j).getStringCellValue(), row.getCell(j+1).getStringCellValue());
					 			
					  } //End of J for loop
				
				 
			 }//End of I for loop
		
		
	}


}
