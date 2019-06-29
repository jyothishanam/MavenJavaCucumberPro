package MySteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseDriver {

	public static  WebDriver driver;
	
	public static void driverInitialization() {
		System.setProperty("webdriver.gecko.driver",ConfigProperties.prop.getProperty("driverPath"));
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public static void drivershutDowm() {
		driver.quit();
	}

	
}
