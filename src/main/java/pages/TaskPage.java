package pages;

import org.openqa.selenium.By;

import enums.WaitStrategy;

public class TaskPage extends Basepage {
 
	
	public static final By CreateTask = By.xpath("//input[@value = 'Create New Tasks']");
	public static final By EnterTask =By.name("task[0].name");
	public static final By Submit  = By.xpath("(//td[@class = 'formbuttonpane' ]/input [@type ='button'])[1]");
	public static final By SucMsg = By.className("successmsg");
	public static final By SelectCust = By.xpath("//select[@name = 'customerId']");
	public static final By SelectProj = By.xpath("//select[@name = 'projectId']");
	
	//Method
	
	public  TaskPage clickOnCreateTask() throws InterruptedException {
		click( CreateTask , WaitStrategy.CLICKABLE ,"Create Task" );
		Thread.sleep(5000);
		return this;
	}
	
	public TaskPage enterTaskName(String dt) throws InterruptedException {
		sendKeys(EnterTask , dt , WaitStrategy.PRESENCE,"TaskName");
		Thread.sleep(5000);
		return this ;
	}
	
	public  TaskPage clickOnSubmit() throws InterruptedException {
		click( Submit , WaitStrategy.CLICKABLE ,"Submit" );
		Thread.sleep(5000);
		return this;
	}
	
	public TaskPage selectCustomer(String data) throws Exception {
		dropDown(SelectCust ,data, WaitStrategy.VISIBLE, "Customer" );
		return this;
	}
	public TaskPage selectProject(String data) throws Exception {
		dropDown(SelectProj ,data, WaitStrategy.VISIBLE, "Project" );
		return this;
	}
	public String SucMsgIsDisplayed() {
		String res = getConfirmationMsg(SucMsg ,WaitStrategy.VISIBLE,"Succses Msg");
		return res;
	}
			
}
