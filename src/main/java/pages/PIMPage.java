package pages;

import org.openqa.selenium.By;

import drivers.DriverManager;
import enums.WaitStrategy;
import factories.ExplicitWaitFactory;

public class PIMPage extends Basepage {

	//Locators
private static final 	By addBtn = By.xpath("(//button [@type = 'button']) [4]");
private static final 	By fName  = By.xpath("//input[@name = 'firstName']");
private static final 	By mName  = By.xpath("//input[@name = 'middleName']");
private static final 	By lName  = By.xpath("//input[@name = 'lastName']");
private static final 	By saveBtn  = By.xpath("//button[@type = 'submit']");
private static final 	By confirmationMsg = By.xpath("//*[text()='Guardado correctamente']");


//Methods

public PIMPage enterFirstName(String un) {
	
	sendKeys(fName , un , WaitStrategy.PRESENCE ,"First name");
	return this;
	
}

public PIMPage enterMiddleName(String mn) {
	
	sendKeys(mName , mn , WaitStrategy.PRESENCE ,"Middle name");
	return this;
	
}

public PIMPage enterLastName(String ln) {
	
	sendKeys(lName , ln , WaitStrategy.PRESENCE ,"Last name");
	return this;
	
}

public PIMPage clickOnAddBtn() {
	click(addBtn ,  WaitStrategy.CLICKABLE , "Add Button");
	
	return this;
	
}

public PIMPage clikOnSaveBtn() {
	click(saveBtn , WaitStrategy.CLICKABLE , "Save ");
	ExplicitWaitFactory.performExplicitWait(WaitStrategy.PRESENCE, confirmationMsg );
	return this ;
}

public String getConfirmationMsg() {
	return DriverManager.getDriver().findElement(confirmationMsg).getText();
}






}
