package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/Feature"},
		glue ="stepDefinition",
		monochrome=true,
		plugin= {"pretty",
				"html:target/cucumber.html",
				"json:target/cucumber-reports/reports.json",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		)
public class TestRunner {
 
 
}



