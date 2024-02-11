package reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManagar {

	private static ThreadLocal<ExtentTest> extTest = new ThreadLocal<>();
	public static ExtentTest getExtentTest() {
		
		return extTest.get();
	}
	
	protected static void setExtentTest(ExtentTest test) {
		extTest.set(test);
	}
	
	protected static void unload() {
		
		extTest.remove();
	}
	
}
