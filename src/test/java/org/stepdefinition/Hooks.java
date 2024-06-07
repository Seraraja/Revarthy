package org.stepdefinition;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{

	@Before
	public void beforeScenario1() {
		System.out.println("Before scenario-1");
		launchBrowser("chrome");
	    implicitWait(20);
	    urlLaunch("https://www.facebook.com/");
	}
	
	
	
	@After
	public void afterScenario1() {
		System.out.println("After scenario-1");
        quit();
	}
	
	
	
}
