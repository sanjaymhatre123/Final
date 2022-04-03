package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePF {

	public WebDriver driver;

	public LoginPagePF(WebDriver driver) {

		this.driver = driver;

	}

	//By url = By.linkText("Sign in");
	
	
	@FindBy  (linkText ="Sign in")
	WebElement url;

	public WebElement Link() {

		return url;
	}

}
