package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartSummaryPage {
	@FindBy(how=How.XPATH, using="//p[@class='cart_navigation clearfix']//span")
    WebElement proceedToCheckOutBtnInSummary;

	public void clickOnProceedToCheckOutBtnInSummary() {
		proceedToCheckOutBtnInSummary.click();
	}
	
}
