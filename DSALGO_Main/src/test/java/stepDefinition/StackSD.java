package stepDefinition;
import Pageobjectmodel.BaseClass;
import Pageobjectmodel.StackPOM;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utility.Helper;

public class StackSD extends BaseClass {
	

	
@When("User clicks on Getstarted button under Stack")
public void user_clicks_on_getstarted_button_under_stack() {
	
	st.clickOnGetStarted();
 
}

@Then("User clicks on Operations in Stack")
public void user_clicks_on_operations_in_stack() {
	
	st.clickOnOperationsInStackLink();
  
}

@When("User clicks on Try here in Operations in Stack")
public void user_clicks_on_try_here_in_operations_in_stack() {
	
	st.clickOntryhereBtn();
}

@When("User enters the Python code in Operations in Stack")
public void user_enters_the_python_code_in_operations_in_stack() {
	
	st.entercode();

}

@When("clicks on Run button in Operations in Stack")
public void clicks_on_run_button_in_operations_in_stack() throws InterruptedException {
	
	st.clickOnrunBtn();
	Thread.sleep(1000);
 
}

@Then("user is navigated to home page {string}")
public void user_is_navigated_to_home_page(String string) {
   Helper.NavBack();
   Helper.NavBack();
   Helper.NavBack();
}

@Then("User clicks on Implementation in Stack")
public void user_clicks_on_implementation_in_stack() {
	
	st.clickOnImplementationLink();

}

@When("User clicks on Try here in Implementation in Stack")
public void user_clicks_on_try_here_in_implementation_in_stack() {
	
	st.clickOntryhereBtn();
   
}

@When("User enters the Python code in Implementation in Stack")
public void user_enters_the_python_code_in_implementation_in_stack() {
	
	st.entercode();

}

@When("clicks on Run button in Implementation in Stack")
public void clicks_on_run_button_in_implementation_in_stack() throws InterruptedException {
	
	st.clickOnrunBtn();
	Thread.sleep(1000);
}

@Then("User clicks on Applications in Stack")
public void user_clicks_on_applications_in_stack() {
	
	st.clickOnApplicationsLink();

}

@When("User clicks on Try here in Applications in Stack")
public void user_clicks_on_try_here_in_applications_in_stack() {
	
	st.clickOntryhereBtn();
   
}

@When("User enters the Python code in Applications in Stack")
public void user_enters_the_python_code_in_applications_in_stack() {

	st.entercode();
}

@When("clicks on Run button in Applications in Stack")
public void clicks_on_run_button_in_applications_in_stack() throws InterruptedException {
	
	st.clickOnrunBtn();
	Thread.sleep(1000);

}

}