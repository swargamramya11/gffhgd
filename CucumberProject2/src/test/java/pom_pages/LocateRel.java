package pom_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import baseclasses.DriverWait;


	public class LocateRel {
		  WebDriver driver;
		  By line=By.xpath("//*[@id=\"navbar\"]/div[3]/div[1]/span");
		  public LocateRel(WebDriver driver)
		  {
			  this.driver=driver;
		  }
		  public void line1() {
			  driver.findElement(line).click();
		  }
		}

