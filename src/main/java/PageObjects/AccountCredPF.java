package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AccountCredPF {

	public WebDriver driver;

	public AccountCredPF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// By url = By.linkText("Sign in");

	@FindBy(id = "email")
	WebElement email;

	@FindBy(name = "passwd")
	WebElement password;

	@FindBy(how = How.CSS, using = "button[name='SubmitLogin']")
	WebElement submit;

	public WebElement userName() {

		return email;
	}

	public WebElement pwd() {

		return password;
	}

	public WebElement go() {

		return submit;
	}

}
