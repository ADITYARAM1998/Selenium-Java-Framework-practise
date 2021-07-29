package utils;

import java.io.IOException;



public class ExcelDataProvider {
	
	//create a function and create object for ExcelUtils
	public static void main(String[] args) throws IOException {
		String excelPath="C:\\Users\\Aditya\\eclipse-workspace\\Seleniumcore\\ExcelFiles\\Xcel.xlsx";
		TestData(excelPath,"Sheet1");
	}
	
	public static void TestData(String excelPath,String sheetName) throws IOException
	{
	ExcelUtils excel=new ExcelUtils(excelPath,sheetName);	
	int rowcount=excel.getRowCount();
	int colCount=excel.getColCount();
	for(int i=1; i<rowcount;i++)
	{
		for(int j=0;j<colCount;j++)
		{
			String celldata=excel.getcellDataString(i, j);
			System.out.println(celldata+" ");
		}
		System.out.println();
	}
	}
	
	

}
