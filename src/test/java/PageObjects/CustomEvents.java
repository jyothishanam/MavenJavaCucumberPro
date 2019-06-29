package PageObjects;

import org.openqa.selenium.WebElement;

public class CustomEvents {
	
	
	public void SafeClick(WebElement element)
	{
		for (int i = 0; i < 5; i++) {
			
		 try {
			
			element.click();
			break;
		}
		
		catch (Exception e)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	}

}
