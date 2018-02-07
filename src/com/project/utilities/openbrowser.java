package com.project.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class openbrowser extends commons
{
	public WebDriver diffBrowser(String browservalue)
	{
	 try
	  {		
		if(browservalue.equalsIgnoreCase("chrome"))
		{ 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sampa\\workspace\\ProjectPractise\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sampa\\workspace\\ProjectPractise\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browservalue.equalsIgnoreCase("IE"))
		{ 
			
			driver = new InternetExplorerDriver();
		}
	  }catch(Exception e)
	 {
		  System.out.println("Invalid browser tpye name");
	 }
	return driver;
	}
}
