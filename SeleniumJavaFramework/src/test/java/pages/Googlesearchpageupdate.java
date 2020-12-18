package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Googlesearchpageupdate {
	
	WebDriver driver=null;

	By text_search=By.name("q");
	
	By button_search=By.name("btnK");
	
	public Googlesearchpageupdate(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setTextinsearchbox(String text)
	{
		driver.findElement(text_search).sendKeys(text);
	}
	
	public void clicksearchbutton()
	{
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}

}
