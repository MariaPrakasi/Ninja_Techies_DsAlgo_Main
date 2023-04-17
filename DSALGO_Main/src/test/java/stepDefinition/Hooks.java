package stepDefinition;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import java.io.ByteArrayInputStream;
import Pageobjectmodel.BaseClass;

import Utility.Helper;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import io.cucumber.java.Status;

public class Hooks extends BaseClass {
	private static WebDriver driver;
	static Scenario scenario;
	@BeforeAll
	   public static void setUp() {
	    	
		Helper.setUpDriver();
	   }
	
	@Before
	public void scenario(Scenario scenario) {
//		LoggerLoad.info("===============================================================================================");
//		LoggerLoad.info(scenario.getSourceTagNames() +" : "+scenario.getName());
//		LoggerLoad.info("-----------------------------------------------------------------------------------------------");
		Helper.setUpDriver();
	}
//	@After
//	public void tearDown(Scenario scenario)
//	{	        
//		 if(scenario.getStatus()==Status.FAILED)
//		 {				 
//			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);	
//			scenario.attach(screenshot, "image/png", scenario.getName());
//		
//	     }   
//		 else if (scenario.getStatus()==Status.PASSED)
//		 {
//			 System.out.println("Scenario Passed");
//		 }
//		
//	}
	@AfterAll
	public static void after() {
//		LoggerLoad.info("Closing Driver");
		Helper.tearDown();
	}
}

