package com.project.utilities;

import org.openqa.selenium.WebDriver;

public class commons
{
	public WebDriver driver;
	 
	public void url(WebDriver driver, String Browserurl)
	{
		try
		{
			driver.get("Browserurl");
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		
		}
	}
}
