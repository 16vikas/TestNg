package tests;


import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.OrangeHRMLoginPage;
import reports.ExtendReport;

public class HrmTest extends BaseTest {
	private HrmTest() {};
	
	@Test(dataProvider = "dP1") 
	public void loginLogOutTest(HashMap<String,String>map) throws InterruptedException {
		
		ExtendReport.createTest("Login - LogOut Test"); // this will create a NODE or test name in the ExtentReport --- ExtentReport pr call gya hai 
		
/* 1 	first step ----------------	
  DriverManagar.getDriver().findElement(By.name("username")).sendKeys("Admin");
  DriverManagar.getDriver().findElement(By.name("password")).sendKeys("admin123");
  DriverManagar.getDriver().findElement(By.xpath("//button[@type = 'submit']")).click();
   */     
		
		OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
		
	// 2nd step ---	OrangeHRMHomepage homePage = ohlp.enterUserName("admin").enterPassword("Admin@123").clickOnLoginBtn();
		

		 // OrangeHRMLoginPage loginPage = ohlp.enterUserName("Admin").enterPassword("admin@123").clickOnLoginBtn().clickOnProfilePicArrow().clickLogOutOption();
		
//String actTitle = ohlp.enterUserName("Admin").enterPassword("admin123").clickOnLoginBtn().clickOnProfilePicArrow().clickLogOutOption().getPagetitle();
	
String actTitle = ohlp.enterUserName(map.get("Username")).enterPassword(map.get("Password")).clickOnLoginBtn().clickOnProfilePicArrow().clickLogOutOption().getPagetitle();


	String expTitle = "OrangeHRM";
	Assert.assertEquals(actTitle, expTitle, "Actual title does not match......... ");
	
	Thread.sleep(3000);
	}
	
	@DataProvider
	public Object[] dP1 () {
		Object [] data = new Object [2];
		
		Map<String ,String > map1 = new HashMap<>();
		map1.put("Username", "Admin");
		map1.put("Password", "admin123");
		
		Map<String ,String > map2 = new HashMap<>();
		map2.put("Username", "Admin");
		map2.put("Password", "admin123");
		data[0] = map1;
		data[1] = map2;
		return data;
		
	}
	
	
	
	
	
	
}
