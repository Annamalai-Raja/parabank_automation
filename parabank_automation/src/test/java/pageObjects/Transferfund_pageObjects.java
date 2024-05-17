package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Transferfund_pageObjects {
	@FindBy(xpath = "//a[@href='/parabank/transfer.htm']")
	public static WebElement tansferFund_tab;
	
	@FindBy(id = "amount")
	public static WebElement amount;
	
	@FindBy(id ="fromAccountId")
	public static WebElement fromAccount;
	
	public void select_fromAccount(String ddvalue) {
		Select dd = new Select(fromAccount);
		dd.selectByVisibleText(ddvalue);
	}
	
	@FindBy(id="toAccountId")
	public static WebElement toAccount;
	
	public void select_toAccount(String ddvalue) {
		Select dd = new Select(toAccount);
		dd.selectByVisibleText(ddvalue);
	}
	
	@FindBy(xpath="//*[@id=\"rightPanel\"]/div/div/form/div[2]/input")
	public static WebElement transferButton;
	

}
