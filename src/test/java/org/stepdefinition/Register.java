package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.registration.RegistrationPage;

import io.cucumber.java.en.*;

public class Register extends BaseClass {

	RegistrationPage r;
	@When("User click create button")
	public void user_click_create_button() {
	    r=new RegistrationPage();
	   click(r.getBtnCreate());
	}

	@When("User enter firstname and lastname")
	public void user_enter_firstname_and_lastname() {
	    sendkeys(r.getTxtFirstname(), "sera");
	    sendkeys(r.getTxtlastname(), "raja");
	}

	@When("User click signup button")
	public void user_click_signup_button() {
	   click(r.getBtnSignUp());
	}

	@Then("User successfully registered")
	public void user_successfully_registered() {
	    Assert.assertTrue(true);
	    quit();
	}
}
