package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPOM {

	public ArrayPOM(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}

	
	//@FindBy(xpath = "//a[text()='Sign in']") WebElement signinlink;
	//@FindBy(xpath = "//input[@name='username']")WebElement UsernameField1;
	//@FindBy(xpath = "//input[@name='password']")WebElement PasswordField1;	
	//@FindBy(xpath = "//input[@value='Login']")WebElement signinButton;
	
    @FindBy (xpath=("//h5[text()='Array']/..//a[text()='Get Started']")) WebElement getStartedArray;
    
    
	@FindBy (xpath = ("//a[text()='Arrays in Python']")) WebElement ArraysInPython;
	@FindBy (xpath = ("//a[text()='Try here>>>']")) WebElement TryHere;
	@FindBy (xpath = ("//form[@id='answer_form']/div/div/div[1]/textarea")) WebElement inputPythonCode;
	@FindBy (xpath ="//form/div/div/div/textarea")WebElement textEditor; 
	@FindBy (xpath = ("//button[text()='Run']")) WebElement Run;
	@FindBy (id = ("output")) WebElement outputPythonCode;
	
	@FindBy (xpath = ("//a[text()='Arrays Using List']")) WebElement ArraysUsingList;
	
	@FindBy (xpath = ("//a[text()='Basic Operations in Lists']")) WebElement BasicOperation;
	
	@FindBy (xpath = ("//a[text()='Applications of Array']")) WebElement ApplicationsOfArray;
	
	@FindBy (xpath = ("//div[@id='content']//a[text()='Practice Questions']"))WebElement PracticeQuest;
	
	@FindBy (xpath = ("//div[@class='list-group'][1]/a")) WebElement SearchArray;
	
	@FindBy (xpath = ("//div[@class='list-group'][2]/a")) WebElement MaxConsecutiveOne;
	@FindBy (xpath = ("//div[@class='list-group'][3]/a"))WebElement FindNum;
	@FindBy  (xpath = ("//div[@class='list-group'][4]/a")) WebElement Squares;
	
	
		
	
	//public void clicksigninlink() {
		//signinlink.click();
	//}
	//public void clickUsernameField1() {
		//UsernameField1.click();
	//}
	//public void clickPasswordField1() {
		//PasswordField1.click();
	//}
	//public void FillsigninForm(String UserName,String Password) throws InterruptedException
	//{
		//UsernameField1.click();
		//UsernameField1.sendKeys(UserName);
		//Thread.sleep(1000);
		//PasswordField1.sendKeys(Password);
		//Thread.sleep(1000);
	//}
	//public void clickLogInButton() {
		//signinButton.click();
	//}
	//public String alertMessage() {
		//String alert=driver.findElement(alertMessage).getText();
		//System.out.println(alert);
		//return alert;
	//}
	
	//public String header() {
		//String headermsg=driver.findElement(header).getText();
		//return headermsg;
	//}
	
	public void clickOngetStartedArray() {
		getStartedArray.click();
	}
	
	
	public void clkArraysInPython() {
		ArraysInPython.click();
	}
	public void clickOnTryHere() {
		 
		TryHere.click();
	}
	public void enterCode()  
	{
		
		textEditor.sendKeys("print(\"Hello Everyone\" \");");
		
		//textEditor.sendKeys(pythonCode);
	}	
	public void clickOnRun() {
		
		Run.click();		
	}
	public String Array_outputPythonCode()
	{

		String outputPythonCode=Array_outputPythonCode();
		
		return outputPythonCode;
	}	
	
	public void navigateback(){
	   navigateback();
	}

	public void clickArraysUsingList() {
		ArraysUsingList.click();
	}
		   
	public void clickOnBasicOperations() {
		BasicOperation.click();
	}
	
		   
	public void clickOnApplicationsOfArray() {
		ApplicationsOfArray.click();
	}	
	
	
	
	public void clickOnPracticeQues() {
		PracticeQuest.click();
		
		
		}
	public void clickOnGetStartedArray() {
		
		 getStartedArray.click();
		}

		
	public void clickOnSearchArray() {
		SearchArray.click();
		}
	
	
	public void clickOnMaxConsecutiveOnes() {
		MaxConsecutiveOne.click();
		}
	
		
	public void clickOnFindEvenNum() {
		FindNum.click();
		}
	
	public void clickOnFindSquares() {
		Squares.click();		
		}

}
   // public void Cleartext() throws InterruptedException {
	// TODO Auto-generated method stub
	
	//Thread.sleep(500);
	
	//textEditor.sendKeys(Keys.DELETE);
    //}


	


