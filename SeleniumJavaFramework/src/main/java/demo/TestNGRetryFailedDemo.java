package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2");
		int i=1/0;
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test3");
		Assert.assertTrue(0>1);
	}

}
