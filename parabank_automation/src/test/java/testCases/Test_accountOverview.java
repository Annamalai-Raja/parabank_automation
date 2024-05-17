package testCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pageObjects.*;
import utils.Screenshotlistener;

@Listeners(Screenshotlistener.class)
public class Test_accountOverview extends CommonFunctions  {
	@Test
	public void acc_Overview() throws Exception {
		
		log.info("Clicking Account Overview Tab");
		PageFactory.initElements( driver ,AccOverview_pageObjects.class);
		AccOverview_pageObjects.accoverview_tab.click();
		WebElement accTable = AccOverview_pageObjects.table;
		System.out.println("Did the account overview table available? " + accTable.isDisplayed());
	}
}
