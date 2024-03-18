package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import drivers.DriverManager;

public class UserListPage extends Basepage {

	By listedUsr = By.xpath("//table//tbody/tr[@class = 'oddRow' or @class = 'evenRow']/td/a");
	
	
	public void ListedUser() {
		 List<WebElement> liUser = DriverManager.getDriver().findElements(listedUsr);
		       System.out.println(liUser.size());
		       for(WebElement user : liUser ) {
		    	    System.out.println(user.getText());
		    	    
		       }
	}
	
	
	
}
