package xeroproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class StarterPlan extends ReUsable
{
	public static void StartPlan() throws InterruptedException
	{
		Login.LoginPage();
		Thread.sleep(2000);
		PurchasePlan.Purchaseplan();
		Thread.sleep(2000);
		
		System.out.println("TC8-C_Add another organization - Starter Plan");
		logger = report.startTest("Add another organization - Starter Plan");
		
		WebElement Early = driver.findElement(By.xpath("//section[@id='Early']//label[@class='xui-styledcheckboxradio']"));
		if(Early.isDisplayed())
		{
			click_On_Button(Early, "Early Plan");
			logger.log(LogStatus.PASS, "Should be able to see the chosen Starter Plan");
		}
		else
		{
			logger.log(LogStatus.FAIL, "Should not be able to see the chosen Starter Plan");
		}
		
		
	}
}
