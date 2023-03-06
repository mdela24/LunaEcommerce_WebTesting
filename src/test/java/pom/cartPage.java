package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cartPage extends funcionesBasicas {

	By btnIconCart = By.xpath("//header/div[2]/div/a");
	By btnViewCart = By.xpath("//span[contains(.,'View and Edit Cart')]");
	By estimate = By.xpath("//strong[contains(.,'Estimate Shipping and Tax')]");
	By btnCheckProduct = By.xpath("//div[@class='cart-summary _sticky']/ul/li/button");
	By listaPaises = By.tagName("option");
	By inputProvincia = By.xpath("//div[@class='field'][3]/div/input");
	By inputPostalCode = By.xpath("//div[@class='field'][4]/div/input");
	
	public cartPage(WebDriver driver) {
		super(driver);
	}
	
	public void RevisarProduct(String provincia, String postalCode) {
		try {
			WebElement iconCart = driver.findElement(btnIconCart);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(iconCart));
			iconCart.click();
			this.click(btnViewCart);
			this.click(estimate);
			List <WebElement> lista = driver.findElements(listaPaises);
			for(int i=1;i<= lista.size();i++) {
				if(i==46) {
					lista.get(i).click();
				}
			}
			this.send(inputProvincia, provincia);
			this.send(inputPostalCode, postalCode);

			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", btnCheckProduct);
			this.click(btnCheckProduct);
		}catch(Exception e) {

		}
	}
}
