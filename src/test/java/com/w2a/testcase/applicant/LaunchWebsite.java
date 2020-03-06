package com.w2a.testcase.applicant;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class LaunchWebsite extends TestBase {
	
	
	@Test
	public void launchWebsite () throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("contactmenu_XPATH"))).click();
		Thread.sleep(3000);

		
		
	}
	

}
