package com.sel.basics;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser 
{
@Test
public void launch() 
{
	WebDriver driver=WebDriverManager.chromedriver().create();
	driver.get("https://www.makemytrip.com");
	
}
}
