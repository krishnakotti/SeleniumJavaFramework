package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentreportsBasicDemo {
	
	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreports.html");
        
     // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Google Search Test", "Checking the functionality of Google Search");
        
        String projectPath=System.getProperty("user.dir");
		System.out.println("ProjectPath: "+projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
        test.log(Status.INFO, "Starting the Test Case");
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Automationstepbystep");
		test.pass("Enter text in searchbox");

		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("Press Keyboard Enter Key");

		driver.close();
		test.pass("Broser closed");
		
		test.info("Test Completed");
		
		// calling flush writes everything to the log file
        extent.flush();
	}
	

}
