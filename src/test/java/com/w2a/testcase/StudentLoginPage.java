package com.w2a.testcase;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class StudentLoginPage extends TestBase {

	@Test
	public void validlogin () throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("userID_XPATH"))).sendKeys(OR.getProperty("userTXT_XPATH"));
		driver.findElement(By.xpath(OR.getProperty("passwordID_XPATH"))).sendKeys(OR.getProperty("passwordTXT_XPATH"));
		Thread.sleep(3000);

		driver.findElement(By.xpath(OR.getProperty("checkBTN-XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("signinBTN_XPATH"))).click();
		Thread.sleep(10000);
		
	
		
				
	}
	
		
}