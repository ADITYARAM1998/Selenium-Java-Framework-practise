package TestngPrioties;

import org.testng.annotations.Test;

public class TestNgPriorityDemo {
	
	@Test(priority=1)
	public void test1()
	{
		System.out.println("The test1");
	}
	@Test(priority=3)
	public void test2()
	{
		System.out.println("The test2");
	}
	@Test(priority=2)
	public void test3()
	{
		System.out.println("The test3");
	}

}
