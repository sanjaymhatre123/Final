package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import Academy.TestCasepack.Homepage;
//import jdk.internal.org.jline.utils.Log;

public class AccountCredPF {
	private static final Logger log = LogManager.getLogger((AccountCredPF.class.getName()));

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

	//@FindBy(css= "button[name='SubmitLogin']")

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
	
	
	
	public void login(String username, String password ) {
		
		
		
		log.info("sending username and password for :"  + username );

		userName().sendKeys(username);
		pwd().sendKeys(password);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		log.info("scrolling");
		
		
		
		go().click();
		log.info("closing the browser");
		
		
	}

}
