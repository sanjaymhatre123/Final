package Academy.TestCasepack;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Academy.utilities.Base;
import PageObjects.AccountCredPF;
import PageObjects.LoginPagePF;
import PageObjects.RegisterFillPF;
import PageObjects.RegisterPF;
import jdk.internal.org.jline.utils.Log;

public class Homepage extends Base {

	private static final Logger log = LogManager.getLogger((Homepage.class.getName()));
	
	
	@DataProvider(name = "dp")
	public Object[][] getData() {

		Object[][] Data = new Object[2][3];

		Data[0][0] = "vin@test.com";
		Data[0][1] = "Sanjay123#";
		Data[0][2] = "Valid user";

		Data[1][0] = "qa@test.com";
		Data[1][1] = "bad@123#";
		Data[1][2] = "InValid user";

		return Data;

	}

	@Test(dataProvider = "dp")

	public void basePageNavigation(String username, String password, String text) throws IOException {

		// driver.get("http://automationpractice.com/index.php");

		driver.get(URL);
		LoginPagePF l = new LoginPagePF(driver);
		l.getURL();

		AccountCredPF ac = new AccountCredPF(driver);
		ac.login(username, password);
		

		/*
		 * ac.userName().sendKeys("123"); ac.pwd().sendKeys("456"); ac.go().click();
		 */
		/*
		 * log.info("sending username and password for :" + username );
		 * 
		 * ac.userName().sendKeys(username); ac.pwd().sendKeys("password");
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,400)"); log.info("scrolling");
		 * Log.info(text);
		 * 
		 * 
		 * ac.go().click(); log.info("closing the browser");
		 * 
		 * 
		 */

		/*
		 * RegisterPF r = new RegisterPF(driver);
		 * r.RegisteranEmail().sendKeys("vin@test.com"); r.createAccount().click();
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor)driver ;
		 * js.executeScript("window.scrollBy(0,400)");
		 * 
		 * RegisterFillPF rf= new RegisterFillPF(driver); rf.Genderid().click();
		 * 
		 */

	}

	@BeforeTest
	public void initilization() throws IOException {

		log.info("initlizing driver");
		driver = intializeDriver();
		log.info("driver initilized successfully");

	}

	

	@AfterTest
	public void closeDriver() {
		driver.close();
		log.info("closed the browser");
		

	}

}
