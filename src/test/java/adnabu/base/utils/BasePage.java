package adnabu.base.utils;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BasePage extends SeleniumBaseUtils{

	/**
	 * This Function is to Open Browser
	 * 
	 * @author Muthulakshmi 
	 * Created Date:23/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	
	@BeforeMethod
	@Parameters("browser")
	public static void openBrowser(String browser) throws Exception {
	try {
		browserOpen(browser);
	}catch(Exception e) {
		reportStatus("FAIL", e.getMessage());
	}
	}
	
	/**
	 * This Function is to Launch AdNabu-Sumit URL
	 * 
	 * @author Muthulakshmi 
	 * Created Date:23/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public static void launchAdNabuSumitURL() throws Exception {
	try {
		loadUrl("https://adnabu-arjun.myshopify.com/");
		windowMaximize();
	}catch(Exception e) {
		reportStatus("FAIL", e.getMessage());
	}
	}
	
	/**
	 * This Function is Wait for Loader
	 * 
	 * @author Muthulakshmi 
	 * Created Date:23/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public static void waitForLoader() throws Exception {
	try {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	}catch(Exception e) {
		reportStatus("FAIL", e.getMessage());
	}
	}
	
	/**
	 * This Function is to get the Test data from TestData.properties file
	 * 
	 * @author Muthulakshmi 
	 * Created Date:23/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public static String getTestData(String key) throws Exception {
	String value = null;
	try {
		FileReader read = new FileReader("./Resources/Data/TestData.properties");
		
		Properties prop = new Properties();
		prop.load(read);
		//String value = prop.get(key);
		value = prop.getProperty(key);
	}
	catch(Exception e) {
		reportStatus("FAIL", e.getMessage());
	}
	return value;
	}

	/**
	 * This Function is to get the data from ValidationData.properties file
	 * 
	 * @author Muthulakshmi 
	 * Created Date:25/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public static String getValidationData(String key) throws Exception {
	String value = null;
	try {
		FileReader read = new FileReader("./Resources/Data/ValidationData.properties");
		
		Properties prop = new Properties();
		prop.load(read);
		value = prop.getProperty(key);
	}
	catch(Exception e) {
		reportStatus("FAIL", e.getMessage());
	}
	return value;
	}
}
