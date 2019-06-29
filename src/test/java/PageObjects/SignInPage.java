package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage{
	
	
	@FindBy(how=How.XPATH, using="//input[@id='email']")
    WebElement emailAddress;
	
	@FindBy(how=How.XPATH, using="//input[@id='passwd']")
	WebElement passWord ;
	
	@FindBy(how=How.XPATH, using="//button[@id='SubmitLogin']")
	WebElement SignIn ;

	
	
	public void SignIn(String email,String pwd ) {
	emailAddress.sendKeys(email);
	passWord.sendKeys(pwd);
	SignIn.click();
    
}
}