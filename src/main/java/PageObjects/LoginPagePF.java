package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePF {

	public WebDriver driver;

	public LoginPagePF(WebDriver driver) {

		this.driver = driver;

	}

	By url = By.linkText("Sign in");

	public WebElement Link() {

		return driver.findElement(url);
	}

}
