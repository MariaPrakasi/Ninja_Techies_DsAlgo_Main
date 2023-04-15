package stepDefinition;
import Utility.Helper;
import Pageobjectmodel.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignOutSD  extends BaseClass
{
	@Given("The user is on the SignIn page after Graph page")
	public void the_user_is_on_the_sign_in_page_after_graph_page()
	{
	   
	}

	@When("User clicks on signout")
	public void user_clicks_on_signout() {
	   So.logout();
	}

	@Then("Message displayed LoggedOut Successfully")
	public void message_displayed_logged_out_successfully() throws InterruptedException 
	{
	    So.successLogout();
	    Thread.sleep(1000);
	}

}
