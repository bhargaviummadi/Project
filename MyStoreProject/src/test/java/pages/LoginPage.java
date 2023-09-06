package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase1;

public class LoginPage extends WebTestBase1 {
	
		 @FindBy(xpath = "//*[@id=\"email\"]")
		    WebElement emailTextBox;

		    @FindBy(xpath = "//*[@id=\"passwd\"]")
		    WebElement passwordTextBox;

		    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
		    WebElement loginbtn;

		    public LoginPage(){
		    	//used for creating webelements
		        PageFactory.initElements(driver, this);
		    }
	//sending the email and passwrord to the login
		    public void login(String email, String password){
		        emailTextBox.sendKeys(email);
		        passwordTextBox.sendKeys(password);
		        loginbtn.click();
		    }

	}
