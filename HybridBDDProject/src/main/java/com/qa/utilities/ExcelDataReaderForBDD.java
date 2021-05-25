package com.qa.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataReaderForBDD {

	public Object[][] ExcelDataReader(String SheetName, int RowNo){
		
				
		try {
			Workbook WB = WorkbookFactory.create(new FileInputStream("F:\\eclipse-workspace\\HybridBDDProject\\src\\test\\resources\\ExcelDataSource\\TestDataSourceBDD.xlsx"));
			Sheet WorkSheet = WB.getSheet(SheetName);
			Object[][] DataArr = new Object[1][WorkSheet.getRow(0).getLastCellNum()]; 
			


					
					for (int j=0;j<WorkSheet.getRow(RowNo).getLastCellNum();j++) { 
				    DataArr[0][j] = WorkSheet.getRow(RowNo).getCell(j).toString();}
						

			
			WB.close();
			return DataArr;
			
			
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
		
		
	}
	
	
	
	
	
	
}
