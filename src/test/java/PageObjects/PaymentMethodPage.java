package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentMethodPage {
	
	@FindBy(how=How.XPATH, using="//a[@title='Pay by bank wire']")
    WebElement PayByBankWire;
	
	
	@FindBy(how=How.XPATH, using="//a[@title='Pay by check.']")
    WebElement PayByCheck;
	
	public void clickOnPaymentMethod(WebElement PaymentMethod) {
		PaymentMethod.click();
	}
	public void clickonPayByBankWire() {
		PayByBankWire.click();
	}
	
	public void clickonPayByCheck() {
		PayByCheck.click();
	}
}
