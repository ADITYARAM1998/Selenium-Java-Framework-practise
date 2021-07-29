package TestNggrouping;

import org.testng.annotations.Test;

public class TestNgGrouping {
	
	@Test(groups = {"sanity"})
	public void test1()
	{
		System.out.println("The test 1");
	}
	@Test(groups = {"sanity","smoke"})
	public void test2()
	{
		System.out.println("The test 1");
	}
	
	@Test(groups = {"regression"})
	public void test3()
	{
		System.out.println("The test 1");
	}
	@Test
	public void test4()
	{
		System.out.println("The test 1");
	}
}

