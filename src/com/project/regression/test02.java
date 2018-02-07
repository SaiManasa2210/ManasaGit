package com.project.regression;

import org.testng.annotations.Test;

import com.project.businessfunctions.business;
import com.project.utilities.commons;
import com.project.utilities.openbrowser;


public class test02 extends commons
{
	 public openbrowser browser = new openbrowser();
	 public business busi = new business();
	 
	@Test
	public void m1(String browserkey)
	{
		
		driver = browser.diffBrowser("browservalue");
		
	}
	
}
