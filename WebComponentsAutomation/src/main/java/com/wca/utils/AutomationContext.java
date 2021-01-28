package com.wca.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationContext {

		public static WebDriver environmentSetup(){
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
	
}
