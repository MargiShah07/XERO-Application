package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

public class SignUp extends ReUsable
{
	public static void TrytoSignUp() throws InterruptedException
	{
		System.out.println("TC2-B_SignUp to XERO");
		logger = report.startTest("B_SignUp to XERO");
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
		WebElement TermsAndCondition = driver.findElement(By.name("TermsAccepted"));
		SelectCheckBox(TermsAndCondition, "Terms And Condition");
		if(TermsAndCondition.isSelected())
		{
			logger.log(LogStatus.PASS, "check box Check is displayed");
		}
		else
		{
			logger.log(LogStatus.FAIL, "check box Check is not displayed");
		}

		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement GetStarted = driver.findElement(By.xpath("//button[@type='submit']"));
//		if(GetStarted.isDisplayed())
//		{
//			click_On_Button(GetStarted, "Get Started");
//			String actlTitle = driver.getTitle();
//			String expctedTitle = "Sign up for Xero & Trial Free | Xero | Xero US";
//			if(actlTitle.equalsIgnoreCase(expctedTitle))
//			{
//				System.out.println("Title Matched");
//				logger.log(LogStatus.PASS," Inbox page is displayed.");
//			}
//			else
//			{
//				logger.log(LogStatus.FAIL, "Inbox page is not displayed");
//			}
//		}
//		Thread.sleep(3000);
//		WebElement FNEmpty = driver.findElement(By.xpath("//span[@id='signup-form-error-message-1']"));
//		WebElement LNEmpty = driver.findElement(By.xpath("//span[@id='signup-form-error-message-2']"));
//		WebElement EIdEmpty = driver.findElement(By.xpath("//span[@id='signup-form-error-message-3']"));
//		WebElement PNoEmpty = driver.findElement(By.xpath("//span[@id='signup-form-error-message-4']"));
//		if(FNEmpty.isDisplayed() && LNEmpty.isDisplayed() && EIdEmpty.isDisplayed() && PNoEmpty.isDisplayed())
//		{
//			logger.log(LogStatus.PASS," First name,Last name,Email address, Phone number can't be empty is dispalyed.");
//		}
//		else
//		{
//			logger.log(LogStatus.FAIL, "First name,Last name,Email address, Phone number can't be empty is not dispalyed.");
//		}
		
		WebElement Email = driver.findElement(By.name("EmailAddress"));
		EnterText(Email,"Email Address", "margishah59yahoo.com");
		if(Email.isDisplayed())
		{	
			logger.log(LogStatus.PASS, " Entered email address is displayed.");
		}
		else
		{
			logger.log(LogStatus.FAIL, " Entered email address is not displayed.");
		}
		
		WebElement GetStarted = driver.findElement(By.xpath("//button[@type='submit']"));
		if(GetStarted.isDisplayed())
		{
			click_On_Button(GetStarted, "Get Started");
			String actlTitle = driver.getTitle();
			String expctedTitle = "Sign up for Xero & Trial Free | Xero | Xero US";
			if(actlTitle.equalsIgnoreCase(expctedTitle))
			{
				System.out.println("Title Matched");
				logger.log(LogStatus.PASS," Inbox page is displayed.");
			}
			else
			{
				logger.log(LogStatus.FAIL, "Inbox page is not displayed");
			}
		}
	}
}
