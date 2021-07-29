package listerners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(listerners.TestNgListeners.class)
public class TestNglisternersDEmo {
	@Test
	public void test1()
	{
		System.out.println("Iam test1");
	}
	@Test
	public void test2()
	{
		System.out.println("Iam test2");
		Assert.assertTrue(false);
	}
	@Test
	public void test3()
	{
		System.out.println("Iam test3");
		throw new SkipException("test is skipped");
	}

}
