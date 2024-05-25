package com.endpoint.steps;

import com.endpoint.utils.CommonMethods;
import com.enpoint.testbase.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before
	public void start() {
		BaseClass.setUp();
	}
	
	@After
	public void end(Scenario scenario) {
		
		
		byte[] picture;
		
		
		//we want to store the screenshot in different locations if the scenario fails/passes
		if (scenario.isFailed())
		{
			//get the screenshot and save it in the failed folder
			picture = CommonMethods.takeScreenshot("failed/"+scenario.getName());
		}
		else
		{
			//get the screenshot and save it in the passed folder
			picture = CommonMethods.takeScreenshot("passed/" + scenario.getName());
		}
		
		scenario.attach(picture, "image/png", scenario.getName());
		
		BaseClass.tearDown();
	}

}
