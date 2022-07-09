package PageObjects;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Academy.utilities.Base;

public class LoginPagePF {
	
	private static final Logger log = LogManager.getLogger((LoginPagePF.class.getName()));

	public WebDriver driver;
	
	
	

	public LoginPagePF(WebDriver driver) {

		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		

	}

	// By url = By.linkText("Sign in");

	@FindBy(how = How.CSS, using = "a[title='Log in to your customer account']")
	WebElement login;

	public WebElement LoginBtn() {

		return login;
	}
	
	public void getURL( ) {
		
		
		
		log.info("got the url");	
		
		
		log.info("navigated to home page");
		LoginBtn().click();
		
		log.info("clicking on login page");
	}
	

}
