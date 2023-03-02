package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ecommercePage extends funcionesBasicas {

	By inputBuscador = By.xpath("//input[@name='q']");
	By stringStock= By.xpath("//span[contains(.,'In stock')]");
	By btnAddToCart= By.xpath("//span[contains(.,'Add to Cart')]");
	By btnDetails = By.xpath("//a[@class='data switch'][contains(.,'Details')]");
	By btnMoreInformation = By.xpath("//a[contains(.,'More Information')]");
	
	public ecommercePage(WebDriver driver) {
		super(driver);
	}
	
	public void buscarProducto(String producto) {
		try {
			this.send(inputBuscador, producto);
			for(int i=1;i<12;i ++) {
				driver.findElement(By.xpath("//ol/li[@class='item product product-item']"+"["+i+"]")).click();
				if(driver.findElement(stringStock).isDisplayed()) {
					this.click(btnAddToCart);
					if(driver.findElement(btnDetails).isDisplayed()||driver.findElement(btnDetails).isEnabled()) {
						JavascriptExecutor js = (JavascriptExecutor)driver;
						js.executeScript("arguments[0],scrollIntoView();", btnDetails);
						this.click(btnMoreInformation);
					}
				}
			}
		}catch(Exception e) {
			System.out.println("[Luma-Ecommerce] El metodo buscarProducto ha fallado en: "+e);
		}
	}
}
