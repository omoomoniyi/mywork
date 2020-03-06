package com.w2a.testcase.applicant;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class Homepage extends TestBase {
	
	
	@Test
	public void launchWebsite () throws InterruptedException {
		
		
		
		driver.findElement(By.xpath(OR.getProperty("contactmenu_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("howtoPay_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("utme/deRemedial_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("studentGuide_XPATH"))).click(); 
		
	
		//Scroll down to bottom of a page
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		Thread.sleep(5000);

		driver.findElement(By.xpath(OR.getProperty("privacyPolicy_XPATH"))).click();
		
		
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(OR.getProperty("termsofService_XPATH"))).click();
		
		
		
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		
		driver.findElement(By.xpath(OR.getProperty("twitterSocial_XPATH"))).click();
		
		Thread.sleep(5000);
		
		
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		
		driver.findElement(By.xpath(OR.getProperty("facebookSocial_XPATH"))).click();
		
		Thread.sleep(5000);

		
	}
	

}
