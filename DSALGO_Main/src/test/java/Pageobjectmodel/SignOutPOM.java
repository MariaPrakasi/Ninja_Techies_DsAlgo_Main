package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutPOM 
{
	public SignOutPOM(WebDriver driver)
	{

		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//a[contains(text(),'Sign out')]")
	WebElement signout;
	@FindBy(xpath = "//div[contains(text(),'Logged out successfully')]")
	WebElement successLogout;
	public void logout()
	{
		signout.click();
	}

	public String successLogout()
	{
		String Logoutmsg = successLogout.getText();
		System.out.println("end" +Logoutmsg);
		return Logoutmsg;
	}

}
