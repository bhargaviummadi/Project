package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actiondriver.Action;
import testBase.WebTestBase1;

public class SearchResultPage extends WebTestBase1 {
	@FindBy(xpath="//*[@id=\"center_column\"]//img")
	static
	WebElement productResult;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isProductAvailable() {
		try {
			try {
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public static AddToCartPage clickOnProduct() throws Throwable{
		try {
			try {
				Action.JSClick(driver, productResult);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new AddToCartPage();
	}
	

}
