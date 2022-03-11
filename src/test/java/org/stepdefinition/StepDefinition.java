package org.stepdefinition;
import org.base.BaseClass;
import org.pojo.LoginPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition extends BaseClass {
	@Given("User have to enter facebook login through chrome browser")
	public void user_have_to_enter_facebook_login_through_chrome_browser() {
	   LoginPojo l = new LoginPojo();
	   ChromerBrowser();
	   LaunchUrl("https://www.facebook.com/");   
	}

	@When("User have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {
	    System.out.println("Valid email and invalid password");
	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() {
	    System.out.println("Login button");
	}

	@Then("User have to show invalid credentials page")
	public void user_have_to_show_invalid_credentials_page() {
	    System.out.println("Invalid credential");
	}
}
