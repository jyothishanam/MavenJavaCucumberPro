package MySteps;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.http.HttpClient;
import org.openqa.selenium.remote.http.HttpMethod;
import org.openqa.selenium.remote.http.HttpRequest;
import org.openqa.selenium.remote.http.HttpResponse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

//import com.jayway.restassured.RestAssured;
//import com.jayway.restassured.response.Response;

import org.openqa.selenium.support.*;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions3 {
	
	String url="http://the-internet.herokuapp.com";
/*	@Before
	public void browerSetUp() {
		BaseDriver.driverInitialization();
	}
	*/
	
	@After
	public void browerShutDown() {
		BaseDriver.drivershutDowm();
	}
		
	@Given("^I navigate to the website$")
	public void i_navigate_to_the_website() throws Throwable {
		BaseDriver.driver.get("https://the-internet.herokuapp.com");
	}
	

    @When("^I Click on Basic Auth and enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_Click_on_Basic_Auth_and_enter_and(String arg1, String arg2) throws Throwable {
	BaseDriver.driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");
    }

	   
	@Then("^I should be Successfully loged in and congratulations page should be loded$")
	public void i_should_be_Successfully_loged_in_and_congratulations_page_should_be_loded() throws Throwable {
  String text=BaseDriver.driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).getText();
  Assert.assertEquals("Congratulations! You must have the proper credentials.",text);
  
	}

	@When("^I Click on Broken Images$")
	public void i_Click_on_Broken_Images() throws Throwable {
		BaseDriver.driver.findElement(By.xpath("//a[contains(text(),'Broken Images')]")).click();
	    
	}

	@Then("^broken Images should be validated$")
	public void broken_Images_should_be_validated() throws Throwable {
		int expectedValue=0;
		List<WebElement> links = BaseDriver.driver.findElements(By.tagName("img"));
        int brokenImagesCount=0;
        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i));
            String linkURL=links.get(i).getAttribute("src");
            System.out.println(links.get(i).getText());
         //   URL url = new URL(linkURL);
            
  /*
   http client WAy     
   */
  CloseableHttpClient  client= HttpClients.createDefault();
  


 
HttpUriRequest request= new HttpGet(linkURL);

HttpUriRequest postRequest= new HttpPost(linkURL);



postRequest.addHeader(HttpHeaders.ACCEPT,"application/json");
postRequest.addHeader(HttpHeaders.CONTENT_TYPE,"application/json");

 CloseableHttpResponse response=client.execute(postRequest);
 
            
 if(response.getStatusLine().getStatusCode()!=200)
 {
		brokenImagesCount++;  
 }
 
 
            /* Rest Assure Way**/
            
          
            
          
          /*  Response response=RestAssured.get(new URL(linkURL));
            
            if(response.statusCode()!=200) {
            	brokenImagesCount++;     
            	*/     
              
          /*  
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            http.setConnectTimeout(10000);
            http.setReadTimeout(20000);
            int statusCode=http.getResponseCode();
            if(statusCode==404||statusCode==500){
                brokenImagesCount=brokenImagesCount+1;
                System.out.println(linkURL+" and its Status codes is:"+statusCode);
            }
            */
        }
        System.out.println("total number of broken images are: "+brokenImagesCount);
        //String actualValue=String.valueOf(brokenImagesCount);
       // Assert.assertNotEquals(expectedValue,actualValue);
        Assert.assertTrue("ExpectedBrokenImage  count:"+expectedValue+"not equals to actual brokenimageCount:"+brokenImagesCount,expectedValue==brokenImagesCount);
	   
	}
	
}
