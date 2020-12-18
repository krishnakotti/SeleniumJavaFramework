package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitsDemo {
	
	static WebDriver driver=null;
	static String projectPath=System.getProperty("user.dir");
	
	public static void main(String[] args) {
		
		seleniumWaits();
	}
	
	public static void seleniumWaits()
	{
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.name("q")).sendKeys("Automationstepbystep");
			driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
			
			WebDriverWait wait=new WebDriverWait(driver, 20);
			WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("abc")));
			
			driver.close();

	}

}
