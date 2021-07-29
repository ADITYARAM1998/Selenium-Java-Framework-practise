package TestngDependencies;

import org.testng.annotations.Test;

public class TestNgDependencies {

	
	@Test(dependsOnMethods =   {"t2"},priority=1)
	public void t1()
	{
		System.out.println("test 1");
	}
	@Test(priority=2)
	public void t2()
	{
		System.out.println("test 2");
	}
}
