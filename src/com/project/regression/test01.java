package com.project.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test01 
{
	public WebDriver driver;
	
	@BeforeTest
	public void before()
	{
		
		try{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sampa\\workspace\\ProjectPractise\\drivers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void Tc01()
	{
		try
		{
			driver.get("https://www.google.co.in");
		}
		catch(Exception e)
		{
			System.out.println("Test01 is failed " + e.getMessage());
		}
	}

}
