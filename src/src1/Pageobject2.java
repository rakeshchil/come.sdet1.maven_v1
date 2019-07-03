package src1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pageobject2 {
	WebDriver driver;
	By username = By.name("email");
	By passname = By.name("pass");
	By button   = By.id("u_0_a");
	Pageobject2(WebDriver d){
		driver =d;
	}
	public void setusrename(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	public void setupassword(String upass) {
		driver.findElement(passname).sendKeys(upass);
	}
	public void clickbutton() {
		driver.findElement(button).click();
	}
}

	

