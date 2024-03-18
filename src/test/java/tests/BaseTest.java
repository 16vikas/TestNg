package tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import drivers.Drivers;
import reports.ExtentReport;


public class BaseTest {
	
	protected BaseTest() {}
	
	@BeforeSuite
	public void beforeSuite()
	{
		ExtentReport.initReports();
	}
	@AfterSuite
	public void afterSuite()
	{
		ExtentReport.flushreports();
	}
	
	
	@BeforeMethod
	protected void tearUp() throws Exception
	{
		Drivers.initDriver();
	
	}
	@AfterMethod
	protected void tearDown()
	{
		Drivers.quiteDriver();
	}
}
