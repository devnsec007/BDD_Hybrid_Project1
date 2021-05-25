package com.qa.utilities;

import org.testng.annotations.Test;

public class UtilityTester {

	
	@Test
	
	public void DataUtilityTester() {
		
		
		String SheetName = "SampleBDDData";
		int RowNum = 3;
		Object[][] ArrObj = new Object[1][2]; 
		
		
		
		ExcelDataReaderForBDD EXDT = new ExcelDataReaderForBDD();
		
		ArrObj = EXDT.ExcelDataReader(SheetName, RowNum);
		
		System.out.println("Data Values are ::" + ArrObj[0][0].toString() + " AND " + ArrObj[0][1].toString());
		
		
		
		
		
	}
	
	
}
