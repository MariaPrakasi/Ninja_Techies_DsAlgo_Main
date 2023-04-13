package stepDefinition;

import Pageobjectmodel.BaseClass;
//import Pageobjectmodel.HomePOM;
import Utility.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomeSD extends BaseClass {
	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		Helper.openPage(Hp.url);
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_Get_Started_button() {
		Hp.clickGetStartedButton();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		Assert.assertEquals(true, Hp.RegisterLink.isDisplayed());
	}

	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {
//		Hp = new HomePOM(Helper.getDriver());
		Helper.openPage("https://dsportalapp.herokuapp.com");
		Hp.clickGetStartedButton();
		Assert.assertEquals(true, Hp.SignInLink.isDisplayed());
	}

	@When("The user clicks Sign In")
	public void the_user_clicks_Sign_In() {
	  Hp.clickSignInLink();
	  
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		Helper.NavBack();
	}

	@When("The user clicks Register")
	public void the_user_clicks_Register() {
	  Hp.clickRegisterLink();
	  
	}
	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		Helper.NavBack();
	}


}
