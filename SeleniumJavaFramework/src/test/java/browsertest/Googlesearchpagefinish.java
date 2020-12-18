package browsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Googlesearchpageupdate;

public class Googlesearchpagefinish {

	public static void main(String[] args) {
		googlesearch();
	}
	private static WebDriver driver=null;

	public static void googlesearch()
	{
		String projectPath=System.getProperty("user.dir");
		System.out.println("ProjectPath: "+projectPath);

		//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		Googlesearchpageupdate searchpageobj=new Googlesearchpageupdate(driver);
		driver.get("https://www.google.com/");
		
		searchpageobj.setTextinsearchbox("ABCD");
		searchpageobj.clicksearchbutton();
		
		driver.close();
	}

}
