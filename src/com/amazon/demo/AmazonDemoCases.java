package com.amazon.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonDemoCases {
	
	@Test
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
		
		System.out.println("Hello");
		
		System.out.println("push check");
		
		System.out.println("asdngsf");
		
		System.out.println("sekfjhsd");
	}
	


}
