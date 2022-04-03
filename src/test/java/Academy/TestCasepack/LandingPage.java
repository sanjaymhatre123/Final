package Academy.TestCasepack;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.Test;

import Academy.utilities.Base;
import PageObjects.LoginPagePF;
import PageObjects.RegisterFillPF;
import PageObjects.RegisterPF;

public class LandingPage extends Base {

	@Test

	public void testc() throws IOException {

		driver = intializeDriver();

		//driver.get("http://automationpractice.com/index.php");
		driver.get(URL);

		LoginPagePF l = new LoginPagePF(driver);
		l.Link().click();
		RegisterPF r = new RegisterPF(driver);
		r.RegisteranEmail().sendKeys("vin@test.com");
		r.createAccount().click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("window.scrollBy(0,400)");
		
		RegisterFillPF rf= new RegisterFillPF(driver);
		rf.Genderid().click();

	}

}
