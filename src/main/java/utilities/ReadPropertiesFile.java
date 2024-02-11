package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Properties;

import enums.ConfigProperties;


public class ReadPropertiesFile {

	private ReadPropertiesFile() {}
	
private static Properties prop = new Properties();
	
	private static final Map<String, String> CONFIGMAP = new HashMap<>();
		
	static 
	{
	try
		{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\config\\config.properties");
			prop.load(fis);
			
			for (Map.Entry<Object, Object> entry : prop.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
		}
				
		} catch(FileNotFoundException e)
		{
			e.printStackTrace();
			throw new RuntimeException("config.properties not loaded!!!");
			
		} catch(IOException e)
		{
			e.printStackTrace();
			throw new RuntimeException("property file could not load into memory !!!!");
		}
		}
		
		public static String get(ConfigProperties key) throws Exception
		{
			if (Objects.isNull(key)  || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase())))
				throw new Exception("problem in reading property " + key + " please check config.properties file");
			
			return CONFIGMAP.get(key.name().toLowerCase());
		}
		
	 
	}
	
	
	
 

	
