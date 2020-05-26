package com.selenium.TestApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {

	@Test
	public void Login() {
		System.out.println("Test Login");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://hesperia.com");
		
		driver.quit();
	}
}
