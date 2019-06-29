package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import MySteps.BaseDriver;

public class MyAccountPage {
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Test User')]")
    WebElement Username;
	
	@FindBy(how=How.XPATH, using="//a[@title='Women']")
    WebElement womenLink;


public boolean IsUsernameDispalyed() {
	return Username.isDisplayed();
	
}
public void clickOnWomenLink() {
	womenLink.click();
}
}