package StepDefinations;
import org.junit.runner.RunWith;

import Academy.utilities.Base;
import PageObjects.AccountCredPF;
import PageObjects.LoginPagePF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination extends Base {
	
	
	@Given("^With initalizing chrome Driver$")
    public void with_initalizing_chrome_driver() throws Throwable {
		
		driver=intializeDriver();
		System.out.println("You are in initilizing chrome driver");
        
    }

	@When("^entering (.+) and (.+)$")
    public void entering_and(String username, String password) throws Throwable {

		AccountCredPF ac = new AccountCredPF(driver);
		ac.login(username, password);
    	
    	System.out.println("You are in logging for username : "+ username + " and having password : "+ password );
        
    }

    @Then("^validate login is successull$")
    public void validate_login_is_successull() throws Throwable {
    	System.out.println("You are in validate login is successull");
    	driver.quit();
        
    }

    @And("^navigating to Home page via \"([^\"]*)\"$")
    public void navigating_to_home_page_via_something(String url) throws Throwable {
    	
    	driver.get(url);
    	System.out.println("navigating to Home page");
        
    }

    @And("^after coming to Login Page$")
    public void after_coming_to_login_page() throws Throwable {
    	
    	System.out.println("before coming to Login Pag");
    	LoginPagePF l = new LoginPagePF(driver);
		l.getURL();
    	
    	System.out.println("after coming to Login Pag");
    }

}
