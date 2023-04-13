package stepDefinition;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import Pageobjectmodel.BaseClass;
import Pageobjectmodel.DataStructurePOM;
import Utility.*;
import stepDefinition.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructureSD extends BaseClass{
	
	//@When("The user clicks the signin link")
	//public void the_user_clicks_the_signin_link() {
		//DSp.clicksigninlink();
	//}

	

	//@When("The user fills the form {string} {string}")
	//public void the_user_fills_the_form(String UserName, String Password) throws InterruptedException {
	
		//DSp.FillsigninForm(UserName, Password); 
	
	//}
	

	//@Then("The user clicks LogIn button")
	//public void the_user_clicks_log_in_button() throws InterruptedException {
		//DSp.clickLogInButton();
	 //  Thread.sleep(1000);
	//}
	
	@When("The user click on Get started button in Data Structure")
	public void the_user_click_on_get_started_button_in_data_structure() {
		
	   DSp.clickOngetStartedDataStructure();
	}

	@When("The user click the link  with title Time Complexity")
	public void the_user_click_the_link_with_title_time_complexity() {
	    DSp.clkTimeComplexity();
	}

	@Then("The user click on Data Strucure Try here")
	public void the_user_click_on_data_strucure_try_here() {
	    DSp.clickOnDataStructureTryHere();
	}

	@And("The user input the Python code in Data Structure")
	public void the_user_input_the_python_code() {
	   DSp.enterCode();
	}

	@Then("The user click on run button")
	public void the_user_click_on_run_button() throws InterruptedException {
	   DSp.clickOnRun();
	   Thread.sleep(1000);
	}
	@When("The user click on Get started button in Data Structure for invalid code")
	public void the_user_click_on_get_started_button_in_data_structure_for_invalid_code() {
		DSp.clickOngetStartedDataStructure();
	}


	@When("The user click on Data Strucure Try here for invalid code")
	public void the_user_click_on_data_strucure_try_here_for_invalid_code() {
		DSp.clickOnDataStructureTryHere();
	}

	@When("The user click the link  with title Time Complexity for invalid code")
	public void the_user_click_the_link_with_title_time_complexity_for_invalid_code() {
	    DSp.clkTimeComplexity();
	}

	
	@Then("The user input the Python code in Data Structure for invalid code")
	public void the_user_input_the_python_code_in_data_structure_for_invalid_code() {
	    
	}

	@When("User enter the invalid Python code")
	public void user_enter_the_invalid_python_code(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException 
	{
		List<List<String>>data=pythonCode.cells();
		 DSp.InValidenterCode(data.get(0).get(0)); 
	}
	



	@When("User Clicks on Run button for invalid code")
	public void user_clicks_on_run_button_for_invalid_code() throws InterruptedException
	{
	    DSp.clickOnRun();
	   
	    Thread.sleep(1000);
	}
	@Then("User Verify the error message for invalid code")
	public void user_verify_the_error_message_for_invalid_code() throws InterruptedException 
	{
		String actualMsg = DSp.getErrormsg();
		System.out.println("Errormsg" +actualMsg);
		Thread.sleep(1000);
		
	}
	
	

	//@Then("The user navigate back")
	//public void the_user_navigate_back() {
	  // DSp.navigateback();

//}
}
