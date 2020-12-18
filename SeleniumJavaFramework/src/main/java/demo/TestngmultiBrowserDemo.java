package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngmultiBrowserDemo {
	
	WebDriver driver=null;
	String projectPath=System.getProperty("user.dir");
	
	@BeforeTest
	@Parameters("browsernamex")
	public void setup(String browsername)
	{
		System.out.println("Browser Name is : "+browsername);
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		

		
	}
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		System.out.println("Test Completed");
	}

}
