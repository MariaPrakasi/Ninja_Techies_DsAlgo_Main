package stepDefinition;

import Pageobjectmodel.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSD extends BaseClass {
	@Given("The user is on the Register page")
	public void the_user_is_on_the_register_page() 
	{
	}

	@When("The user fills the form {string} {string}  {string}")
	public void the_user_fills_the_form(String UserName, String Password, String PasswordConfirmation) throws InterruptedException {
	    Rp.FillRegisterForm(UserName, Password, PasswordConfirmation);
	}

	@Then("The user clicks RegisterButton")
	public void the_user_clicks_register_button() {
	    Rp.RegisterButton.click();
	}
}

