package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderSummaryPage {
	@FindBy(how=How.XPATH, using="//p[@id='cart_navigation']//button[@type='submit']")
    WebElement confirmMyOrder;


public void clickOnConfirmMyOrder() {
	confirmMyOrder.click();
}
}
