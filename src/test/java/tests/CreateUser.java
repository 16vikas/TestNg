package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserPage;
import reports.ExtentReport;

public class CreateUser extends BaseTest {

	@Test
	public void CreatUser () throws Exception {
		ExtentReport.createTest("Create User Test");
		LoginPage lpage = new LoginPage();
		HomePage hpage =  lpage.enterUserName("manager").enterPassWord("12345").clickOnCheckBox().clickOnLoginBtn();
		
		UserPage UsrPage = hpage.clickOnUser();
		UsrPage.clikOnCreateUser().enterUserName("Rohit1235").selectStatus("enabled").enterPassword("9826").enterConfPassword("9826").enterFirstName("Rohit")
		.enterLastName("Patil").enterMobileNo("9009856985").enterEmail("16vikas@gmail.com")
		.selectDept("Testing")
		.accessRight("All")
		.submit()
		.editUser("TestEngg")
		.deleteUsr()
		.alertAccept();
		Thread.sleep(15000);
		 //table//tbody/tr[@class = 'oddRow' or @class = 'evenRow']/td/a 
		
	}
	
	
}
