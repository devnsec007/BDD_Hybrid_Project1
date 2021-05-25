package com.qa.testRunner;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features="F:\\eclipse-workspace\\HybridBDDProject\\src\\main\\resources\\featurefile\\ajaxFormSubmition.feature",
			glue = {"com.qa.stepdef"},monochrome = true, plugin =  {"json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
			
			)
	public class TestRunner {

	}
	

