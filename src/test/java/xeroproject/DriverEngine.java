package xeroproject;


public class DriverEngine
{

	public static void main(String[] args) throws InterruptedException 
	{
		String path=(System.getProperty("user.dir") +"/test-output/XeroReport.html");
		ReUsable.InitializePath(path);
		
		Login.LoginPage();
		ReUsable.driverclose();
		LoginIncrrctPwd.IncorrectPassword();
		ReUsable.driverclose();
		LoginIncrrctUN.IncorrectUserName();
		ReUsable.driverclose();
		ForgotPWD.ForgotPassword();
		ReUsable.driverclose();
//		SignUptoXDC.SignUp();
//		ReUsable.driverclose();
		//SignUp.TrytoSignUp();
		//ReUsable.driverclose();
		TermsAndCondition.TermsCondition();
		ReUsable.driverclose();
		NewOfferOnSignUp.NewOffer();
		ReUsable.driverclose();
		BookKeeperSignUp.ActBookkeeper();
		ReUsable.driverclose();
		AllTabs.TestAllTabs();
		ReUsable.driverclose();
		TestLogout.logout();
		ReUsable.driverclose();
		ProfileImage.UploadPhoto();
		ReUsable.driverclose();
		MyXero.NewOrganization();
		ReUsable.driverclose();
		PurchasePlan.Purchaseplan();
		ReUsable.driverclose();
		StarterPlan.StartPlan();
		AddOrgQuickbook.QuickBook();
		ReUsable.driverclose();
		subscription.Subscription();
		ReUsable.driverclose();
		
		ReUsable.report.flush();
		System.out.println("End");
	}

}
