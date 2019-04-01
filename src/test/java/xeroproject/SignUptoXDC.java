package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

public class SignUptoXDC extends ReUsable 
{
	public static void SignUp() throws InterruptedException
	{
		System.out.println("TC2-A_SignUp to XERO");
		logger = report.startTest("A_SignUp to XERO");
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
		
		WebElement Fname = driver.findElement(By.name("FirstName"));
		EnterText(Fname,"First Name", "Margie");
		if(Fname.isDisplayed())
		{	
			logger.log(LogStatus.PASS, " User Text is displayed.");
		}
		else
		{
			logger.log(LogStatus.FAIL, " User Text is not displayed.");
		}
		
		WebElement Lname = driver.findElement(By.name("LastName"));
		EnterText(Lname,"Last Name", "Shah");
		if(Lname.isDisplayed())
		{	
			logger.log(LogStatus.PASS, " User Text is displayed.");
		}
		else
		{
			logger.log(LogStatus.FAIL, " User Text is not displayed.");
		}
		
		WebElement Email = driver.findElement(By.name("EmailAddress"));
		EnterText(Email,"Email Address", "margishah59@yahoo.com");
		if(Email.isDisplayed())
		{	
			logger.log(LogStatus.PASS, " Entered email address is displayed.");
		}
		else
		{
			logger.log(LogStatus.FAIL, " Entered email address is not displayed.");
		}
		
		WebElement PhoneNo = driver.findElement(By.name("PhoneNumber"));
		EnterText(PhoneNo,"Phone Number", "2156051759");
		if(PhoneNo.isDisplayed())
		{	
			logger.log(LogStatus.PASS, " Entered Number is displayed.");
		}
		else
		{
			logger.log(LogStatus.FAIL, " Entered Number is not displayed.");
		}
		
		Select country = new Select(driver.findElement(By.name("LocationCode")));
		country.selectByValue("US");
//		WebElement Country = driver.findElement(By.name("LocationCode"));
//		EnterText(Country,"Country Name", "margishah59@yahoo.com");
		if(country.equals(country))
		{	
			logger.log(LogStatus.PASS, " Selected Country is displayed.");
		}
		else
		{
			logger.log(LogStatus.FAIL, " Selected Country is not displayed.");
		}
		
		Thread.sleep(5000);
		
		WebElement captcha = driver.findElement(By.id("xero-recaptch-data"));
		SelectCheckBox(captcha, "Robot Captcha");
		
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
		
		Thread.sleep(5000);
		WebElement GetStarted = driver.findElement(By.linkText("Get started"));
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
