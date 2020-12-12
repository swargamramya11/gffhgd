package baseclasses;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class logger {
	WebDriver driver;
	Logger Log;
public logger(WebDriver driver)
	{
		this.driver =driver;
		Log = Logger.getLogger("devpinoyLogger");
	}
//function to update a log message
	public void update(String message)
	{
		Log.debug(message);
	}
}
