package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExceptionHandlingDemo {
	
	static Logger logger=LogManager.getLogger(ExceptionHandlingDemo.class);
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println("Hello world..!!");
			logger.info("Printing");
			
			int i=1/0;
			
			System.out.println("Completed");
		}
		
		catch(Exception exp)
		{
			System.out.println("I am inside catch block");
			System.out.println("Message is: "+exp.getMessage());
			System.out.println("Cause is: "+exp.getCause());
			exp.printStackTrace();
		}
	}

}
