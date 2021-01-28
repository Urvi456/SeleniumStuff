package com.wca.alerts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.wca.utils.AutomationContext;

public class AlertTest {
	@Test
	public void TestAlert() {
			WebDriver driver=AutomationContext.environmentSetup();
			driver.get("https://www.spicejet.com/");
	}
}
