package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class subscription extends ReUsable
{
	public static void Subscription() throws InterruptedException
	{
		System.out.println("TC10-A_Check if users can lookout for their subscription");
		logger = report.startTest("Check if users can lookout for their subscription");
		InitializeDriver();
		logger.log(LogStatus.INFO, "Chrome browser Launched.");
		Launch("https://www.xero.com/us/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Beautiful Business & Accounting Software | Xero US";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title Matched");
			logger.log(LogStatus.PASS," Xero Log in page is Opened.");
		}
		else
		{
			System.out.println("Title didn't match");
			logger.log(LogStatus.FAIL,"Xero Log in page is not Opened.");
		}
		WebElement ClickLogin = driver.findElement(By.partialLinkText("Login"));
		click_On_Button(ClickLogin, "Login");

		Login.LoginPage();

		Thread.sleep(2000);

		WebElement Business = driver.findElement(By.xpath("//button[contains(text(),'Business')]"));
		click_On_Button(Business, "Business");

		WebElement BillPay = driver.findElement(By.linkText("Bills to pay"));
		click_On_Link(BillPay, "Bills To Pay");

		WebElement Paid= driver.findElement(By.xpath("//a[@href='/AccountsPayable/Search.aspx?invoiceStatus=INVOICESTATUS%2fPAID']"));
		if(Paid.isDisplayed())
		{
			click_On_Button(Paid, "Paid");
			logger.log(LogStatus.PASS, "User can get information for paid bills");
		}
		else
		{
			logger.log(LogStatus.FAIL, "User can not get information for paid bills");
		}
		
		WebElement Repeating= driver.findElement(By.xpath("//a[@href='/AccountsPayable/SearchRepeating.aspx']"));
		if(Repeating.isDisplayed())
		{
			click_On_Button(Repeating, "Repeating");
			logger.log(LogStatus.PASS, "User can get information for repeating bills");
		}
		else
		{
			logger.log(LogStatus.FAIL, "User can not get information for repeating bills");
		}
		
		WebElement SeeAll= driver.findElement(By.xpath("//a[@href='/AccountsPayable/Search.aspx']"));
		if(SeeAll.isDisplayed())
		{
			click_On_Button(SeeAll, "SeeAll");
			logger.log(LogStatus.PASS, "User can get information for all bills");
		}
		else
		{
			logger.log(LogStatus.FAIL, "User can not get information for all bills");
		}
	}
}
