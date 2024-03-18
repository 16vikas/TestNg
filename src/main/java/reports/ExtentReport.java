package reports;

import java.util.Date;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReport {

	 private ExtendReport () {}
	 
	 private static ExtentReports extent;
	 public static ExtentTest test;
	 
	 public static void initReport() {
		 
		 if(Objects.isNull(extent)) {
			 
			 extent = new ExtentReports();
			 ExtentSparkReporter spark  = new ExtentSparkReporter(
						System.getProperty("user.dir") + 
						"/src/test/resources/extent-reports/" +"index_" 
						+ new Date().toString().replace(" ", "_").replace(":", "_")
						+ ".html");
			 
			 extent.attachReporter(spark);
			 spark.config().setTheme(Theme.STANDARD);
			 spark.config().setDocumentTitle("Orange HRM");
			 spark.config().setReportName("Login-Logout Test Report");
			 
		 }
	 }
	 
	 public static void flushReports() {
		 
		 if(Objects.nonNull(extent)) {
			 extent.flush();
			 
		 }
	 }
	
	 
	
	 public static void createTest(String testcasename)
		{
			//test = extent.createTest(testcasename); 
			ExtentManagar.setExtentTest(extent.createTest(testcasename));
		
		}
	 
	 
	 
}

/* than call initReport() and flushReport method in the Beforesuit and aftersuit both are in BaseTest class*/




