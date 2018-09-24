package JIRA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.RectangleSize;

public class HelloWorld {

   public static void main(String[] args) {

       // Open a Chrome browser.
	   
		String Path = System.getProperty("user.dir");	
		
		System.out.println(Path);
		
		System.setProperty("webdriver.chrome.driver", Path + "/BrowserDrivers/Chrome/chromedriver.exe");
		
		
       WebDriver driver = new ChromeDriver();
       
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       // Initialize the eyes SDK and set your private API key.
       Eyes eyes = new Eyes();
       
       eyes.setApiKey("YOUR_API_KEY");

       try{

           // Start the test and set the browser's viewport size to 800x600.
           eyes.open(driver, "Hello World!", "My first Selenium Java test!",
                   new RectangleSize(800, 600));

           // Navigate the browser to the "hello world!" web-site.
           driver.get("https://applitools.com/helloworld");
           
           driver.manage().window().maximize();
           

           // Visual checkpoint #1.
           eyes.checkWindow("Hello!");

           // Click the "Click me!" button.
           driver.findElement(By.tagName("button")).click();

           // Visual checkpoint #2.
           eyes.checkWindow("Click!");

           // End the test.
           eyes.close();

       } finally {

           // Close the browser.
           driver.quit();

           // If the test was aborted before eyes.close was called, ends the test as aborted.
           eyes.abortIfNotClosed();
       }

   }

}