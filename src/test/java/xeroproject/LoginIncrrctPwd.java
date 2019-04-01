package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class LoginIncrrctPwd extends ReUsable
{
	public static void IncorrectPassword() throws InterruptedException
	{
		System.out.println("TC1-B_Incorrect Password");
		logger = report.startTest("Incorrect Password");
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

		WebElement un = driver.findElement(By.id("email"));
		EnterText(un,"User Name", "mshah9190@gmail.com");
		if(un.isDisplayed())
		{	
			logger.log(LogStatus.PASS, " User Name is displayed in User name field.");
		}
		else
		{
			logger.log(LogStatus.FAIL, " User Name is not displayed in User name field.");
		}

		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.id("password"));
		EnterText(pass,"Password", "mnshah09");
		if(pass.isDisplayed())
		{
			logger.log(LogStatus.PASS, " Password is displayed in password field.");
		}
		else
		{
			logger.log(LogStatus.FAIL, " Password is not displayed in password field.");
		}

		WebElement Login = driver.findElement(By.id("submitButton"));
		click_On_Button(Login, "Login");
		
		WebElement ErrorMsg = findElement(By.xpath("//p[contains(text(),'Your email or password is incorrect')]"), "Error Message");
		System.out.println(ErrorMsg.getText());
		if(ErrorMsg.isDisplayed())
		{
			logger.log(LogStatus.PASS, " Error Message: Your Email or Password is incorrect.");
		}
		else
		{
			logger.log(LogStatus.FAIL, " Error Message: Your Email or Password is incorrect. is not Displayed.");
		}
	}
}
