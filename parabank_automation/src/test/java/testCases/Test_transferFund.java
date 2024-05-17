package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.*;
import utils.Screenshotlistener;
import commonfunctions.CommonFunctions;
@Listeners(Screenshotlistener.class)
public class Test_transferFund extends CommonFunctions {
	@Test
	//@Parameters({"fromaccount" , "toaccount"})String fromacc , String toacc
	public void transferFund() throws InterruptedException {
		log.info("Clicking Transfer Fund Tab");
		PageFactory.initElements(driver , Transferfund_pageObjects.class);
		Transferfund_pageObjects.tansferFund_tab.click();
		Transferfund_pageObjects.amount.sendKeys("5000");
		Thread.sleep(2000);
		Transferfund_pageObjects.fromAccount.click();
		Thread.sleep(2000);
		Transferfund_pageObjects.toAccount.click();
		Thread.sleep(2000);
		Transferfund_pageObjects.transferButton.click();
	}
}
