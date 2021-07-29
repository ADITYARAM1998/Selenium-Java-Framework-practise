package listerners;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testretry {
	@Test
	public void test1()
	{
		System.out.println("hello1");
	}
	@Test
	public void test2()
	{
		System.out.println("hello2");
		
	}
	@Test(retryAnalyzer  =listerners.TestNgretryingfailures.class)
	public void test3()
	{
		System.out.println("hello3");
		Assert.assertTrue(false);
	}

}
