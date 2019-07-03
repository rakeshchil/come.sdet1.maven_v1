package src1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import library.Utility1;
//import library.Utilityclass;

public class ScreenShot {
	
      
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ITSTURN//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String exp = "https://www.srs.com";
		String act = driver.getTitle();
		if(exp.equals(act)) {
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
		Utility1.capture(driver, "hello");

	}

}
