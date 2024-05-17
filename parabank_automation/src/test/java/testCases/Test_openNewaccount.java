package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pageObjects.OpenACC_pageObject;
import utils.Screenshotlistener;

@Listeners(Screenshotlistener.class)
public class Test_openNewaccount extends CommonFunctions {

	@Test
	@Parameters({"accountType" , "accountNumber"})
	public void open_Newacc(String acctype , String deposit) throws InterruptedException  {
		log.info("Clicking Open Newaccount Tab");
		PageFactory.initElements(driver,OpenACC_pageObject.class);
		Thread.sleep(1000);	
		OpenACC_pageObject.opennewAccount.click();
		OpenACC_pageObject.accType.sendKeys(acctype);
		OpenACC_pageObject.minDeposit.sendKeys(deposit);
		Thread.sleep(2000);
		OpenACC_pageObject.clickopenNewAcc.click();
		String newacc = OpenACC_pageObject.accNumber.getText();
		System.out.println(newacc);
	}

}
