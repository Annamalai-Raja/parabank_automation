package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateContactinfo_pageObjects {
	@FindBy(xpath =  "//a[@href='/parabank/findtrans.htm']" )
	public static WebElement Updateprofile_Tab;
	
	@FindBy(xpath ="//input[@id='customer.firstName'] ")
		public static WebElement Firstname;
	
	@FindBy(id="customer.lastName")	
		public static WebElement Lastname;	
	
	@FindBy(id="customer.address.street")	
		public static WebElement Address;	
	
	@FindBy(id="customer.address.city")	
		public static WebElement City;	
	
	@FindBy(id="customer.address.state")	
		public static WebElement State;	
	
	@FindBy(id="customer.address.zipCode")	
		public static WebElement ZipCode;	
	
	@FindBy(id="customer.phoneNumber")
	public static WebElement Phone;
	
	@FindBy(id="//input[@class='button' and value='Update Profile']")	
		public static WebElement UpdateButton;
}
