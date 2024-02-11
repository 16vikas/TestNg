package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import reports.ExtendReport;

public class ListenerClass implements  ITestListener, ISuiteListener {

	@Override
	 public  void onStart (ISuite suite) {
	   ExtendReport.initReport();
	  }
	@Override
	public void onFinish(ISuite suite) {
	    ExtendReport.flushReports();
	  }
	@Override
	public  void onTestStart(ITestResult result) {
		ExtendReport.createTest(result.getMethod().getMethodName());
	  }
	 @Override
	 public void onTestSuccess(ITestResult result) {
		 ExtendReport.test.pass(result.getMethod().getMethodName());
	 }
	@Override
	public void onTestFailure(ITestResult result)  {
		ExtendReport.test.fail(result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		ExtendReport.test.skip(result.getMethod().getMethodName());
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		// ignore this method
	}
	
	
	
}
