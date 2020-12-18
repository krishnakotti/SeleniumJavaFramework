package demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameterdemo {

	
	@Test
	@Parameters({"MyName"})
	public void test1(String name)
	{
		System.out.println("My name is: "+name);
	}
	
	
}
