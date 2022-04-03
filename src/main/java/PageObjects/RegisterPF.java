package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPF {

	public WebDriver driver;

	public RegisterPF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	//By registerEmail = By.cssSelector("input[id='email_create']");
	
	
	@FindBy(how = How.CSS, using = "input[id='email_create']")
	WebElement registerEmail;
	

	
	
	// By account = By.xpath("//button[@id='SubmitCreate']");

	@FindBy(xpath="//button[@id='SubmitCreate']") 
	WebElement account;
	
	

	public WebElement RegisteranEmail() {

		return registerEmail;
	}

	public WebElement createAccount() {

		return account;
	}

}
