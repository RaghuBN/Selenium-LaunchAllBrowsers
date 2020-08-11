/*Assertion Case Study Excercise:	
 * 
 * Use TestNG Framework
 * Launch URL "http://automationpractice.com/index.php" Using Firefox Browser 
 * Compare Browser Title by Assertions and Print Browser Title
 * Close Firefox Browser
 * 
*/


package FFLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxByAssertion {
	//Creating a driver object referencing WebDriver interface
	WebDriver driver;
	
	@Test
	 public void FirefoxBrowser()
	 {	
		    String WebURl = "http://automationpractice.com/index.php";
	        String expectedTitle = "My Store45";
	        String actualTitle = " ";

	        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium Browsers Jars\\FireFox\\geckodriver.exe");	
			driver = new FirefoxDriver();	 
	        // launch Fire fox and direct it to the Base URL
	        driver.get(WebURl);
	        driver.manage().window().maximize();
	        
	        // get the actual value of the title
	        actualTitle = driver.getTitle();
	        
           // Use Condition To Check
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("TestCase Sucessfull....!");
	        } else {
	            System.out.println("TestCase Secnario Failed....");
	        }
	   		driver.quit();
	}
}
