package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class FillUpAddressDetailsPage {
	@FindBy(how=How.XPATH, using="//input[@id='firstname']")
    WebElement firstName;
	
	@FindBy(how=How.XPATH, using="//input[@id='lastname']")
    WebElement lastName;
	
	@FindBy(how=How.XPATH, using="//input[@id='address1']")
    WebElement address;
	
	@FindBy(how=How.XPATH, using="//input[@id='city']")
    WebElement city;
	
	@FindBy(how=How.XPATH, using="//select[@id='id_state']")
    WebElement state;
	
	
	@FindBy(how=How.XPATH, using="//input[@id='postcode']")
    WebElement zipCode;
	
	@FindBy(how=How.XPATH, using="//select[@id='id_country']")
    WebElement country;
	
	@FindBy(how=How.XPATH, using="//input[@id='phone']")
    WebElement homePhone;
	
	@FindBy(how=How.XPATH, using="//input[@id='phone_mobile']")
    WebElement mobilePhone;
	
	@FindBy(how=How.XPATH, using="//input[@id='alias']")
    WebElement addressTitleForFutureReference;
	
	@FindBy(how=How.XPATH, using="//button[@id='submitAddress']")
    WebElement SaveBtn;
	
	public void firstName(String fname) {
		firstName.clear();
		firstName.sendKeys(fname);
	}
	public void lastName(String lname) {
		lastName.clear();
		lastName.sendKeys(lname);
	}
	public void address(String address1) {
		address.sendKeys(address1);
	}
	
	public void city(String city1) {
		city.sendKeys(city1);
	}
	
	public void selectingStateFromDropDown(String value) {
		Select stateFrmDropDown=new Select(state) ;
		stateFrmDropDown.selectByValue(value);
			}
	
	public void zipCode(String zipcode1) {
		zipCode.sendKeys(zipcode1);
	}
	
	public void selectingCountryFromDropDown(String countryName) {
		Select countryFrmDropDown=new Select(country) ;
		countryFrmDropDown.selectByVisibleText(countryName);

}
	
	public void homePhone(String homePhoneNum) {
		homePhone.sendKeys(homePhoneNum);
	}
	
	public void mobilePhone(String mobilePhoneNum) {
		mobilePhone.sendKeys(mobilePhoneNum);
	}
	
	public void addressTitleForFutureReference(String addressTitle) {
		addressTitleForFutureReference.clear();
		addressTitleForFutureReference.sendKeys(addressTitle);
	}
		
public void addingAdressDetails() {
	firstName("Jhonathan");
	lastName("nethan");
	address("49 shop road");
	city("street");
	selectingStateFromDropDown("4");
	zipCode("00000");
	selectingCountryFromDropDown("United States");
	homePhone("23475483943");
	mobilePhone("34567876543");
	addressTitleForFutureReference("My new Address");
	SaveBtn.click();
	
}
}