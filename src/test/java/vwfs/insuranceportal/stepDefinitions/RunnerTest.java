package vwfs.insuranceportal.stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/Features", glue = {"vwfs.insuranceportal.initialSetup","vwfs.insuranceportal.stepDefinitions" }, tags = { "@dealersearchportal" }, plugin = { "pretty", "html:target/cucumber",
				"json:target/cucumber/cucumber.json"}, monochrome = true)

public class RunnerTest extends AbstractTestNGCucumberTests {
}


