package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import browsertest.Testngdemo;

public class PropertiesFile {

	static Properties pro=new Properties();
	static String projectpath=System.getProperty("user.dir");


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		getproperties();
	}

	public static void getproperties() throws FileNotFoundException
	{
		try
		{
			Properties pro=new Properties();
			String projectpath=System.getProperty("user.dir");
			InputStream input=new FileInputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
			pro.load(input);
			String browser=pro.getProperty("browser");
			System.out.println(browser);
			Testngdemo.browsername=browser;
		}
		catch (Exception exp) 
		{
			System.out.println("Message is: "+exp.getMessage());
			System.out.println("Cause is: "+exp.getCause());
			exp.printStackTrace();
		}
		
		
	}

	public static void setproperties() throws FileNotFoundException
	{
		try
		{
			OutputStream output=new FileOutputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
			pro.setProperty("result", "pass");
			pro.store(output, null);
		}
		
		catch (Exception exp) {
			System.out.println("Message is: "+exp.getMessage());
			System.out.println("Cause is: "+exp.getCause());
			exp.printStackTrace();		}
		

	}
}
