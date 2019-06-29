package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShippingPage {
	
	@FindBy(how=How.XPATH, using="//label[@for='cgv']")
    WebElement AcceptTC;
	
	@FindBy(how=How.XPATH, using="//button[@name='processCarrier']")
    WebElement proceedtoCheckOutInShippingPage;
	

 public void clickOnTermsOfService() {
	 AcceptTC.click();
 }
 
 public void clickOnproceedtoCheckOutInShippingPage() {
	 proceedtoCheckOutInShippingPage.click();
 }
}
