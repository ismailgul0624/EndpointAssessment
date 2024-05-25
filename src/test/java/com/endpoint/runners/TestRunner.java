package com.endpoint.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/test/resources/features/",

		
		glue = "com.endpoint.steps",

		
		dryRun = true,

		
		tags = "@endpoint",

		
		monochrome = true,
		
		plugin = {
				
				"pretty",
				
				"html:target/cucumber-default-report.html",
				
				"json:target/cucumber.json"}   
		)

public class TestRunner {
	
	
	
	
	
	
	

}
