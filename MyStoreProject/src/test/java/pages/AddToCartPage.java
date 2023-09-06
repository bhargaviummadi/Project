package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actiondriver.Action;
import testBase.WebTestBase1;

public class AddToCartPage extends WebTestBase1 {
    @FindBy(id="quantity_wanted")
    WebElement quantity1;
    
    @FindBy(name="group_1")
    WebElement size;
    
    //@FindBy(xpath="//span[text()='Add to cart']")
    @FindBy(xpath="//*[@id=\"add_to_cart\"]/button")
	static
    WebElement addToCartBtn;
    
    public AddToCartPage() {
    	PageFactory.initElements(driver, this);
    }
    
    public void enterQuantity(String quantity1) throws Throwable{
    	Action action2 = new Action();
		try {
			action2.type(addToCartBtn, quantity1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void clickonAddToCart() throws Throwable{
    	Action.click(driver, addToCartBtn);
    }
}