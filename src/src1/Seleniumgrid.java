package src1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Seleniumgrid {
	public static void main(String args[]) throws MalformedURLException {
	WebDriver driver;

	
		String nodeurl = "http://192.168.43.207:5555/wd/hub";
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WINDOWS);
		System.setProperty("webdriver.chrome.driver", "D://Grid//chromedriver.exe");
		driver = new RemoteWebDriver(new URL(nodeurl),caps);
		
	
	
	
		driver.get("https://www.facebook.com");
	

}
}
