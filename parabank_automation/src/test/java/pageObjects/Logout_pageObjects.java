package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_pageObjects {
	@FindBy(xpath = "//a[@href ='/parabank/logout.htm']")
	public static WebElement logout;
}
