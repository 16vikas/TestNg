package pages;

import org.openqa.selenium.By;

import enums.WaitStrategy;

public class LoginPage extends Basepage{
 
	public LoginPage(){}
	
	public static final By fName = By.name("username");
	public static final By pwd = By.name("pwd");
	public static final By checkBox = By.name("remember");
	public static final By loginBtn = By.id("loginButton");
	
	// Methods
	
	public  LoginPage enterUserName(String un) throws InterruptedException {
	 sendKeys(fName , un , WaitStrategy.PRESENCE , "Username") ;
	 Thread.sleep(3000);
	 
	 return this ;
	 
	 
	}
	
	public  LoginPage enterPassWord(String pw) {
		 sendKeys(pwd , pw , WaitStrategy.PRESENCE , "Password") ;
		 return this ;
		}
	
	public  LoginPage clickOnCheckBox() {
		 click(checkBox , WaitStrategy.CLICKABLE , "CheckBox") ;
		 return this ;
		}
	
	public  HomePage clickOnLoginBtn() {
		 click(loginBtn , WaitStrategy.CLICKABLE , "Login Button") ;
		 return new HomePage() ;
		}
	
}
