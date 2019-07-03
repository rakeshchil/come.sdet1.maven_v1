package src1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagefactory4 {
	WebDriver driver;
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name ="pass")
	WebElement password;
		
	@FindBy(id = "loginbutton")
	WebElement button;
	
	 Pagefactory4(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
		}
	
		public void setup(String uname) {
			username.sendKeys(uname);
		}
		public void setpass(String passw) {
			password.sendKeys(passw);
		}
		public void clickbutton() {
			button.click();
		}
		
	}


