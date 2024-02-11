package pages;

import org.openqa.selenium.By;

import drivers.DriverManagar;
import reports.ExtendReport;
import reports.ExtentLogger;
import reports.ExtentManagar;

public class OrangeHRMHomepage extends Basepage {

	
	By profilePicArrow  = By.xpath("//div[@id='app']//ul/li/span/i");
	By optionlogout     = By.xpath("(//a[@role='menuitem'])[4]");
	
	//	Methods
	public OrangeHRMHomepage clickOnProfilePicArrow() {
		
		//DriverManagar.getDriver().findElement(profilePicArrow).click();
		
		// 1st ExtendReport.test.pass("Profile Pic Arrow Button Clicked");
		// 2nd ExtentManagar.getExtentTest().pass("Profile Pic Arrow Button Clicked");
		
		// 3rd ExtentLogger.pass("Profile Pic Arrow Button Clicked");
		click(profilePicArrow , "PROFILE PIC ARROW" );
		
		return this;
	}
	
	public OrangeHRMLoginPage clickLogOutOption() {
		
		//DriverManagar.getDriver().findElement(optionlogout).click();
		click(optionlogout , "LogOut Button");
		// 1st ExtendReport.test.pass("Logout Button Clicked");
		// 2nd ExtentManagar.getExtentTest().pass("Logout Button Clicked");
		
		//ExtentLogger.pass("Logout Button Clicked");
		return new OrangeHRMLoginPage() ;
	}
}

// than create BasePage class
