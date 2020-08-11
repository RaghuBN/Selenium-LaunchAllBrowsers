package IEBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class InternetExploreBrowser {

	@Test
	public void IEBrowserLaunch64() 
	{
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Selenium Browsers Jars\\IE\\IE 64\\IEDriverServer.exe");  
		 
		WebDriver driver= new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
