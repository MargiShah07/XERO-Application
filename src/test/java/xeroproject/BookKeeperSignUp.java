package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class BookKeeperSignUp extends ReUsable
{
	public static void ActBookkeeper() throws InterruptedException
	{
		System.out.println("TC2-E_SignUp to XERO");
		logger = report.startTest("E_SignUp to XERO");
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
		
		WebElement BookKeeper = driver.findElement(By.linkText("accountant or bookkeeper"));
		click_On_Link(BookKeeper, "Accountant Or BookKeeper");
		String actlTitle = driver.getTitle();
		String expctedTitle = "Sign up for the Xero Partner Program | Xero US";
		if(actlTitle.equalsIgnoreCase(expctedTitle))
		{
			System.out.println("Title Matched");
			logger.log(LogStatus.PASS," A new Let's start a great partnership web page is open.");
		}
		else
		{
			System.out.println("Title didn't match");
			logger.log(LogStatus.FAIL," A new Let's start a great partnership web page is not open.");
		}
		
	}
}
