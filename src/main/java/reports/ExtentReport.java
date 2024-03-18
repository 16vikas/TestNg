package reports;
import java.util.Date;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class ExtentReport {

	private ExtentReport() {}
	
	private static ExtentReports extent;
	public static ExtentTest test;

	public static void initReports() 
	{
		if (Objects.isNull(extent))
		{
			extent = new ExtentReports();
			ExtentSparkReporter spark = 
					new ExtentSparkReporter(
					System.getProperty("user.dir") + 
					"/src/test/resources/extent-reports/" +"index_" 
					+ new Date().toString().replace(" ", "_").replace(":", "_")
					+ ".html");
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("Cyber Success Automation");
			spark.config().setReportName("CS Automation Report");
		}
	}
	public static void flushreports()
	{
		if(Objects.nonNull(extent))
			extent.flush();
	}
	public static void createTest(String testcasename)
	{
		//test = extent.createTest(testcasename); 
		ExtentManager.setExtentTest(extent.createTest(testcasename));
	
	}
}

/* than call initReport() and flushReport method in the Beforesuit and aftersuit both are in BaseTest class*/




