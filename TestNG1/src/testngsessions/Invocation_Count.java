package testngsessions;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(invocationCount=5)
	public void searchTest() {
	System.out.println("My search test");
	}
	
	@Test(timeOut=10)
	public void logoTest() {
	System.out.println("logo test");
	
}
}