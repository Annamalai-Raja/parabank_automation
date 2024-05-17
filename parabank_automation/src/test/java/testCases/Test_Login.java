package testCases;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pageObjects.Login_pageObjects;
import utils.Screenshotlistener;
@Listeners(Screenshotlistener.class)
public class Test_Login extends CommonFunctions {

	@Test
	public void logIn() {
		log = LogManager.getLogger(CommonFunctions.class);
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		PageFactory.initElements(driver,Login_pageObjects.class);
		log.info("Enterting the Login Credentials " +"username ="+ username +"Password =" +password);
		Login_pageObjects.username.sendKeys(username);
		Login_pageObjects.password.sendKeys(password);
		Login_pageObjects.submit.click();
		log.info("Login Successfull");
		String expectedTitle = driver.getTitle(); 
		Assert.assertEquals(expectedTitle, "ParaBank | Accounts Overview");
	}
}
