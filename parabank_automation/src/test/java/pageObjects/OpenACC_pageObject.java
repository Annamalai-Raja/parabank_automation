package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OpenACC_pageObject {
	@FindBy(xpath = "//a[@href='/parabank/openaccount.htm']")
	public static WebElement opennewAccount;
	
	@FindBy(xpath = "//select[@id ='type']")
	public static WebElement accType;
	
	public void selectAcctype(String optiontext) {
		Select dd = new Select(accType);
		dd.selectByVisibleText(optiontext);
	}
	
	@FindBy(xpath = "//select[@id ='fromAccountId']")
	public static WebElement minDeposit;
	
	public void selectminDeposit(String value) {
		Select dd = new Select(minDeposit);
		dd.deselectByValue(value);
	}
	
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/form/div/input")
	public static WebElement clickopenNewAcc;
	
	@FindBy(xpath = "//a[@id='newAccountId']")
	public static WebElement accNumber;
}
