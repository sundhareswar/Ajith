package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.LoginPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OutlineStepDefinition extends BaseClass {
	
	LoginPojo l;
	
	@Given("User has to launch he brwser and hit the url")
	public void user_has_to_launch_he_brwser_and_hit_the_url() {
		ChromerBrowser();
		LaunchUrl("https://www.facebook.com/");
	}

	@When("User has to pass bulk of datas to username feild")
	public void user_has_to_pass_bulk_of_datas_to_username_feild(String data) {
	 l = new LoginPojo();
	fillText(l.getUsernamebox(), data);
	
	}
	

	@When("User has to pass bulk of datas to password feild")
	public void user_has_to_pass_bulk_of_datas_to_password_feild(String data) {
		l = new LoginPojo();
		fillText(l.getPassword(), data);
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
		l= new LoginPojo();
		btnClick(l.getLoginbox());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
	}
}
