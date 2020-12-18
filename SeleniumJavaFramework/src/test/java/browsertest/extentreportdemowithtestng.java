package browsertest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreportdemowithtestng {

	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
	 htmlReporter = new ExtentHtmlReporter("extentreports.html");
	 extent = new ExtentReports();
	 extent.attachReporter(htmlReporter);
	}
	
	@BeforeTest
	public void setuptest()
	{
		String projectPath=System.getProperty("user.dir");
		System.out.println("ProjectPath: "+projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void test1() throws IOException
	{
        ExtentTest test = extent.createTest("Google Search Test", "Checking the functionality of Google Search");
		
        driver.get("https://www.google.com/");

        test.log(Status.INFO, "This step shows usage of log(status, details)");

        test.info("This step shows usage of info(details)");
        
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterTest
	public void teardowntest()
	{
		driver.close();
		System.out.println("Test Passed");
	}
	
	@AfterSuite
	public void teardown()
	{
        extent.flush();

	}

}
