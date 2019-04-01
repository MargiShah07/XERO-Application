package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class ForgotPWD extends ReUsable
{
	public static void ForgotPassword() throws InterruptedException
	{
		System.out.println("TC1-D_Forgot Password");
		logger = report.startTest("Forgot Password");
		InitializeDriver();
		logger.log(LogStatus.INFO, "Chrome browser Launched.");
		Launch("https://login.xero.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Login | Xero Accounting Software";
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

		WebElement forgotpwd = driver.findElement(By.className("forgot-password-advert"));
		if(forgotpwd.isDisplayed())
		{
			click_On_Link(forgotpwd, "Login");
			logger.log(LogStatus.PASS, " Xero forgot password page is displayed");
		}
		else
		{
			logger.log(LogStatus.FAIL, "Xero forgot password page is not displayed.");
		}
		
		WebElement email = driver.findElement(By.id("UserName"));
		email.clear();
		EnterText(email, "Email Id for forgot password", "mshah9190@gmail.com");
		
		WebElement SendLink = driver.findElement(By.className("text"));
		if(SendLink.isDisplayed())
		{
			click_On_Button(SendLink, "Login");
			String actTitle = driver.getTitle();
			String expTitle = "Forgotten Password";
			if(actTitle.equalsIgnoreCase(expTitle))
			{
				System.out.println("Title Matched");
				//				logger.log(LogStatus.PASS," SFDC login page is opened");
				logger.log(LogStatus.PASS, "A link to reset your password has been sent to:" + email);
			}

			else
			{
				System.out.println("Title didn't match");
				logger.log(LogStatus.FAIL," Reset Page is not displayed.");
			}
		}
		else
		{
			logger.log(LogStatus.FAIL, "Reset Page is not displayed.");
		}
	}
}