package JBPM;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class HeadlessTestNG {
	
	//WebDriver driver;
	HtmlUnitDriver driver;
	
	@BeforeMethod
	public void SetUpApplication()
	{
		/*String Path = System.getProperty("user.dir");	
		
		System.out.println(Path);
		
		System.setProperty("webdriver.chrome.driver", Path + "/BrowserDrivers/Chrome/chromedriver.exe");
		
		driver = new ChromeDriver();*/
		
		driver = new HtmlUnitDriver(true);
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);     
		
		Reporter.log("===========Browser Starting Session============");
		
		driver.get("https://qapolicy.ihtech.com/jbpm/#LogInPlace:login");
		
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void CloseApplication() 
	
	{
		
		driver.quit();		
		Reporter.log("===========Browser Closing Session============");	
		
	}
	
	@Test
	public void LoginToApplication ()
	
	{
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.xpath("//input[@id='x-auto-22-input']")).sendKeys("iht_ittest01");
		
		driver.findElement(By.id("x-auto-24-input")).sendKeys("Ihealth123");
		
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		System.out.println("Sign In Button is clicked Successfully");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		
	}
	
	
	@Test
	public void Loginfailed()
	
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='x-auto-22-input']")).sendKeys("iht_ittest021");
		
		driver.findElement(By.id("x-auto-24-input")).sendKeys("Ihealth12");
		
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		boolean val1 = driver.findElement(By.xpath("//label[text()='The username or password provided was incorrect.']")).isDisplayed();
		
		if (val1){
			Reporter.log("Login failure message displayed successfully");
		}
		
	}
	
	


}
