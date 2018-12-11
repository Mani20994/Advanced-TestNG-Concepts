package testngsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasics {
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
			
}	
	
	@Test(priority=1)
	public void verifyPageTitleTest() {
	String title=driver.getTitle();
	System.out.println("the page title is:"+title);
		
	Assert.assertEquals(title, "NetMenus3 : Admin");
}
	
	@Test(priority=2)
	public void verifyNetMenusLogoTest() {
	boolean flag =driver.findElement(By.xpath("//img[@src='https://www.demo.iscripts.com/netmenus/mrml/project/styles/images/logo_admin.png']")).isDisplayed();
		Assert.assertTrue(flag);
}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
