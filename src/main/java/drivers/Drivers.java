package drivers;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import enums.ConfigProperties;
import utilities.ReadPropertiesFile;

public class Drivers {

	//public static WebDriver driver ;


	public static void initDriver() throws Exception {
		
		if(Objects.isNull(DriverManager.getDriver())) {
			
			DriverManager.setDriver( new ChromeDriver());
		DriverManager.getDriver().get("http://127.0.0.1:82/login.do"); 
		//DriverManagar.getDriver().get(ReadPropertiesFile.getValue("URL")); 
		//DriverManager.getDriver().get(ReadPropertiesFile.get(ConfigProperties.URL));
          	
		}
		
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(3000);
        
	}
	
	public static void quiteDriver() {
		
		if(Objects.nonNull(DriverManager.getDriver())) {
			
			DriverManager.getDriver().quit();
			DriverManager.unload();
		
		}
	}

}
