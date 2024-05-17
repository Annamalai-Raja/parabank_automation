package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_pageObjects {
	@FindBy(xpath = "//input[@name ='username']")
	public static WebElement username;
	
	@FindBy(xpath = "//input[@name ='password']")
	public static WebElement password;
	
	@FindBy(xpath = "//input[@type='submit' and @class='button']")
	public static WebElement submit;
	


}
