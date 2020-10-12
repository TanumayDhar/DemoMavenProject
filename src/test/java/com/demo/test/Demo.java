package com.demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo{

	WebDriver driver;

	@BeforeTest
	public void SetUP()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");

		driver= new ChromeDriver();

		driver.manage().window().maximize();



	}
	@Test
	public void openURL()
	{
		driver.get("https://www.google.com/");


	}

	@Test
	public void printHello()
	{
		System.out.println("Hello world");

	}

	@AfterTest
	public void closeProject()
	{

		driver.close();
	}


}

