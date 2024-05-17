package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccOverview_pageObjects {
	@FindBy(xpath ="//a[@href='/parabank/overview.htm']")
	public static WebElement accoverview_tab;
	
	@FindBy(xpath="//table[@id = 'accountTable']")
	public static WebElement table;
}
