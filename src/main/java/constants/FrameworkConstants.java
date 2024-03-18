package constants;

import java.time.Duration;

public final class FrameworkConstants {

	private FrameworkConstants() {}
	
	private static final String  RESOURCEPATH = System.getProperty("user.dir");
	private static final String CONFIGMAPFILEPATH = RESOURCEPATH + "/src/test/resources/config/config.properties";
	private static final Duration EXPLICITWAIT = Duration.ofSeconds(5);
	
	public static Duration getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static String getRESOURCEPATH() {
		return RESOURCEPATH;
	}
	
	public static String getCONFIGMAPFILEPATH() {
		return CONFIGMAPFILEPATH;
	}

	
	
	
}
