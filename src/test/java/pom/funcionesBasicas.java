package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class funcionesBasicas {
	
	protected WebDriver driver;

	public funcionesBasicas (WebDriver driver) {
		this.driver = driver;
	}
	
	public void click(By element) {
		driver.findElement(element).click();
	}
	
	public void send (By element, String mensaje) {
		driver.findElement(element).sendKeys(mensaje);
	}

}
