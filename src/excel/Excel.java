package excel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel
{
	public static double Value1;
	public static String Value2;
	public static double getvalue1() throws Exception
	{
	FileInputStream fi = new FileInputStream("./Excel/TestData.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fi);
	XSSFSheet sh = wb.getSheet("Sheet1");
	
	Value1 = sh.getRow(0).getCell(0).getNumericCellValue();
	return Value1;
	
 }
	public static String getvalue2() throws Exception
	{
		
	
	FileInputStream fi = new FileInputStream("./Excel/TestData.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fi);
	XSSFSheet sh = wb.getSheet("Sheet1");
	
	Value2 = sh.getRow(0).getCell(1).getStringCellValue();
	return Value2;
	
 }
	
}
