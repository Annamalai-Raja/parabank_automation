package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.*;
import utils.Screenshotlistener;
import commonfunctions.CommonFunctions;
@Listeners(Screenshotlistener.class)
public class Test_logOut extends CommonFunctions {
  @Test
public void logOut() throws Exception {
	PageFactory.initElements( driver , Logout_pageObjects.class);
	Logout_pageObjects.logout.click();
	log.info("Logging Out");
}
}
