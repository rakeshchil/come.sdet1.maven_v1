package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility1 {
	public static void capture(WebDriver driver,String filepath) {
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File fs =ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fs, new File(".ScreenShots"+filepath+".png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("hiiiiii"+e.getMessage());
		} 
	}

}
