package browsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Googlesearchpageupdate;

public class GoogleSearchpageTestng {
	
static WebDriver driver=null;
	
	@BeforeTest
	public void setuptest()
	{
		String projectPath=System.getProperty("user.dir");
		System.out.println("ProjectPath: "+projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
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
	public void teardown()
	{
		driver.close();
		System.out.println("Test Passed");

	}

}
