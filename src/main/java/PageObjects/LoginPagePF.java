package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {

	public WebDriver driver;

	public LoginPagePF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// By url = By.linkText("Sign in");

	@FindBy(how = How.CSS, using = "a[class='login']")
	WebElement login;

	public WebElement LoginBtn() {

		return login;
	}

}
