package Testrunner;

//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
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
public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }

 
}



