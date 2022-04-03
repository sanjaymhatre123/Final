package Academy.TestCasepack;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Academy.utilities.Base;
import PageObjects.AccountCredPF;
import PageObjects.LoginPagePF;
import PageObjects.RegisterFillPF;
import PageObjects.RegisterPF;

public class Homepage extends Base {

	@Test(dataProvider="dp")

	public void basePageNavigation(String username , String password, String text ) throws IOException {

		driver = intializeDriver();

		//driver.get("http://automationpractice.com/index.php");
		driver.get(URL);

		LoginPagePF l = new LoginPagePF(driver);
		l.LoginBtn().click();
		
		AccountCredPF ac=new AccountCredPF(driver);
		
		/*
		ac.userName().sendKeys("123");
		ac.pwd().sendKeys("456");
		ac.go().click();
    */
		
		ac.userName().sendKeys(username);
		ac.pwd().sendKeys("password");
		System.out.println(text);
		ac.go().click();
		
		/*
		RegisterPF r = new RegisterPF(driver);
		r.RegisteranEmail().sendKeys("vin@test.com");
		r.createAccount().click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("window.scrollBy(0,400)");
		
		RegisterFillPF rf= new RegisterFillPF(driver);
		rf.Genderid().click();
		
		*/
		
		
		
		

	}
	
	@DataProvider (name="dp")
	public Object[][] getData() {
		
		Object[][] Data =new Object [2][3];
		
		Data[0][0]="vin@test.com";
		Data[0][1]="Sanjay123#";
		Data[0][2]="Valid user";
		
		Data[1][0]="qa@test.com";
		Data[1][1]="bad@123#";
		Data[1][2]="InValid user";
		
		return Data;
		
		
		
		
	}

}
