package MySteps;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import PageObjects.AddressesPage;
import PageObjects.FillUpAddressDetailsPage;
import PageObjects.LandingPage;
import PageObjects.MyAccountPage;
import PageObjects.OrderConfirmationPage;
import PageObjects.OrderSummaryPage;
import PageObjects.PaymentMethodPage;
import PageObjects.ProductConfirmationPopUpPage;
import PageObjects.ProductDetailsPage;
import PageObjects.ShippingPage;
import PageObjects.ShoppingCartSummaryPage;
import PageObjects.SignInPage;
import PageObjects.WomenPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class StepDefinition1 {
	LandingPage landingPage;
	SignInPage signInPage;
	MyAccountPage myAccountPage;
	WomenPage womenPage;
	ProductDetailsPage productDetailsPage;
	ProductConfirmationPopUpPage productConfirmationPopUpPage;
	ShoppingCartSummaryPage shoppingCartSummaryPage;
	ShippingPage shippingPage;
	AddressesPage addressesPage;
	FillUpAddressDetailsPage fillUpAddressDetailsPage;
	OrderSummaryPage orderSummaryPage;
	OrderConfirmationPage orderConfirmationPage;
	PaymentMethodPage paymentMethodPage;
	
     Logger log =LogManager.getLogger(StepDefinition1.class.getName());
	//Logger log=Logger.getLogger(StepDefinition1.class);


	
	
	
	@Before 
	public void allPageFactoryInitialisations() {
		
		log.info("THis is From StepDefinitions");
		log.debug("Debugging information");
		log.error("error message");

		BaseDriver.driverInitialization();
		landingPage=PageFactory.initElements(BaseDriver.driver, LandingPage.class);
		signInPage=PageFactory.initElements(BaseDriver.driver,SignInPage.class);
		myAccountPage=PageFactory.initElements(BaseDriver.driver,MyAccountPage.class);
		womenPage=PageFactory.initElements(BaseDriver.driver,WomenPage.class);
		productDetailsPage=PageFactory.initElements(BaseDriver.driver,ProductDetailsPage.class);
		productConfirmationPopUpPage=PageFactory.initElements(BaseDriver.driver,ProductConfirmationPopUpPage.class);
		shoppingCartSummaryPage=PageFactory.initElements(BaseDriver.driver,ShoppingCartSummaryPage.class);
		shippingPage=PageFactory.initElements(BaseDriver.driver,ShippingPage.class);
		addressesPage=PageFactory.initElements(BaseDriver.driver,AddressesPage.class);
		fillUpAddressDetailsPage=PageFactory.initElements(BaseDriver.driver,FillUpAddressDetailsPage.class);
		orderSummaryPage=PageFactory.initElements(BaseDriver.driver,OrderSummaryPage.class);
		orderConfirmationPage=PageFactory.initElements(BaseDriver.driver,OrderConfirmationPage.class);
		paymentMethodPage=PageFactory.initElements(BaseDriver.driver,PaymentMethodPage.class);
		
		log.info("Elements Initialization");
		
	}
	@After
	public void driverClose(Scenario scenario) {
		
		 if (scenario.isFailed()) {
		 
			    byte[] screenshot = ((TakesScreenshot)BaseDriver.driver).getScreenshotAs(OutputType.BYTES);
	            String testName = scenario.getName();
	            scenario.embed(screenshot, "image/png");
	            scenario.write(testName);
		 }
		 
		 
		BaseDriver.drivershutDowm();
		log.info("Browser Shutdown");
	}
	
	@Given("^user navigates to the website$")
	public void user_navigates_to_the_website() throws Throwable {

	   BaseDriver.driver.get(ConfigProperties.prop.getProperty("url"));
	   log.info("Navigate to the website");
	
	}
	
	@When("^website is loaded$")
	public void website_is_loaded(){
	
	Assert.assertTrue(landingPage.isLandPageLoaded());
	log.info("Website should be loaded");
	
	
	}

	@Then("^check the page title is \"([^\"]*)\"$")
	public void check_the_page_title_is(String arg1)  {
		
		Assert.assertEquals(landingPage.pageTitle(), arg1);
		log.info("Validating Page title");
		
		}
	
	@When("^user Clicks on Signin$")
	public void user_Clicks_on_Signin() throws Throwable {
		
		 landingPage.clickOnSignLink();
	}
	
	@When("^Enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enters_and(String arg1, String arg2) throws Throwable {
		
		signInPage.SignIn(arg1,arg2);
		
	}	

	@Then("^User should be successfully Logedin$")
	public void user_should_be_successfully_Logedin() throws Throwable {
		
		Assert.assertTrue(myAccountPage.IsUsernameDispalyed());
	}
	@When("^selects women tab$")
	public void selects_women_tab() throws Throwable {
		
	    myAccountPage.clickOnWomenLink();
	}

	@When("^Clicks on first item to get the product details$")
	public void clicks_on_first_item_to_get_the_product_details() throws Throwable {
	   womenPage.selectProduct(0);
	}

	@When("^Clicks on Add to cart button$")
	public void clicks_on_Add_to_cart_button() throws Throwable {
	 productDetailsPage.clickOnAddToCart();
	}

	@When("^Choose to proceed to checkOut$")
	public void choose_to_proceed_to_checkOut() throws Throwable {
		//productDetailsPage.clickOnCart();
		//productConfirmationPopUpPage.clickOnProceedToCheckOutBtn1();
		WaitFunction.click(productConfirmationPopUpPage.proceedToCheckOutBtn);
	     
	}

	@When("^Click on proceed to CheckOut button in Shoping Cart Summary Page$")
	public void click_on_proceed_to_CheckOut_button_in_Shoping_Cart_Summary_Page() throws Throwable {
		shoppingCartSummaryPage.clickOnProceedToCheckOutBtnInSummary();
	}

	@When("^user Clicks on add a new address in Address Page$")
	public void user_Clicks_on_add_a_new_address_in_Address_Page() throws Throwable {
	   addressesPage.clickOnAddaNewAddressBtn();
	}

	@When("^Add user Address Details$")
	public void add_user_Address_Details() throws Throwable {
	   fillUpAddressDetailsPage.addingAdressDetails();
	}

	@When("^Selects The address to deliver items and click on proceed to checkout$")
	public void selects_The_address_to_deliver_items_and_click_on_proceed_to_checkout() throws Throwable {
	    addressesPage.selectingDeliveryAdressFromDropDown();
	    addressesPage.clickOnProceedToCheckOutInAddressPage();
	}

	@When("^Accepts TC and Clicks on Proceed to checkout in shipping page$")
	public void accepts_TC_and_Clicks_on_Proceed_to_checkout_in_shipping_page() throws Throwable {
	   
		shippingPage.clickOnTermsOfService();
		shippingPage.clickOnproceedtoCheckOutInShippingPage();
	}
	
	@When("^Choose the payment method option PayByCheck$")
	public void choose_the_payment_method_option_PayByCheck() throws Throwable {
	    paymentMethodPage.clickonPayByCheck();

	/*@When("^Choose the payment method option \"([^\"]*)\"$")
	public void choose_the_payment_method_option(WebElement arg1) throws Throwable {
	    paymentMethodPage.clickOnPaymentMethod(arg1);*/
	}

	@When("^Confirms the order$")
	public void confirms_the_order() throws Throwable {
	    orderSummaryPage.clickOnConfirmMyOrder();
	}

	@Then("^confirmation information should be displayed$")
	public void confirmation_information_should_be_displayed() throws Throwable {
	
		Assert.assertEquals(orderConfirmationPage.orderConfirmationInfo(),"Your order on My Store is complete.");
	
	}
	
	@When("^user clicks on SignIn link and Enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_clicks_on_SignIn_link_and_Enters_and(String arg1, String arg2) throws Throwable {
		landingPage.clickOnSignLink();
		signInPage.SignIn(arg1,arg2);
	    
	}
	
	@When("^Add an item to the cart and check out$")
	public void add_an_item_to_the_cart_and_check_out() throws Throwable {
		
		 myAccountPage.clickOnWomenLink();
		 womenPage.selectProduct();
		 productDetailsPage.clickOnAddToCart();
		 productDetailsPage.clickOnCart();
		 shoppingCartSummaryPage.clickOnProceedToCheckOutBtnInSummary();
		 addressesPage.clickOnAddaNewAddressBtn();
		 fillUpAddressDetailsPage.addingAdressDetails();
		 addressesPage.selectingDeliveryAdressFromDropDown();
		 addressesPage.clickOnProceedToCheckOutInAddressPage();
		 shippingPage.clickOnTermsOfService();
		 shippingPage.clickOnproceedtoCheckOutInShippingPage();
		 paymentMethodPage.clickonPayByCheck();
	    
	}

	@Then("^Order should be placed and confirmation information should be displayed with below details$")
	public void order_should_be_placed_and_confirmation_information_should_be_displayed_with_below_details() throws Throwable {
		 orderSummaryPage.clickOnConfirmMyOrder();
		 Assert.assertEquals(orderConfirmationPage.orderConfirmationInfo(),"Your order on My Store is complete.");
		
	}
	
}
