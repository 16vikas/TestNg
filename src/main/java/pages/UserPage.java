package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import drivers.DriverManager;
import enums.WaitStrategy;
import factories.ExplicitWaitFactory;
import reports.ExtentLogger;

public class UserPage extends Basepage {

	By cNewUser = By.id("ext-comp-1005");
	By userName = By.name("username");
	By status  = By.name("active") ;
	By password = By.name("passwordText") ;
	By confPassword = By.name("passwordTextRetype");
	By fName = By.name("firstName") ;
	By lName = By.name("lastName") ;
	By moNo = By.name("phone") ;
	By email = By.name("email") ;
	By Dept = By.name("userGroupId") ;
	By accRight = By.xpath("(//td[@class = 'darkpane']//td[@class = 'formfieldtitle']//label)");
	By submit = By.xpath("//input[@type = 'submit']");
   
	By deleteBtn =By.xpath("//input[@value ='Delete This User']");
	
		
	
public UserPage editUser(String un) {
	 By listedUsr = By.partialLinkText(un);	
	click(listedUsr , WaitStrategy.CLICKABLE , "Selected User");
	return this ;
}

public UserPage deleteUsr() {
	click(deleteBtn , WaitStrategy.CLICKABLE , "Delete USer") ;
	return this ;
}
	
public  UserPage alertAccept() {
	 DriverManager.getDriver().switchTo().alert().accept();
	 return this ;
}

public  UserPage alertDismiss() {
	 DriverManager.getDriver().switchTo().alert().dismiss();
	 return this ;
}



	// Methods
	 public UserPage effDate(String date) throws InterruptedException {
	        By effDateLocator = By.id("ratesEditoreffectiveDateId0");
	        
	        jsExecutor( effDateLocator );
	        click(effDateLocator , WaitStrategy.CLICKABLE ,"Effect date");
	        sendKeys(effDateLocator , date , WaitStrategy.PRESENCE , "Effect date");
	        
	        return this;
	    }
	 
	 public UserPage accessRight(String data) throws Exception {
		jsExecutor( accRight);
		 checkBox( accRight , data ,WaitStrategy.CLICKABLE , "Access Right");
		
		return this;
		 
		 
	 }
	
	public UserPage clikOnCreateUser() {
		click(cNewUser , WaitStrategy.CLICKABLE ,"Create New USer");
		return this ;
	}
	
	public UserPage enterUserName(String un) {
		sendKeys(userName , un , WaitStrategy.PRESENCE , "Username ");
		return this ;
	}
	
	public UserPage selectStatus(String opt) throws Exception {
		
		dropDown(status , opt , WaitStrategy.PRESENCE ,"Status");
		return this ;
	}
	
	public UserPage enterPassword(String pwd) {
		sendKeys(password , pwd , WaitStrategy.PRESENCE , "Password");
		return this ;
	}
	
	public UserPage enterConfPassword(String confPwd) {
		sendKeys(confPassword , confPwd , WaitStrategy.PRESENCE , "Confirm Password");
		return this ;
	}
	
	public UserPage enterFirstName(String fn) {
		sendKeys(fName , fn , WaitStrategy.PRESENCE , "LirstName");
		return this ;
	}
	
	public UserPage enterLastName(String ln) {
		sendKeys(lName , ln , WaitStrategy.PRESENCE , "LastName");
		return this ;
	}
	
	public UserPage enterMobileNo(String mob) {
		sendKeys(moNo , mob , WaitStrategy.PRESENCE , "Mobile number");
		return this ;
	}
	
	
	public UserPage enterEmail(String mail) {
		sendKeys(email , mail , WaitStrategy.PRESENCE , "Email Address");
		return this ;
	}
	
	public UserPage selectDept(String opt) throws Exception {
		dropDown( Dept , opt , WaitStrategy.PRESENCE , "Department");
		
		return this ;
	}
	
	public UserPage submit() {
		click(submit , WaitStrategy.CLICKABLE ,"Create User");
		return this ;
	}
	
	
	
	
	
	
	
	
}
