package stepdefinitions;

import io.cucumber.java.en.*;

public class FbRegistration {

	@Given("user navigate to Url")
	public void user_navigate_to_Url() {
		
		
	}
	
	@When("Enter username (.+)")
	public void Enter_username(String username) {
		
		System.out.println(username);
	}

	@And("Enter new password (.+)")
	public void Enter_new_password(String password) {
		
		System.out.println(password);
	}
	
	@And("Enter Date of birth")
	public void Enter_Date_of_birth() {
		
	}
	@And("Enter Firstname (.+)")
	public void Enter_Firstname(String firstname) {
	
		System.out.println(firstname);
	}
	@And("Enter Surname (.+)")
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
	@When("Enter invalid username {string}")
	public void Enter_invalid_username(String username1) {
		
		System.out.println(username1);
	}

	@And("Enter invalid password {string}")
	public void Enter_invalid_password(String password1) {
		
		System.out.println(password1);
	}
	@Then("User should not register successfully")
	public void User_should_not_register_successfully() {
		
	}
}
