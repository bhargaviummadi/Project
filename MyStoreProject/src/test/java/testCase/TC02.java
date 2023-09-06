package testCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.AddToCartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.SearchResultPage;
import testBase.WebTestBase1;

public class TC02 extends WebTestBase1 {
	// Each class is created for each web page
	MyAccountPage MyAccountPage;
	HomePage homePage;
	LoginPage loginPage;
	AddToCartPage AddToCartPage;

	// Loading the config file
	public TC02() {
		super();
	}

	@BeforeMethod // (it will called only once before all the test cases are called)
	public void BeforeMethod() {
		// Loading the driver file and eatablishing the connection ,loading the url
		initialization();
		MyAccountPage = new MyAccountPage();
		homePage = new HomePage();
		loginPage = new LoginPage();
		AddToCartPage = new AddToCartPage();
	}
	@Test
	public void check() {
		System.out.println("Hello");
	}

	@Test
	public void verifyLoginWithValidCredential() {
		SoftAssert softAssert = new SoftAssert();
		homePage.clickOnSignIn();
		loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		System.out.println("verify");
		//System.out.println("my account");
		//softAssert.assertEquals(MyAccountPage.getTextOFMyAccountPage(), " My account",
			//	"Sign in text should be match");

		softAssert.assertAll();
	}

	@Test
	public void verifySearchBar() {
		SoftAssert softAssert = new SoftAssert();
		MyAccountPage.search();
		System.out.println(MyAccountPage.getTextOfSearch());
		//softAssert.assertEquals(MyAccountPage.getTextOfSearch(),
			//	"Showing results for \"dresses\"\n" + "263 results found",
			//	"Showing results for \"dresses\"\n" + "263 results found text should be match");
		MyAccountPage.selectDropDown("byVisibleText", "Tops");
		softAssert.assertAll();
	}
	@Test
	public void verifyScrollDown() {
		SoftAssert softAssert = new SoftAssert();
		MyAccountPage.scrollDownMethod();
		softAssert.assertAll();
	}

	@Test
	public void verifyMouseHover() {
		SoftAssert softAssert = new SoftAssert();
		MyAccountPage.mouseHover();
		softAssert.assertAll();
	}

	// click youtube option and switching to window
	@Test
	public void verifyGetWindowHandle() {
		SoftAssert softAssert = new SoftAssert();
		MyAccountPage.windowHandle();
		softAssert.assertAll();
	}
	@Test
	public void scrollDown() {
		SoftAssert softAssert = new SoftAssert();
		MyAccountPage.scrollDown();
		softAssert.assertAll(); 
	}
	@Test
	public void scrollUp() {
		SoftAssert softAssert = new SoftAssert();
		MyAccountPage.scrollUp();
		softAssert.assertAll(); 
	}

	@Test
	public void verifyCookiesHandle() {
		SoftAssert softAssert = new SoftAssert();
		MyAccountPage.getCookiesHandle();
		softAssert.assertAll();
	}
	@Test
	public void clickTheProduct() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		SearchResultPage.clickOnProduct();
		softAssert.assertAll();
		
	}
	
	public void enterTheQuantity(String quantity1) throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		AddToCartPage addToCartPage = new AddToCartPage();
		addToCartPage.enterQuantity(quantity1);
		softAssert.assertAll();
	}
	@Test
	public void clickTheCart() throws Throwable {
		SoftAssert softAssert = new SoftAssert();
		AddToCartPage.clickonAddToCart();
		softAssert.assertAll();

	}

	 @AfterMethod
	 public void afterMethod() {
	 driver.close();
	 }
}
