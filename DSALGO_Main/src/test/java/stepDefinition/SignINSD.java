package stepDefinition;

import java.io.IOException;

import Pageobjectmodel.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignINSD extends BaseClass 
{
	@Given("The user is on the SignIn page")
    public void the_user_is_on_the_sign_in_page() {
	}
	
	@When("The user fills the form with the data from sheet {string} and clicks LoginButton")
	public void the_user_fills_the_form_with_the_data_from_sheet_and_clicks_login_button(String WorkSheetName) throws IOException, InterruptedException {
		Sp.FillSignInForm(WorkSheetName);
	}

	@Then("The user sign in successfully")
	public void the_user_sign_in_successfully() {
	    Sp.checkSuccessMsg();
	}
	@Then("user click on Sign Out")
	public void user_click_on_sign_out() throws Exception {
		Sp.clickSignOutLink();
	}
}

