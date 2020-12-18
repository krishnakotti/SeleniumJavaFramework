package browsertest;

import java.io.FileNotFoundException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import demo.Log4jDemo;
import pages.Googlesearchpageupdate;

public class Testngdemo {
	
	static WebDriver driver=null;
	public static String browsername=null;
	private static Logger logger=LogManager.getLogger(Log4jDemo.class);
	
	@BeforeTest
	public void setuptest() throws FileNotFoundException
	{
		String projectPath=System.getProperty("user.dir");
		PropertiesFile.getproperties();
		System.out.println("ProjectPath: "+projectPath);
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
		}

		logger.info("browser Started");
	}
	
	@Test
	public static void googlesearch()
	{
		
		
		Googlesearchpageupdate searchpageobj=new Googlesearchpageupdate(driver);
		driver.get("https://www.google.com/");
		
		searchpageobj.setTextinsearchbox("ABCD");
		searchpageobj.clicksearchbutton();
		
	}
	
	@AfterTest
	public void teardown() throws FileNotFoundException
	{
		driver.close();
		System.out.println("Test Passed");
		PropertiesFile.setproperties();

	}
	
	
	

}
