package drivers;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers {

	//public static WebDriver driver ;


	public static void initDriver() throws Exception {
		
		if(Objects.isNull(DriverManagar.getDriver())) {
			
			DriverManagar.setDriver( new ChromeDriver());
		DriverManagar.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		//DriverManagar.getDriver().get(ReadPropertiesFile.getValue("URL")); 
		//DriverManagar.getDriver().get(ReadPropertiesFile.getValue(ConfigProperties.URL));
          	
		}
		
        DriverManagar.getDriver().manage().window().maximize();
        DriverManagar.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(3000);
        
	}
	
	public static void quiteDriver() {
		
		if(Objects.nonNull(DriverManagar.getDriver())) {
			
			DriverManagar.getDriver().quit();
		DriverManagar.unload();
		
		}
	}

}
