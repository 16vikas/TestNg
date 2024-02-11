package pages;

import org.openqa.selenium.By;

import drivers.DriverManagar;
import reports.ExtentLogger;

public class Basepage {

	
	protected  void click(By by ,String elementName) {
		DriverManagar.getDriver().findElement(by).click();
		ExtentLogger.pass("'" + elementName + "'" + " clicked");
		
	}
	
	protected void sendKeys (By by , String un , String elementName) {
		DriverManagar.getDriver().findElement(by).sendKeys(un);
		ExtentLogger.pass("'" + un  + "is Entered Successfully in " + elementName);
	}
	
public String getPagetitle() {
	return DriverManagar.getDriver().getTitle();
	
}
	
}
