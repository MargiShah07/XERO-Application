package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import net.bytebuddy.asm.Advice.Enter;

public class MyXero extends ReUsable
{
	public static void NewOrganization() throws InterruptedException
	{
		Login.LoginPage();
		System.out.println("TC8-A_Add another organization Trail version - 1");
		logger = report.startTest("Add another organization Trail version - 1");
		
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
		
		Thread.sleep(2000);
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
		WebElement AddOrg = driver.findElement(By.linkText("Add an organization"));
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
		WebElement StartTrial=driver.findElement(By.linkText("Start Trial"));
		if(StartTrial.isDisplayed())
		{
			click_On_Link(StartTrial, "Start Trial");
			logger.log(LogStatus.PASS, "New Organization Added to page.");
		}
		else
		{
			logger.log(LogStatus.FAIL, "New Organization is not added to page.");
		}
	}
}
