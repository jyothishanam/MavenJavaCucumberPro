package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddressesPage {
	@FindBy(how=How.XPATH, using="//a[@title='Add']//span")
    WebElement AddaNewAddressBtn;
	
	@FindBy(how=How.XPATH, using="//select[@id='id_address_delivery']")
    WebElement chooseDeliveryAddress;
	
	@FindBy(how=How.XPATH, using="//button[@name='processAddress']")
    WebElement proceedToCheckOutInAddressPage;

	public void clickOnAddaNewAddressBtn() {
		AddaNewAddressBtn.click();
	}
	
	public void selectingDeliveryAdressFromDropDown() {
		Select delAddress=new Select(chooseDeliveryAddress) ;
		delAddress.selectByValue("144061");
}
	public void clickOnProceedToCheckOutInAddressPage() {
		proceedToCheckOutInAddressPage.click();
	}
	
}
