package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depency_In_TestNG {

	@Test
	public void test1() {
		System.out.println("test 1 method");
		Assert.assertTrue(true);
		
		
}
	
	@Test(dependsOnMethods= {"test1"})
	public void test2() {
		System.out.println("test 2 method");
}
	
	
	
	
	
	
	
	
	
	
}
