package src1;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hashmapsel {

		static HashMap<String,String> logindata()
		{
		// TODO Auto-generated method stub
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("x","qwe@zxzx");
		hm.put("q","qwqw@zxzx");
		hm.put("w","qwwq@zxx");
		return hm;
		}
		
		public static void main(String[] args) {
			String cred = Hashmapsel.logindata().get("x");
			System.out.println(cred);
			String arr[] = cred.split("@");
			System.out.println(arr[0]);
			System.setProperty("webdriver.chrome.driver", "D://ITSTURN//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/");
			driver.findElement(By.name("userName")).sendKeys(arr[0]);
			driver.findElement(By.name("password")).sendKeys(arr[1]);
		

	}

}
