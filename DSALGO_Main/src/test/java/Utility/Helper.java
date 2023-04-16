package Utility;
import java.time.Duration;
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
	public static void tearDown() {
		if (webdriver != null) {
			webdriver.close();
			webdriver.quit();
		}
		Helper = null;
	}
	
	
	
}


