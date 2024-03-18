package pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.FrameworkConstants;
import drivers.DriverManager;
import enums.WaitStrategy;
import factories.ExplicitWaitFactory;
import reports.ExtentLogger;

public class Basepage {

	protected void click(By by, WaitStrategy waitStrategy, String elementName )
	{
		WebElement element = ExplicitWaitFactory
							.performExplicitWait(waitStrategy, by);
		element.click();
		ExtentLogger.pass("'" + elementName + "'" + " clicked");
		
	//	explicitlyWaitforElement(by, waitStrategy);
	//	DriverManager.getDriver().findElement(by).click();
	}
	
	public String getConfirmationMsg(By by ,WaitStrategy waitStrategy, String elementName) {

		WebElement element = ExplicitWaitFactory
							.performExplicitWait(waitStrategy, by);
		String text = element.getText();
		ExtentLogger.pass("'" + elementName + "'" + " Displayed");
		return text;
	}
	
	
	protected void jsExecutor( By by) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(
				WaitStrategy.PRESENCE, by);
		 JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});",  element);
	}
	
	
	protected void sendKeys(By by, String data, WaitStrategy waitStrategy, String elementName)
	{
		
		WebElement element = ExplicitWaitFactory.performExplicitWait(
													waitStrategy, by);
		element.sendKeys(data);
		ExtentLogger.pass("'" + data + "'  is entered successfully in " + elementName);
		
	//	explicitlyWaitforElement(by, waitStrategy);
	//	DriverManager.getDriver().findElement(by).sendKeys(data);
	}
	
	// drop down method
	protected void dropDown (By by, String data, WaitStrategy waitStrategy, String elementName) throws Exception {
		
		
		WebElement element = ExplicitWaitFactory.performExplicitWait(
				waitStrategy, by);
		
		Select status = new Select(element);
		status.selectByVisibleText(data);
		ExtentLogger.pass("'" + data + " ' is selected Successfully in ' " + elementName);
		
		
	}
	
	protected void checkBox (By by ,String data , WaitStrategy waitStrategy , String elementName) throws Exception {
		try {
			
			List<WebElement> element = DriverManager.getDriver().findElements(by);
			for(WebElement checkbox : element) {
				if (data.equalsIgnoreCase("all")) {
		            checkbox.click(); 
		            ExtentLogger.pass("'" + data + "' is Selected Successfully in " + elementName);
		        } else {
		            if (checkbox.getText().equalsIgnoreCase(data)) {
		                checkbox.click();
		                ExtentLogger.pass("'" + data + "' is Selected Successfully in " + elementName);
		            }
		        }
		    }
		}catch (NoSuchElementException e) {
		        ExtentLogger.fail("Element not found: " + elementName);
		        throw new Exception("Element not found: " + elementName);
		    }
		}
			
			
		
		
		
		/*
			else {
				WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
			     Select checkBox = new Select (element);
			     Lable ll 
			     checkBox.deselectByValue(data);;
			     ExtentLogger.pass("'" + data + "' is Selected Succeddfully in " + elementName);
			}
		
	}
	*/
	public String getPageTitle()
	{
	  	return DriverManager.getDriver().getTitle();
	}
	
	
	private static void explicitlyWaitforElementToBeClickable(By by)
	{
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 
				FrameworkConstants.getExplicitwait());
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	private static void explicitlyWaitForElementToBePresent(By by)
	{
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 
				FrameworkConstants.getExplicitwait());
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	private static void explicitlyWaitForElementToBeVisible(By by)
	{
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 
				FrameworkConstants.getExplicitwait());
		wait.until(ExpectedConditions.visibilityOfElementLocated (by));
	}
	
	private static void explicitlyWaitforElement(By by, WaitStrategy waitStrategy)
	{
			if (waitStrategy == WaitStrategy.PRESENCE)
				explicitlyWaitForElementToBePresent(by);
			else if (waitStrategy == WaitStrategy.CLICKABLE)
				explicitlyWaitforElementToBeClickable(by);
			else if (waitStrategy == WaitStrategy.VISIBLE)
				explicitlyWaitForElementToBeVisible(by);
	}

	
	
	
	
	
	
	
}