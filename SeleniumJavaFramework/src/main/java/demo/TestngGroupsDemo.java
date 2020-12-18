package demo;

import org.testng.annotations.Test;

public class TestngGroupsDemo {
	
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(groups= {"sanity","smoke"})
	public void test2()
	{
		System.out.println("Test2");
	}
	
	@Test(groups= {"smoke"})
	public void test3()
	{
		System.out.println("Test3");
	}

}
