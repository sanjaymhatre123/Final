package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPF {

	public WebDriver driver;

	public RegisterPF(WebDriver driver) {

		this.driver = driver;

	}

	By registerEmail = By.cssSelector("input[id='email_create']");
	By account = By.xpath("//button[@id='SubmitCreate']");

	public WebElement RegisteranEmail() {

		return driver.findElement(registerEmail);
	}

	public WebElement createAccount() {

		return driver.findElement(account);
	}

}
