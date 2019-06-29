package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductDetailsPage {
	@FindBy(how=How.XPATH, using="//button[@name='Submit']")
    WebElement AddToCartBtn;
	
	@FindBy(how=How.XPATH, using="//b[contains(text(),'Cart')]")
    WebElement cartBtn;
	
	public void clickOnAddToCart() {
		AddToCartBtn.click();
	}
	
	public void clickOnCart() {
		cartBtn.click();
	}

}
