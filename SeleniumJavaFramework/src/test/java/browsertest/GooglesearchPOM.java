package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Googlesearchpage;

public class GooglesearchPOM {
	
	private static WebDriver driver=null;

	public static void main(String[] args) {
		googlesearch();
	}
	
	public static void googlesearch()
	{
		String projectPath=System.getProperty("user.dir");
		System.out.println("ProjectPath: "+projectPath);

		//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("Automationstepbystep");
		Googlesearchpage.textbox_search(driver).sendKeys("Automationstepbystep");

		//driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		Googlesearchpage.button_search(driver).sendKeys(Keys.ENTER);


		driver.close();
	}
}
