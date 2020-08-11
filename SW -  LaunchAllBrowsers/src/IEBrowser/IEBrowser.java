package IEBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class IEBrowser {
	@Test
	public void IEBrowserLaunch32() 
	{
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Selenium Browsers Jars\\IE\\IE 32\\IEDriverServer.exe");  
		 
		WebDriver driver= new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
