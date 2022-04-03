package Academy.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver driver;
	public String URL;

	public WebDriver intializeDriver() throws IOException {

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\JavaTestWorkSpace\\FinalFrameWork\\src\\main\\java\\Academy\\utilities\\Data.properties");

		pro.load(fis);
		String Browser = pro.getProperty("browser");
		URL = pro.getProperty("url");

		switch(Browser) {
		  case "chrome":
		    // code block
			  
			  System.setProperty("webdriver.chrome.driver", pro.getProperty("chromedriverpath"));
				driver = new ChromeDriver();
		    break;
		  case "firefox":
		    // code block
			  
			  System.setProperty("webdriver.gecko.driver", pro.getProperty("firefoxdriverpath"));
				driver = new FirefoxDriver();
		    break;
		  default:
			  System.setProperty("webdriver.ie.driver", pro.getProperty("iedriverpath"));

				driver = new InternetExplorerDriver();
		}
		
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;

	}

}
