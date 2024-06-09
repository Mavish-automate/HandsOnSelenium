package com.sel.basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Nse 
{
	
public WebDriver driver;
String url="https://www.nseindia.com/";

@Test
public void data() 
{
	driver=new FirefoxDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement search = driver.findElement(By.id("header-search-input"));
	search.sendKeys("ARVIND");
	search.click();
	
	
	
}
}
