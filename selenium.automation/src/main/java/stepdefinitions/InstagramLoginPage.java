package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InstagramLoginPage {
	
    @Given("navigate to instagram login page")
    public void navigate_to_instagram_login_page() {
    	
    }
    @When("I check for the username {string}")
    public void I_check_for_the_username(String username) {
		System.out.println(username);
    }
    @When("I check for password {string}")
	public void I_check_for_the_password(String password) {
		System.out.println(password);
	}
    @Then("I verify the login status {string}")
	public void I_verify_the_login(String status) {
		
		System.out.println(status);
		
	}
    
}
