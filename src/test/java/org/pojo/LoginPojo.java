package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "email")

	private WebElement Usernamebox;

	public WebElement getUsernamebox() {
		return Usernamebox;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginbox() {
		return Loginbox;
	}

	@FindBy(name = "pass")

	private WebElement Password;

	@FindBy(name = "login")

	private WebElement Loginbox;
	
	
	
	
	
	
	
	
	
}
