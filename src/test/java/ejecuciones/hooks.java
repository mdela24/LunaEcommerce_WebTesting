package ejecuciones;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {

	static WebDriver driver;
	@Before
	public void setupWeb() {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
	}
	
	static WebDriver getDriver() {
		return driver;
	}
	@After
	public void tearsDown() {
//		driver.close();
	}
}
