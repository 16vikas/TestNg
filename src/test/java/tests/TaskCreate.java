package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import reports.ExtentReport;

public class TaskCreate extends BaseTest {

	@Test
	public static void createTask () throws Exception {
		
			ExtentReport.createTest("Create User Test");
			LoginPage lpage = new LoginPage();
			HomePage hpage =  lpage.enterUserName("manager").enterPassWord("12345").clickOnCheckBox().clickOnLoginBtn();
			
	String actualRes =  hpage.clickOnTask().clickOnCreateTask().selectCustomer("HDFC").selectProject("Investment banking").enterTaskName("new 5").clickOnSubmit().SucMsgIsDisplayed();
	String a = "\"HDFC\"";
	String b = "\"Investment banking\"";
	
	String expectedRes = "1 new task was added to the customer " + a + ", project " + b +".";

		Assert.assertEquals(actualRes,expectedRes,"Confirmation message is differnet than Successfully Saved");
	}
	
}
