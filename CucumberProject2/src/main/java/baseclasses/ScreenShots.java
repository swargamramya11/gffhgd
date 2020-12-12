package baseclasses;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {
WebDriver driver;
logger log;
//constructor for driver
public ScreenShots(WebDriver driver)
	{
		this.driver=driver;
		log =new logger(driver);
	}
//Takes the sreenshot  name
public void screenShot(String name)
	{
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f2=new File("src/test/resources/ScreenShots/"+name+".png");
		try 
		{
			FileUtils.copyFile(f1,f2);
			log.update("ScreenShot taken in name of "+name);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			log.update("Error in taking ScreenShots");
		}
		catch(IncompatibleClassChangeError e)
		{
			e.printStackTrace();
			log.update("Exception in incompatile class change error method");
		}
	}
}
