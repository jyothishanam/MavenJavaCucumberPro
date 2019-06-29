package PageObjects;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import MySteps.BaseDriver;

public class ProductConfirmationPopUpPage {
	@FindBy(how=How.XPATH, using="//a[@title='Proceed to checkout']//span")
    public WebElement proceedToCheckOutBtn;

	public void clickOnProceedToCheckOutBtn() {

		
	
		for (int i = 0; i < 5; i++) {
			try {
				proceedToCheckOutBtn.click();
		
				break;
			}
			catch (Exception e) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		}
		
			
		}
		
		public void clickOnProceedToCheckOutBtn1() {
			WebDriverWait wait = new WebDriverWait(BaseDriver.driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckOutBtn));
			proceedToCheckOutBtn.click();
			
	}
	
}
