package com.amazon.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemoCases {
	
	public static void toDoAmazonCases()
	
	{
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+ "/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);		
		String titleText = driver.getTitle();
		System.out.println(titleText);
		driver.close();
	}
	
	public static void main(String args[])
	{
		toDoAmazonCases();
	}
	
	

}
