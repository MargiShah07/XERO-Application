package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

public class PurchasePlan extends ReUsable
{
	public static void Purchaseplan() throws InterruptedException
	{
		Login.LoginPage();
		System.out.println("TC8-B_Add another organization - Paid version 1");
		logger = report.startTest("Add another organization - Paid version 1");
		
		Thread.sleep(2000);
		
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
		
		WebElement MyXero =driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
		if(MyXero.isDisplayed())
		{
			click_On_Link(MyXero, "My Xero");
			logger.log(LogStatus.PASS, "should be able to see organization details");
		}
		else
		{
			logger.log(LogStatus.FAIL, "should not be able to see organization details");
		}
		
		Thread.sleep(2000);
		WebElement AddOrg = driver.findElement(By.xpath("//a[@class='x-btn green']"));
		click_On_Link(AddOrg, "Add Organization");
		
		WebElement OrgName = driver.findElement(By.xpath("//input[@id='text-1022-inputEl']"));
		EnterText(OrgName, "Organization Name", "Self");
		
		Select PayTaxes = new Select(driver.findElement(By.xpath("//input[@id='countryCmb-inputEl']")));
		PayTaxes.selectByVisibleText("United States");
		
		Select PSTTimeZone = new Select(driver.findElement(By.xpath("//input[@id='cmbTimeZone-inputEl']")));
		PSTTimeZone.selectByVisibleText("(UTC-08:00) Baja California");
		
		WebElement OrgWork = driver.findElement(By.xpath("//input[@id='industrysearchcombofield-1025-inputEl']"));
		EnterText(OrgWork, "Organization Work", "Accounting");
		
		Thread.sleep(2000);
		WebElement BuyNow=driver.findElement(By.xpath("//a[@id='simplebutton-1036']"));
		if(BuyNow.isDisplayed())
		{
			click_On_Link(BuyNow, "Buy Now");
			String actualTitle = driver.getTitle();
			String expectedTitle = "Billing Subscription";
			if(actualTitle.equalsIgnoreCase(expectedTitle))
			{
				System.out.println("Title Matched");
				logger.log(LogStatus.PASS," Should be able to navigate to Purchase Plan Subscription and Billing page.");
			}
			else
			{
				System.out.println("Title didn't match");
				logger.log(LogStatus.FAIL," Should not be able to navigate to Purchase Plan Subscription and Billing page.");
			}
		}
	}
}
