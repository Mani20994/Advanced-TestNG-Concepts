package testngsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Home_Page_Test {
	WebDriver driver;

	@BeforeMethod
	public void setUP() {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	
		driver=new ChromeDriver();	
			
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.demo.iscripts.com/netmenus/mrml/admin");
		login("admin","admin");	
		
	}	
	
	@Test(priority=1)
	public void clickRestaurantTest() {
		
		WebElement restaurant=driver.findElement(By.xpath("//a[@href='https://www.demo.iscripts.com/netmenus/mrml/cms?section=restaurant']"));
		restaurant.click();
	}
	
	@Test(priority=2)
	public void clickOnCouponCodeTest()
	{
       
		WebElement couponcode=driver.findElement(By.xpath("//a[contains(text(),'Coupon Codes')]"));
		couponcode.click();
			
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	public void login(String username,String password) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys(password); 
		  
		  WebElement loginBtn=driver.findElement(By.xpath("//button[@value='submit']"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();",loginBtn);
}
	
}
