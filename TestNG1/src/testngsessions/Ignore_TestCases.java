package testngsessions;

import org.testng.annotations.Test;

public class Ignore_TestCases {
	
    @Test
     public void test1() {
	System.out.println("test");
	}
     
     //to skip the test case "enabled" key word is used
    @Test(enabled=false)
    public void test2() {
	System.out.println("test");
	}    
    
    @Test
    public void test3() {
	System.out.println("test");
	}
    
    @Test(enabled=false)
    public void test4() {
	System.out.println("test");
	}
    
    @Test
    public void test5() {
	System.out.println("test");
	}
    
    @Test
    public void test6() {
	System.out.println("test");
	}
    
   
     
     
     
     
}