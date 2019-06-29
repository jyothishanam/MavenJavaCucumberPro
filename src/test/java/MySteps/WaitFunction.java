package MySteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFunction {
	
	public static void click(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(BaseDriver.driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();

}
}