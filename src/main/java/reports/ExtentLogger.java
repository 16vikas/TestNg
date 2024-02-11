package reports;

public class ExtentLogger {

private ExtentLogger() {}
	
	public static void pass(String message)
	{
		ExtentManagar.getExtentTest().pass(message);
	}
	
	public static void fail(String message)
	{
		ExtentManagar.getExtentTest().fail(message);
	
	}
	

	
	public static void skip(String message)
	{
		ExtentManagar.getExtentTest().skip(message);
	}

	
	
}
