package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class AllTabs extends ReUsable
{
	public static void TestAllTabs() throws InterruptedException
	{
		Login.LoginPage();
		Thread.sleep(2000);
		System.out.println("TC3-A_Test all tabs page");
		logger = report.startTest("Test all tabs page");
		
		WebElement Dashboard = driver.findElement(By.linkText("Dashboard"));
		if(Dashboard.isDisplayed())
		{
			click_On_Link(Dashboard, "Dashboard");
			logger.log(LogStatus.PASS," you are now in dashboard page.");
		}
		else
		{
			logger.log(LogStatus.FAIL," you are not in dashboard page.");
		}
		
		WebElement Accounting = driver.findElement(By.xpath("//button[contains(text(),'Accounting')]"));
		if(Accounting.isDisplayed())
		{
			click_On_Button(Accounting, "Accounts");
			logger.log(LogStatus.PASS," you are now in account drop down page.");
		}
		else
		{
			logger.log(LogStatus.FAIL," you are not in account drop down page.");
		}
		
		WebElement Contacts = driver.findElement(By.xpath("//button[contains(text(),'Contacts')]"));
		if(Contacts.isDisplayed())
		{
			click_On_Button(Contacts, "Contacts");
			logger.log(LogStatus.PASS," you are now in  contact drop down page.");
		}
		else
		{
			logger.log(LogStatus.FAIL," you are not in  contact drop down page.");
		}
		
		WebElement Tekarch = driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']"));
		if(Tekarch.isDisplayed())
		{
			click_On_Button(Tekarch, "Tekarch");
			logger.log(LogStatus.PASS," you are now in UserMenu drop down page.");
		}
		else
		{
			logger.log(LogStatus.FAIL," you are not in UserMenu drop down page.");
		}
		
		WebElement Settings = driver.findElement(By.xpath("//a[contains(text(),'Settings')]"));
		if(Settings.isDisplayed())
		{
			click_On_Button(Settings, "Settings");
			logger.log(LogStatus.PASS," you are now in Settings page.");
		}
		else
		{
			logger.log(LogStatus.FAIL," you are not in Settings page.");
		}
		
		WebElement New = driver.findElement(By.xpath("//button[@title='Create new']//div[@class='xrh-focusable--child xrh-iconwrapper']"));
		if(New.isDisplayed())
		{
			click_On_Button(New, "New");
			logger.log(LogStatus.PASS," you are now in New drop down page.");
		}
		else
		{
			logger.log(LogStatus.FAIL," you are not in New drop down page.");
		}
		
		WebElement Tekarch1 = driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']"));
		if(Tekarch1.isDisplayed())
		{
			click_On_Button(Tekarch1, "Tekarch");
			logger.log(LogStatus.PASS," you are now in UserMenu drop down page.");
		}
		else
		{
			logger.log(LogStatus.FAIL," you are not in UserMenu drop down page.");
		}
		
		WebElement Files = driver.findElement(By.xpath("//a[contains(text(),'Files')]"));
		if(Files.isDisplayed())
		{
			click_On_Button(Files, "Files");
			logger.log(LogStatus.PASS," you are now in Files page.");
		}
		else
		{
			logger.log(LogStatus.FAIL," you are not in Files page.");
		}
		
		WebElement Notification = driver.findElement(By.xpath("//button[@title='Notifications']//div[@class='xrh-focusable--child xrh-iconwrapper']"));
		if(Notification.isDisplayed())
		{
			click_On_Button(Notification, "Notification");
			logger.log(LogStatus.PASS," you are now in Notification page.");
		}
		else
		{
			logger.log(LogStatus.FAIL," you are not in Notification page.");
		}
		
		WebElement Search = driver.findElement(By.xpath("//button[@title='Search']//div[@class='xrh-focusable--child xrh-iconwrapper']"));
		if(Search.isDisplayed())
		{
			click_On_Button(Search, "Search");
			logger.log(LogStatus.PASS," search field area is showing.");
		}
		else
		{
			logger.log(LogStatus.FAIL," search field area is not showing.");
		}
		
		WebElement Help = driver.findElement(By.xpath("//button[@title='Search']//div[@class='xrh-focusable--child xrh-iconwrapper']"));
		if(Help.isDisplayed())
		{
			click_On_Button(Help, "Help");
			logger.log(LogStatus.PASS," you are now in Help drop down page .");
		}
		else
		{
			logger.log(LogStatus.FAIL," you are now in Help drop down page.");
		}
		
	}
}
