package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Billpay_pageObjects {
	@FindBy(xpath  = "//a[@href='/parabank/billpay.htm']")
	public static WebElement Billpay_tab;	
	
	
	@FindBy(xpath  = "//input[@name='payee.name']")
	public static WebElement PayeeName;	
	
	@FindBy(xpath = "//input[@name='payee.address.street']")
	public static WebElement Address;	
	
	@FindBy(xpath = "//input[@name='payee.address.city']")
	public static WebElement City;	
	
	@FindBy(xpath = "//input[@name='payee.address.state']")
	public static WebElement State;	
	
	@FindBy(xpath = "//input[@name='payee.address.zipCode']")
	public static WebElement ZipCode;
	
	@FindBy(xpath = "//input[@name='payee.phoneNumber']")
	public static WebElement Phone ;
	
	@FindBy(xpath = "//input[@name='payee.accountNumber']")
	public static WebElement Account ;
	
	@FindBy(xpath = "//input[@name='verifyAccount']")
	public static WebElement VerifyAccount ;	
	
	@FindBy(xpath = "//input[@name='amount']")
	public static WebElement Amount;
	
	@FindBy(xpath = "//select[@name='fromAccountId']")
	public static WebElement Fromaccount ;
	
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input")
	public static WebElement Send_button ;
}
