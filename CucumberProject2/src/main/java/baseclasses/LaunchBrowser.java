package baseclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
	protected static WebDriver driver;
	  public static WebDriver Launchhhp(String browser,String url) {
		  
			  if(browser.equalsIgnoreCase("chrome"))
			  {
				  System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
				  driver=new ChromeDriver();
			  }
			  else if(browser.equalsIgnoreCase("internetexplorer"))
			  {
				  System.setProperty("webdriver.IE.driver","C:\\Users\\Silpa Chowdary\\Desktop\\selenium jar files\\chromedriver_win32\\IEDriverServer.exe");
				  driver=new InternetExplorerDriver();
			  }
			  else if(browser.equalsIgnoreCase("firefox"))
			  {
				  driver=new FirefoxDriver();
			  }
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  driver.get(url);
			  return driver;
		  }
		  }
