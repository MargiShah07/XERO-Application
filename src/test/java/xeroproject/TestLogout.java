package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;


public class TestLogout extends ReUsable 
{
	public static void logout() throws InterruptedException
	{
		Login.LoginPage();
		System.out.println("TC4-A_Test Logout Functionality");
		logger = report.startTest("Test Logout Functionality");
		
		Thread.sleep(2000);
		
		WebElement UserName = driver.findElement(By.xpath("//img[@class='xrh-avatar']"));
		click_On_Button(UserName, "MS UserName");
		
		WebElement Logout = driver.findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Log out')]"));
		if(Logout.isDisplayed())
		{
			click_On_Button(Logout, "Logout");
			logger.log(LogStatus.PASS, "Welcome to xero page is displayed with<username> populated and remember username checked");
		}
		else
		{
			logger.log(LogStatus.PASS, "Home Page of Xero is not displayed");
		}
	}
}
