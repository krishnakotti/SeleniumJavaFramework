package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception, InterruptedException {
		autoittest();
	}
	
	public static void autoittest() throws IOException, InterruptedException
	{
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		
		driver.findElement(By.name("userfile")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\user\\OneDrive\\Desktop\\Fileuploadscript.exe");
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
