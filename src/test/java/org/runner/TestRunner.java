package org.runner;

import org.base.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
                  glue="org.stepdefinition",
                  dryRun=false,
                  monochrome=true, //out print as readable format
                  tags="@smoke or @retest",
                  plugin= {"pretty",
                  "html:src\\test\\resources\\Reports\\htmlreports",
                  "json:src\\test\\resources\\Reports\\Jsonreport\\jsonreport.json",
                  "junit:src\\test\\resources\\Reports\\Junitreport\\junitreport.xml",
                  "rerun:src\\test\\resources\\FailedScenario\\sample.txt"}) //to capture the failed scenario
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		JvmReport.generateJVMReport("src\\test\\resources\\Reports\\Jsonreport\\jsonreport.json");
        System.out.println("Report generated");
	}
	
	
}
