package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import reports.ExtentLogger;
import reports.ExtentReport;

public class ListenerClass implements  ITestListener, ISuiteListener {

	@Override
	 public  void onStart (ISuite suite) {
	   ExtentReport.initReports();
	  }
	@Override
	public void onFinish(ISuite suite) {
	    ExtentReport.flushreports();
	  }
	@Override
	public  void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getMethodName());
	  }
	 @Override
	 public void onTestSuccess(ITestResult result) {
		 ExtentLogger.pass(result.getMethod().getMethodName());
	 }
	@Override
	public void onTestFailure(ITestResult result)  {
		ExtentLogger.fail(result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentLogger.skip(result.getMethod().getMethodName());
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		// ignore this method
	}
	
	
	
}
