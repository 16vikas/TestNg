package pages;

import org.openqa.selenium.By;

import drivers.DriverManagar;

public class OrangeHRMLoginPage extends Basepage{

	//Locator
	
	private static final By Username =By.name("username");
	private static final By Password = By.name("password");
	private static final By btnLogin = By.xpath("//button[@type='submit']");
	
	// methods
	
	public  OrangeHRMLoginPage enterUserName(String un) {
		
		//DriverManagar.getDriver().findElement(Username).sendKeys(un);
		sendKeys(Username, un , "Username");
		return this ;
	}
	
	public OrangeHRMLoginPage enterPassword(String pw) {
		
		//DriverManagar.getDriver().findElement(Password).sendKeys(pw);
		sendKeys(Password, pw , "Password");
		return this ;
	}
	
	
	public OrangeHRMHomepage clickOnLoginBtn() {
		
		//DriverManagar.getDriver().findElement(btnLogin).click();
		click(btnLogin , "Login Button");
		return new OrangeHRMHomepage();
	}
	

	
	
	
}
