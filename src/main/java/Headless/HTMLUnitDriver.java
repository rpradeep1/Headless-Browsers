package Headless;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
        //WebDriver driver = new HtmlUnitDriver();
        HtmlUnitDriver driver = new HtmlUnitDriver(true);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        /*driver.get("http://www.google.com");         
        WebElement element = driver.findElement(By.name("q"));	
        element.sendKeys("Guru99");					
        element.submit();         			
        System.out.println("Page title is: " + driver.getTitle());		
        driver.quit();	*/
        
        driver.get("https://qapolicy.ihtech.com/jbpm/#LogInPlace:login");
        System.out.println("Browser is opened successfully");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//div[@role='presentation'][@class='x-window-body']//tr//tr[1]/td[2]//input")).sendKeys("iht_ittest01");  
        System.out.println("Username is entered successfully");
        
        driver.findElement(By.xpath("//div[@role='presentation'][@class='x-window-body']//tr//tr[2]/td[2]//input")).sendKeys("Ihealth123");
        System.out.println("Password is enetered successfully");
        
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
        System.out.println("Sign-In Button is clicked successfully");
        
        
        
       

	}

}
