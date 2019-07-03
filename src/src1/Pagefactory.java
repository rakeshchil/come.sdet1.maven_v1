package src1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pagefactory {
	WebDriver driver;
	@FindBy(name = "email")
	WebElement uname;
	
	@FindBy(how=How.NAME , using = "pass")
	WebElement upass;
	
	@FindBy(how=How.ID,using ="u_0_a")
	WebElement button;
	
	Pagefactory(WebDriver d){
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	public void setusername(String fname ) {
		uname.sendKeys(fname);
	}
	public void setuserpassword(String passwd) {
		upass.sendKeys(passwd);
	}
	public void clickbutton() {
		button.click();
	}

}
