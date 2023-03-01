package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myAcount extends funcionesBasicas{

	By btnList = By.xpath("//header/div/div/ul/li[2]/span/button");
	By btnMyAcount = By.xpath("//header/div/div/ul/li[2]/div/ul/li");
	public myAcount(WebDriver driver) {
		super(driver);
	}

	public void MyAcount () {
		try {
			this.click(btnList);
			List<WebElement> element = driver.findElements(btnMyAcount);
			for(int i=0; i<element.size();i++) {
				if(i==0) {
					element.get(i).click();
				}
			}
		}catch(Exception e) {
			System.out.println("[Luma-Ecommerce] El metodo MyAcount ha fallado en: "+e);
		}
	}
}
