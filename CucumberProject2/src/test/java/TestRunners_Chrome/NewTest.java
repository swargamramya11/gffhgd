package TestRunners_Chrome;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.LaunchBrowser;
import pom_pages.LocateRel;

public class NewTest extends LaunchBrowser{
	LocateRel Rell;
	@BeforeClass
	  public void brows() {
		  Launchhhp("chrome","https://www.saucedemo.com/");
		  Rell=new LocateRel(driver);
	  }
	  @Test
	  public void testss() {
		  Rell.line1();
		  
	  }

//	  @AfterClass
//	  public void Close() {
//		 driver.quit();
//	  }

}
