package Pageobjectmodel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Helper;

public class HomePOM 
{
	public HomePOM(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}
	@FindBy(xpath = "//button[text()='Get Started']")
	public WebElement GetStartedButton;
	
	public String url="https://dsportalapp.herokuapp.com";
	
	@FindBy(xpath = "//a[@href='/register']")
	public WebElement RegisterLink;
	
	@FindBy(xpath = "//a[text()='Sign in']")
	public WebElement SignInLink;
	
	public void clickRegisterLink() {
		RegisterLink.click();
	}
	
	public void clickGetStartedButton()  {
		GetStartedButton.click();
	}
	
	public void clickSignInLink()  {
		SignInLink.click();
	}
	
}

