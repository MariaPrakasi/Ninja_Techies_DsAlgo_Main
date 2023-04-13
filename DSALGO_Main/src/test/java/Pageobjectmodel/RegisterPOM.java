package Pageobjectmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utility.Helper;


public class RegisterPOM
{
	
	public RegisterPOM(WebDriver webdriver) 
	{
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//a[@href='/register']")
	public WebElement RegisterButton;
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement UsernameField;
	
	@FindBy(xpath = "//input[@name='password1']")
	public WebElement PasswordField;	
	
	@FindBy(xpath = "//input[@name='password2']")
	public WebElement PasswordConfirmationField;
	
	public void clickRegisterButton() {
		RegisterButton.click();
	}
	public void clickUsernameField() {
		UsernameField.click();
	}
	public void clickPasswordField() {
		PasswordField.click();
	}
	public void clickPasswordConfirmationField() {
		PasswordConfirmationField.click();
	}
	public void FillRegisterForm(String username,String password,String passwordconfirmation) throws InterruptedException
	{
		UsernameField.click();
		UsernameField.sendKeys(username);
		Thread.sleep(1000);
		PasswordField.sendKeys(password);
		Thread.sleep(1000);
		PasswordConfirmationField.sendKeys(passwordconfirmation);
		Thread.sleep(1000);
		
	}
	
}