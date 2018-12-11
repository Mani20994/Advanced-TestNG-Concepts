package testngsessions;

import org.testng.annotations.Test;

public class TestNGGroups {
	
//To group the test case "Groups" key word is used
	@Test(groups= {"home page"},priority=1)
	public void logoTest() {
		System.out.println("logo test");
	}
	
	@Test(groups= {"Search page"})
	public void SearchTest() {
		System.out.println("search test");
	}
	
	@Test(groups= {"reg page"})
	public void RegTest() {
		System.out.println("Reg page test");
	}
	@Test(groups= {"Login page"})
	public void LoginTest() {
		System.out.println("reg page test");
	}
	@Test(groups= {"login  page"})
	public void signUpTest() {
		System.out.println("sign up test");
	}
	
}
