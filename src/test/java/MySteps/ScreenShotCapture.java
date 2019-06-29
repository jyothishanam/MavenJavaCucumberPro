package MySteps;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;



public class ScreenShotCapture {

 public static void captureScreenShot(WebDriver driver,String screenShotName) {
		

             try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File screenShot=ts.getScreenshotAs(OutputType.FILE);
	
			FileHandler.copy(screenShot,new File("./ScreenShots/"+screenShotName+".png"));
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		
	}
}
