package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterFillPF {

	public WebDriver driver;

	public RegisterFillPF(WebDriver driver) {

		this.driver = driver;

	}

	
	By gender = By.xpath("//input[@id='id_gender1']");

	public WebElement Genderid() {

		return driver.findElement(gender);
	}

	

}
