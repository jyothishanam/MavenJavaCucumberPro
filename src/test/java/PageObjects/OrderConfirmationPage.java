package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderConfirmationPage {
	
	@FindBy(how=How.XPATH, using="//p[@class='alert alert-success']")
    WebElement OrderConfirmationInfo;
	

 public String orderConfirmationInfo() {
	 return OrderConfirmationInfo.getText();
 }
 
}