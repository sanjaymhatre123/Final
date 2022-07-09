package Academy.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

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

		switch (Browser) {
		case "chrome":
			// code block

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			// code block

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.setProperty("webdriver.ie.driver", pro.getProperty("iedriverpath"));

			WebDriverManager.iedriver().setup();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		return driver;

	}

}
