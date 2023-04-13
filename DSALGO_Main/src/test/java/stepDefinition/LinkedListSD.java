package stepDefinition;


import Pageobjectmodel.BaseClass;
import Pageobjectmodel.LinkedListPOM;
import Utility.Helper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListSD extends BaseClass{

	
	

@When("User clicks on Getstarted button under Linked List")
public void user_clicks_on_getstarted_button_under_linked_list() {
	
    ll.clickOnGetStarted();
}

@Then("User clicks on Introduction in Linked List page")
public void user_clicks_on_introduction_in_linked_list_page() {
	
	ll.clickOnIntroduction();
   
}

@When("User clicks on Try here button in Introduction of Linked List page")
public void user_clicks_on_try_here_button_in_introduction_of_linked_list_page() {
	
	ll.clickOntryhereBtn();
    
}

@When("User enters the Python code in text editor in Introduction of Linked List page")
public void user_enters_the_python_code_in_text_editor_in_introduction_of_linked_list_page() {
	
	ll.entercode();

}

@When("clicks on Run button in Introduction of Linked List page")
public void clicks_on_run_button_in_introduction_of_linked_list_page() throws InterruptedException {
	
	ll.clickOnrunBtn();
	Thread.sleep(1000);
    
}

@Then("User clicks on Creating Linked List in Linked List page")
public void user_clicks_on_creating_linked_list_in_linked_list_page() {
	
	ll.clickOncreatinglinkedlistlink();
    
}

@When("User clicks on Try here button in Creating Linked List in Linked List page")
public void user_clicks_on_try_here_button_in_creating_linked_list_in_linked_list_page() {
	
	ll.clickOntryhereBtn();
   
}

@When("User enters the Python code in text editor in Creating Linked List in Linked List page")
public void user_enters_the_python_code_in_text_editor_in_creating_linked_list_in_linked_list_page() {
	
	ll.entercode();
  
}

@When("clicks on Run button in Creating Linked List in Linked List page")
public void clicks_on_run_button_in_creating_linked_list_in_linked_list_page() throws InterruptedException {
 
	ll.clickOnrunBtn();
	Thread.sleep(1000);
}

@Then("User clicks on Types of Linked List in Linked List page")
public void user_clicks_on_types_of_linked_list_in_linked_list_page() {
	
	ll.clickOntypesoflinkedlistlink();

}

@When("User clicks on Try here button in Types of Linked List in Linked List page")
public void user_clicks_on_try_here_button_in_types_of_linked_list_in_linked_list_page() {
	
	ll.clickOntryhereBtn();
   
}

@When("User enters the Python code in text editor in Types of Linked List in Linked List page")
public void user_enters_the_python_code_in_text_editor_in_types_of_linked_list_in_linked_list_page() {
	
	ll.entercode();
    
}

@When("clicks on Run button in Types of Linked List in Linked List page")
public void clicks_on_run_button_in_types_of_linked_list_in_linked_list_page() throws InterruptedException {
   
	ll.clickOnrunBtn();
	Thread.sleep(1000);
}

@Then("User clicks on Implement Linked List in python in Linked List page")
public void user_clicks_on_implement_linked_list_in_python_in_linked_list_page() {
	
	ll.clickOnimplementlinkedlistlink();
   
}

@When("User clicks on Try here button in Implement Linked List in python in Linked List page")
public void user_clicks_on_try_here_button_in_implement_linked_list_in_python_in_linked_list_page() {
	
	ll.clickOntryhereBtn();
   
}

@When("User enters the Python code in text editor in Implement Linked List in python in Linked List page")
public void user_enters_the_python_code_in_text_editor_in_implement_linked_list_in_python_in_linked_list_page() {
	
	ll.entercode();
    
}

@When("clicks on Run button in Implement Linked List in python in Linked List page")
public void clicks_on_run_button_in_implement_linked_list_in_python_in_linked_list_page() throws InterruptedException {
	
	ll.clickOnrunBtn();
	Thread.sleep(1000);
  
}

@Then("User clicks on Traversal in Linked List page")
public void user_clicks_on_traversal_in_linked_list_page() {
	
	ll.clickOntraversallink();
    
}

@When("User clicks on Try here button in Traversal of Linked List page")
public void user_clicks_on_try_here_button_in_traversal_of_linked_list_page() {
	
	ll.clickOntryhereBtn();
    
}

@When("User enters the Python code in text editor in Traversal of Linked List page")
public void user_enters_the_python_code_in_text_editor_in_traversal_of_linked_list_page() {

	ll.entercode();
}

@When("clicks on Run button in Traversal of Linked List page")
public void clicks_on_run_button_in_traversal_of_linked_list_page() throws InterruptedException {
	
	ll.clickOnrunBtn();
	Thread.sleep(1000);
   
}

@Then("User clicks on Insertion in Linked List page")
public void user_clicks_on_insertion_in_linked_list_page() {
	
	ll.clickoninsertionlink();
  
}

@When("User clicks on Try here button in Insertion of Linked List page")
public void user_clicks_on_try_here_button_in_insertion_of_linked_list_page() {
	
	ll.clickOntryhereBtn();
    
}

@When("User enters the Python code in text editor in Insertion of Linked List page")
public void user_enters_the_python_code_in_text_editor_in_insertion_of_linked_list_page() {
	
	ll.entercode();
    
}

@When("clicks on Run button in Insertion of Linked List page")
public void clicks_on_run_button_in_insertion_of_linked_list_page() throws InterruptedException {
	
	ll.clickOnrunBtn();
	Thread.sleep(1000);
    
}

@Then("User clicks on Deletion in Linked List page")
public void user_clicks_on_deletion_in_linked_list_page() {
	
	ll.clickondeletionlink();
   
}

@When("User clicks on Try here button in Deletion of Linked List page")
public void user_clicks_on_try_here_button_in_deletion_of_linked_list_page() {
	
	ll.clickOntryhereBtn();
    
}

@When("User enters the Python code in text editor in Deletion of Linked List page")
public void user_enters_the_python_code_in_text_editor_in_deletion_of_linked_list_page() {
	
	ll.entercode();
   
}

@When("clicks on Run button in Deletion of Linked List page")
public void clicks_on_run_button_in_deletion_of_linked_list_page() throws InterruptedException {
   
	ll.clickOnrunBtn();
	Thread.sleep(1000);
}
}