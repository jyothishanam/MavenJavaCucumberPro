package PageObjects;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WomenPage {
@FindAll(@FindBy(how=How.XPATH,using="//img[@class='replace-2x img-responsive']"))
List<WebElement> product_List;

@FindBy(how=How.XPATH,using="//img[@title='Faded Short Sleeve T-shirts']")
WebElement product;

public void selectProduct(int productNumber) {
	product_List.get(productNumber).click();
}
public void selectedProduct() {
	product.click();
	//product_List.get(0).click();
}
 public void selectProduct() {
	 selectProduct(1);
	 
 }

}
