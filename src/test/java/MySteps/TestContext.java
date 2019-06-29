package MySteps;

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

public class TestContext {

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
	
	LandingPage getLandingPage()
	{
		return landingPage;
	}
	
	SignInPage getSignInPage()
	{
		return signInPage;
	}
	
	MyAccountPage getMyAccountPage()
	{
		return myAccountPage;
	}
	
	WomenPage getWomenPage()
	{
		return womenPage;
	}
	
}
