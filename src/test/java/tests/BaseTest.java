package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import drivers.Drivers;
import reports.ExtendReport;


public class BaseTest {
	protected BaseTest(){}
	 
	 @BeforeSuite
	 public void beforeSuit (){
		 ExtendReport.initReport();
	 }

	 @AfterSuite
	 public void afterSuite() {
		 ExtendReport.flushReports();
	 }
	 
	@BeforeTest
	public void tearUp() throws Exception {
		Drivers.initDriver();
	}
	
	@AfterTest
	public void tearDown() {
		
		Drivers.quiteDriver();
	}
	
	
}
