package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.*;
import utils.Screenshotlistener;
import commonfunctions.CommonFunctions;
@Listeners(Screenshotlistener.class)
public class Test_updateContactinfo  extends CommonFunctions{
	@Test
	public void updateContact() throws Exception {
		log.info("Clicking Update Contact Tab");
		PageFactory.initElements( driver , UpdateContactinfo_pageObjects.class);
		Thread.sleep(2000);
		UpdateContactinfo_pageObjects.Updateprofile_Tab.click();
		Thread.sleep(2000);
		UpdateContactinfo_pageObjects.Firstname.sendKeys("Walter");
		UpdateContactinfo_pageObjects.Lastname.sendKeys("White");
		UpdateContactinfo_pageObjects.Address.sendKeys("Abq");
		UpdateContactinfo_pageObjects.City.sendKeys("New Mexico");
		UpdateContactinfo_pageObjects.State.sendKeys("USA");
		UpdateContactinfo_pageObjects.ZipCode.sendKeys("879031");
		UpdateContactinfo_pageObjects.Phone.sendKeys("4569874124");
		UpdateContactinfo_pageObjects.UpdateButton.click();

	}
}
