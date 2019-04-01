package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class NewOfferOnSignUp extends ReUsable
{
	public static void NewOffer() throws InterruptedException
	{
		System.out.println("TC2-D_SignUp to XERO");
		logger = report.startTest("D_SignUp to XERO");
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
		
		WebElement NewOffer = driver.findElement(By.linkText("offer details"));
		click_On_Link(NewOffer, "Terms of Use");
		if(NewOffer.isDisplayed())
		{
			logger.log(LogStatus.PASS," A new offer details web page is open.");
		}
		else
		{
			logger.log(LogStatus.FAIL," A new offer details web page is not open.");
		}
		//driver.quit();
	}
}
