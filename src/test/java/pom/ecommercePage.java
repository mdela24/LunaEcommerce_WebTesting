package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ecommercePage extends funcionesBasicas {

	By inputBuscador = By.xpath("//input[@name='q']");
	By stringHome= By.xpath("//div[@class='page-wrapper']/div[2]/ul/li/a");
	By btnAddToCart= By.xpath("//form[@id='product_addtocart_form']/div[2]/div/div/div[2]/button");
	By btnDetails = By.xpath("//a[@class='data switch'][contains(.,'Details')]");
	By btnTalla= By.xpath("//form[@id='product_addtocart_form']/div/div/div/div/div/div[@role='option']");
	By btnColor = By.xpath("//form[@id='product_addtocart_form']/div/div/div/div[2]/div/div[3]");
	By btnMoreInfo = By.xpath("//div[@class='product info detailed']/div/div[@data-role='collapsible'][2]");
	
	public ecommercePage(WebDriver driver) {
		super(driver);
	}
	
	public void buscarProducto(String producto) {
		try {
			this.send(inputBuscador, producto+Keys.ENTER);
			for(int i=1;i<=8;i++) {
				driver.findElement(By.xpath("//ol/li[@class='item product product-item']["+i+"]")).click();
				WebElement element = driver.findElement(stringHome);
				if(element.isEnabled()) {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.elementToBeClickable(element));

					WebElement btnAddCart = driver.findElement(btnAddToCart);
					JavascriptExecutor js = (JavascriptExecutor)driver;
					js.executeScript("arguments[0].scrollIntoView();", btnAddCart);

					List<WebElement>lista = driver.findElements(btnTalla);
					for(int i2 =1; i2<lista.size();i2++) {
						if(i2==1) {
							lista.get(i2).click();
						}
					}
					this.click(btnColor);
					this.click(btnAddToCart);
					if(driver.findElement(btnMoreInfo).isDisplayed()) {
						WebElement moreInfo = driver.findElement(btnMoreInfo);
						JavascriptExecutor js2 = (JavascriptExecutor)driver;
						js2.executeScript("arguments[0].scrollIntoView();", moreInfo);
						moreInfo.click();
						Thread.sleep(1000);
						driver.navigate().back();
					}
				}
			}
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println("[Luma-Ecommerce] El metodo buscarProducto ha fallado en: "+e);
		}
		System.out.println("[Luma-Ecommerce] El metodo buscarProducto ha pasado exitosamente");
	}
}
