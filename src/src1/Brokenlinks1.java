package src1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ITSTURN//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		int count = ele.size();
		System.out.println(count);
		for(int i=0;i<ele.size();i++) {
			WebElement ele1 = ele.get(i);
			String url = ele1.getAttribute("href");
			System.out.println(url);
			URL links = new URL(url);
			HttpURLConnection httpcon = (HttpURLConnection)links.openConnection();
			httpcon.connect();
			int responsecode = httpcon.getResponseCode();
			if(responsecode>400) {
				System.out.println(url+" -"+ "is a broken link");
			}
			else
			driver.close();
		}

	}

}
