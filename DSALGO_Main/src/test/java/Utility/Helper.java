package Utility;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {
	private static Helper Helper;
	private static WebDriver webdriver;
	public final static int TIMEOUT = 2;
	public String url="https://dsportalapp.herokuapp.com";
	
	private Helper() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	
		WebDriverManager.chromedriver().setup();
		webdriver = new ChromeDriver(options);
		
		new WebDriverWait(webdriver, Duration.ofSeconds(TIMEOUT));
		webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		webdriver.manage().window().maximize();
	}

	public static void openPage(String url) {
		webdriver.get(url);;
		}
	public static void NavBack() {
		webdriver.navigate().back();
	}
	//public static void clearCode()
	//{
		//webdriver.
	//}
	
	public static WebDriver getDriver() 
	{
		return webdriver;
	}

	public static void setUpDriver() {
		if (Helper == null) {
			Helper = new Helper();
		}
	}
	public static void screenshot(WebDriver driver, long ms)
	{

	try {
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./ScreenShots/"+ms+"Facebook.png"));
	    System.out.println("ScreenShot Taken");
	} 
	catch (Exception e) 
	{
	    System.out.println("Exception while taking ScreenShot "+e.getMessage());
	}


	}
	public static void tearDown() {
		if (webdriver != null) {
			webdriver.close();
			webdriver.quit();
		}
		Helper = null;
	}
	
	
	
}


