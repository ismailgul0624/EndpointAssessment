package com.endpoint.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.endpoint.utils.ConfigsReader;
import com.endpoint.utils.Constants;

public class BaseClass {

	public static WebDriver driver;

	/**
	 * This method will initialize the driver
	 */
	public static void setUp() {
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		String browser = ConfigsReader.getProperty("browser");
		// System.out.println(browser);

		switch (browser.toLowerCase()) {
		case "chrome":
			// System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			break;

		case "firefox":
			// System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
			driver = new FirefoxDriver();
			break;

		default:
			break;
		}

		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
		driver.manage().window().maximize();
		String website = ConfigsReader.getProperty("url");
		driver.get(website);

		PageInitializer.initialize();
	}

	/**
	 * This method will quit the browser
	 */
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
