package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import reports.ExtentReport;

public class LoginTest extends BaseTest {

	
	@Test
	public void loginTest() throws Exception {
		
		ExtentReport.createTest("Login Test");
		LoginPage lpage = new LoginPage();
		HomePage hpage =  lpage.enterUserName("manager").enterPassWord("12345").clickOnCheckBox().clickOnLoginBtn();
		hpage.clickOnUser().clikOnCreateUser().enterUserName("Rohit123").selectStatus("enabled").enterPassword("9826").enterConfPassword("9826").enterFirstName("Rohit")
		.enterLastName("Patil").enterMobileNo("9009856985").enterEmail("16vikas@gmail.com")
		.selectDept("Testing")
		.effDate("Feb 15, 2024")
		.accessRight("Generate Cost & Billing Reports");
	}
}
