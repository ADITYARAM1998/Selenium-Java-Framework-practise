package utils;

import java.io.IOException;

public class ExcelUtilsParams {
	
	public static void main(String[] args) throws IOException {
		String ProjectPath=System.getProperty("user.dir");
		
		ExcelUtils excel=new ExcelUtils(ProjectPath+"\\ExcelFiles\\Xcel.xlsx","Sheet1");
		excel.getRowCount();
		excel.getcellDataNumeric(1,1);
		excel.getcellDataString(0, 1);
	}

}
