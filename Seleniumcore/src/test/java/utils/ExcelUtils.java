package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtils {
	public  String ProjectPath;
	public XSSFWorkbook workbook=null;
	public static  XSSFSheet sheet;
	
	
	public ExcelUtils(String excelPath, String sheetName) throws IOException {
		// TODO Auto-generated constructor stub
		 ProjectPath=System.getProperty("user.dir");
		 workbook = new XSSFWorkbook(excelPath);
		 sheet=workbook.getSheet(sheetName);
	}
	@Test
	public static int getRowCount() throws IOException
	{
		
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println("the count is:"+rowcount);
		return rowcount;
	
	}@Test
	public static int getColCount() throws IOException
	{
		
		
		int colCount=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("the count is:"+colCount);
		return colCount;
	
	}
	@Test
		public static String getcellDataString(int rowNum,int colNum) throws IOException
		{ 
		String cellData=null;
//		workbook = new XSSFWorkbook(ProjectPath+"\\ExcelFiles\\Xcel.xlsx");
//		 sheet=workbook.getSheet("Sheet1");
			String celldata=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println("The content in cell is:"+celldata);
			return cellData;
	}
/*	public static void getcellDataString(int rowNum,int colNum) throws IOException
	{ 
	workbook = new XSSFWorkbook(ProjectPath+"\\ExcelFiles\\Xcel.xlsx");
	 sheet=workbook.getSheet("Sheet1");
		String celldata=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println("The content in cell is:"+celldata);
}*/
	@Test
	public static String getcellDataNumeric(int rowNum,int colNum) throws IOException
	{ 
		String cellData=null;
//	workbook = new XSSFWorkbook(ProjectPath+"\\ExcelFiles\\Xcel.xlsx");
//	 sheet=workbook.getSheet("Sheet1");
		double celldata=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println("The content in cell is:"+celldata);
		return cellData;
}
}


