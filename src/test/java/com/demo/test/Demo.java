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
		System.out.println("Browser launched");



	}
	@Test
	public void openURL()
	{
		driver.get("https://www.google.com/");
		System.out.println("google opened");


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
		System.out.println("Project closed");
	}


}

