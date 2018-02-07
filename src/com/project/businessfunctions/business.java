package com.project.businessfunctions;

import org.openqa.selenium.WebDriver;

import com.project.utilities.commons;

public class business extends commons
{
	public void login(WebDriver driver)
	{
		url(driver, "https://www.google.co.in");
	}

}
