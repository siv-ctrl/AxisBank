package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.WrapperClass;
import excel.Excel;
import pages.FDCalculator;

public class FDCalculatorTest extends WrapperClass{
	@BeforeClass
	public void startUp() {
		launchBrowser();
		openWebsite();
	}
	@Test
	public void fdCalculatorTest() throws Exception {
		FDCalculator calculate=new FDCalculator(driver);
		String interest_rate=calculate.fdCalculator(Excel.getvalue1());
		takeScreenshot("./Screenshots/image.jpg");
		System.out.println(interest_rate);	
	}
	@AfterMethod
	public void close() {
		closeBrowser();
	}
}
