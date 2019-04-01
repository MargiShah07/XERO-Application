package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class TermsAndCondition extends ReUsable
{
	public static void TermsCondition() throws InterruptedException
	{
		System.out.println("TC2-C_SignUp to XERO");
		logger = report.startTest("C_SignUp to XERO");
		InitializeDriver();
		logger.log(LogStatus.INFO, "Chrome browser Launched.");
		Launch("https://www.xero.com/us/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Beautiful Business & Accounting Software | Xero US";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title Matched");
			logger.log(LogStatus.PASS," Xero application page is displayed.");
		}
		else
		{
			System.out.println("Title didn't match");
			logger.log(LogStatus.FAIL," Xero application page is not displayed.");
		}

		Thread.sleep(2000);
		WebElement FreeTrial = driver.findElement(By.linkText("Free trial"));
		if(FreeTrial.isDisplayed())
		{
			String ActlTitle = driver.getTitle();
			String expectTitle = "Signup for Xero - Free Trial | Xero US";
			if(ActlTitle.equalsIgnoreCase(expectTitle))
			{
				System.out.println("Title Matched");
				logger.log(LogStatus.PASS," 30 day free trial page is displayed.");
			}
			else
			{
				System.out.println("Title didn't match");
				logger.log(LogStatus.FAIL," 30 day free trial page is not displayed.");
			}
		}
		Thread.sleep(4000);
		
		WebElement TermsUse = driver.findElement(By.linkText("terms of use"));
		click_On_Link(TermsUse, "Terms of Use");
		if(TermsUse.isDisplayed())
		{
			logger.log(LogStatus.PASS," A new Xero terms of use web page is open.");
		}
		else
		{
			logger.log(LogStatus.FAIL," A new Xero terms of use web page is not open.");
		}
		
		
		
		WebElement PolicyNotice = driver.findElement(By.linkText("privacy notice"));
		click_On_Link(PolicyNotice, "Policy Notice");
		if(PolicyNotice.isDisplayed())
		{
			logger.log(LogStatus.PASS," A new Privacy policy web page is open.");
		}
		else
		{
			logger.log(LogStatus.FAIL," A new Privacy policy web page is not open.");
		} 
		
	}
}