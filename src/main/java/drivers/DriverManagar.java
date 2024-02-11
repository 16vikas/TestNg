package drivers;

import org.openqa.selenium.WebDriver;

public class DriverManagar {

	public static ThreadLocal <WebDriver> dr = new ThreadLocal<>();

	public static WebDriver  getDriver() {
		return dr.get();
	}

	public static void setDriver(WebDriver drivRef) {
		
	      dr.set(drivRef);
	}
	
	public static void unload() {
      dr.remove();
	
	}
	
	
	
	
	
	
	
}
