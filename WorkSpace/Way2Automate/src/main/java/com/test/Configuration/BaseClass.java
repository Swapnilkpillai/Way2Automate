package com.test.Configuration;

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static Properties OR = null;
	public static Properties CON = null;
	public static WebDriver driver = null;
	//public static String isLoggingin = null;
	
//	static Logger BaseTest_Logs = Logger.getLogger("BaseTest");
	
	public static void CallURL(String TestUrl) throws Exception {
	
		driver.get(TestUrl);
		}
		
	
	
	public static void InitialiseParameter() throws Exception {

	//	BaseTest_Logs.info("Reading Properties File");
		ClassLoader classloader = Thread.currentThread()
				.getContextClassLoader();

		CON = new Properties();
		InputStream configReader = classloader
				.getResourceAsStream("config.properties");
		CON.load(configReader);

		OR = new Properties();
		InputStream orReader = classloader.getResourceAsStream("OR.properties");

		OR.load(orReader);

		// }

	}
	
	public static void CloseBrowser() throws Exception {
		driver.quit();
	}
	
	
	
				
	public static void InitialiseDriver() {
	//	BaseTest_Logs.info("Reading Driver Configuration");
		if (driver == null) {
			/*
			if (CON.getProperty("Browser").equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"src//test//resource//chromedriver.exe");
				driver = new ChromeDriver();
				}
			*/
			
			
			//	System.setProperty("webdriver.firefox.marionette", "G:\\Selenium Jars\\geckodriver.exe");
			    System.setProperty("webdriver.firefox.marionette", "\\src\test\\resource\\geckodriver.exe");
			    driver = new FirefoxDriver();
			}

		//	BaseTest_Logs.info("Maximize Browser");
			driver.manage().window().maximize();
		//	BaseTest_Logs.info("Applying Implicit Wait");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//	BaseTest_Logs.info("Reading Page Load TimeOut");
			driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
		}
	
	

	
	public static void Uncheck_CheckBox() {
	}
	
	public static void check_CheckBox() {
	}
	public static void click_link() {
	}
	
	
	public static void Set_Value_In_TextBox(String value, String location){
		driver.findElement(By.xpath(location)).sendKeys(value);
		}
	
	public static void Click_Button(String location){
		driver.findElement(By.xpath(location)).click();
	}



}
