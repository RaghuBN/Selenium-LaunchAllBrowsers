/*Test Case Study Excercise:
 
 * Understanding the browser launching command
 * Launching Firefox Browser
 * Enter URL in Browser
 * Close Firefox Browser
*/

package FFLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String arg[]) throws Exception {

		{
			System.setProperty("webdriver.gecko.driver",
					"D:\\Selenium\\Selenium Browsers Jars\\FireFox\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.testandquiz.com/user-login");
			driver.manage().window().maximize();
			driver.close();
		}
	}
}
