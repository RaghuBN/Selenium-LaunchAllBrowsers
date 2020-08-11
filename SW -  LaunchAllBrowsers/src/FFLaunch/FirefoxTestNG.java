/*Test Case Study Excercise:	
 * 
 * Understanding the browser launching command
 * Launching Firefox Browser
 * Enter URL in Browser(https://demo.opencart.com/)
 * Use TestNG Framework
 * Print Title Of The Browser
 * Close Firefox Browser
 * 
*/


package FFLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTestNG {
	@Test
	 public void FirefoxBrowser()
	 {
		//Setting webdriver.gecko.driver property
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium Browsers Jars\\FireFox\\geckodriver.exe");
		
		//Instantiating driver object and launching browser
		WebDriver driver = new FirefoxDriver();
		
		 //Using get() method to open a webpage
		driver.get("https://demo.opencart.com/");
		
		// Method is use to Maximize window and it will fit to Window
		driver.manage().window().maximize();			
	    
		driver.navigate().refresh();
		
		//Using GetTitle Method Getting Title of Browser
		System.out.println(driver.getTitle());
		
		//Closing the browser
		driver.quit();
	}
}
