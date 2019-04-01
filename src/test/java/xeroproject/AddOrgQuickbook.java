package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

public class AddOrgQuickbook extends ReUsable
{
	public static void QuickBook() throws InterruptedException
	{
		Login.LoginPage();
		System.out.println("TC8-F_Add another organization with current Quickbooks user");
		logger = report.startTest("Add another organization with current Quickbooks user");
		
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
		
		WebElement ConvertData = driver.findElement(By.xpath("//a[@id='conversionLink']"));
		click_On_Link(ConvertData, "Move from QuickBooks for free.");
		
		WebElement CheckConvrtData = driver.findElement(By.xpath("//input[@id='conversionCheckbox-inputEl']"));
		if(CheckConvrtData.isDisplayed())
		{
			SelectCheckBox(CheckConvrtData, "Want to Convert Data Checkbox");
			logger.log(LogStatus.PASS, "The trail version option button should be disable and Buy now button highlighted");
		}
		else
		{
			logger.log(LogStatus.FAIL, "The trail version option button is notdisable and Buy now button not highlighted");
		}
		
		WebElement Continue = driver.findElement(By.linkText("Continue"));
		if(Continue.isDisplayed())
		{
			click_On_Button(Continue, "Continue");
			logger.log(LogStatus.PASS, "Should be able to see Quick books file conversion");
		}
		else
		{
			logger.log(LogStatus.FAIL, "not be able to see Quick books file conversion");
		}
	}
}
