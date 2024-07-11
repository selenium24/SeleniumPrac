package stepdefinitions;

import io.cucumber.java.en.*;

public class FbRegistration {

	@Given("user navigate to Url")
	public void user_navigate_to_Url() {
		
		
	}
	
	@When("Enter username {string}")
	public void Enter_username(String username) {
		
		System.out.println(username);
	}

	@And("Enter new password {string}")
	public void Enter_new_password(String password) {
		
		System.out.println(password);
	}
	
	@And("Enter Date of birth")
	public void Enter_Date_of_birth() {
		
	}
	@And("Enter Firstname {string}")
	public void Enter_Firstname(String firstname) {
	
		System.out.println(firstname);
	}
	@And("Enter Surname {string}")
	public void Enter_Surname(String surname) {
	
		System.out.println(surname);
	}
	@And("Select gender")
	public void Select_gender() {
		
	}
	
	@And("Click on Signin button")
	public void Click_on_Signin_button() {
		
	}
	@Then("User should register successfully")
	public void User_should_register_successfully() {
		
	}
}
