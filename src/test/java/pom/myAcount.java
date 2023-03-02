package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myAcount extends funcionesBasicas{

	By btnList = By.xpath("//header/div/div/ul/li[2]/span/button");
	By btnMyAcount = By.xpath("//header/div/div/ul/li[2]/div/ul/li");
	By btnEdit = By.xpath("(//span[contains(.,'Edit')])[1]");
	By checkChangePass = By.xpath("//input[contains(@name,'change_password')]");
	By inputPassActual = By.xpath("//input[contains(@name,'current_password')]");
	By inputNewPass =By.xpath("(//input[contains(@type,'password')])[2]");
	By inputConfPass = By.xpath("(//input[contains(@type,'password')])[3]");
	By btnSave = By.xpath("//span[contains(.,'Save')]");
	
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
	
	public void editMyAcount(String currentPass, String newPass, String confNewPass) {
		try {
			this.click(btnEdit);
			this.click(checkChangePass);
			this.send(inputPassActual, currentPass);
			this.send(inputNewPass, newPass);
			this.send(inputConfPass, confNewPass);
			this.click(btnSave);
			
		}catch(Exception e) {
			
		}
	}
	
	
}
