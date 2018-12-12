package com.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paremater_Test {
	
	WebDriver driver;
	
	//Environment variables
	@Parameters({"env","browser","url","emailid"})
	
	@Test 
	public void yahooLoginTest(@Optional ("myValue") String env ,String browser ,String url,String emailid) {
		if(browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	
		driver=new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe ");	
			driver=new FirefoxDriver();
			
		}
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailid);
	    driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
