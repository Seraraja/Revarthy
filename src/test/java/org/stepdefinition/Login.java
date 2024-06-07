package org.stepdefinition;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.login.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
public class Login extends BaseClass{
	  LoginPage l;
	@Given("User navigate to the facebook application")
	public void user_navigate_to_the_facebook_application() {
	    
	}
	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String user, String pass) {
	   l=new LoginPage();
	  sendkeys(l.getTxtUsername(), user);
	  sendkeys(l.getTxtPassword(), pass);
	}
	@When("User click login button")
	public void user_click_login_button() throws InterruptedException {
	  click(l.getBtnLogin());
	   Thread.sleep(5000);
	}
	@Then("User navigate to invalid page")
	public void user_navigate_to_invalid_page() {
	   String currentUrl = getCurrentUrl();
	   boolean contains = currentUrl.contains("privacy");
	   Assert.assertTrue(false);
	  
	}
	
}
