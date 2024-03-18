package pages;

import org.openqa.selenium.By;

import enums.WaitStrategy;

public class HomePage extends Basepage {

	//private static final By Task = By.xpath("//a[@class = 'content tasks_selected selected']/div[@class = 'label']");
	private static final By user = By.linkText("Users");
	private static final By Task = By.linkText("Tasks");
	// Methods
	
	public UserPage clickOnUser() {
		 click(user , WaitStrategy.CLICKABLE , "CheckBox") ;
		 return new UserPage();
		
	}
	public  TaskPage clickOnTask() throws InterruptedException {
		click(Task , WaitStrategy.CLICKABLE ,"Task Module" );
		Thread.sleep(5000);
		return new TaskPage();
	}
	
	
}

