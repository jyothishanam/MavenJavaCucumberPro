package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import MySteps.BaseDriver;

public class LandingPage {

	
	@FindBy(how=How.XPATH, using="//img[@class='logo img-responsive']")
    WebElement logo_Img;
	
	@FindBy(how=How.XPATH, using="//a[@title='Log in to your customer account']")
	WebElement signIn_Link;
	
	public String pageTitle() {
	
	    return BaseDriver.driver.getTitle();
	}
	
	public boolean isLandPageLoaded() {
		return logo_Img.isDisplayed();
	}

    public void clickOnSignLink() {
	    signIn_Link.click();
	   
	

}}

