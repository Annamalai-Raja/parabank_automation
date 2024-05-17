package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import pageObjects.*;
import utils.Screenshotlistener;
import commonfunctions.CommonFunctions;
@Listeners(Screenshotlistener.class)
public class Test_billPay extends CommonFunctions{
		@Test
		public void billPay() throws InterruptedException {
			log.info("Clicking Bill Pay Tab");
			PageFactory.initElements(driver ,Billpay_pageObjects.class );
			Billpay_pageObjects.Billpay_tab.click();
			Thread.sleep(2000);
			Billpay_pageObjects.PayeeName.sendKeys("John");
			Billpay_pageObjects.Address.sendKeys("Downtown");
			Billpay_pageObjects.City.sendKeys("NewYork");
			Billpay_pageObjects.State.sendKeys("USA");
			Billpay_pageObjects.ZipCode.sendKeys("45678");
			Billpay_pageObjects.Phone.sendKeys("9632587410");
			Billpay_pageObjects.Account.sendKeys("12345");
			Billpay_pageObjects.VerifyAccount.sendKeys("12345");
			Billpay_pageObjects.Amount.sendKeys("5000");
			Thread.sleep(2000);
			Billpay_pageObjects.Fromaccount.click();
			Billpay_pageObjects.Send_button.click();
		}
}
