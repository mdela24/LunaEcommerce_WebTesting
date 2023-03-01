package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class newAcountPage extends funcionesBasicas {

	By btnCrearCuenta = By.xpath("(//a[contains(.,'Create an Account')])[1]");
	By inputPrimerNom = By.xpath("//form/fieldset/div/div/input[@id='firstname']");
	By inputSegundoNom = By.xpath("//form/fieldset/div[2]/div/input[@id='lastname']");
	By inputEmail = By.xpath("//form/fieldset[2]/div/div/input[@id='email_address']");
	By inputPass = By.xpath("//form/fieldset[2]/div[2]/div/input[@id='password']");
	By inputConfPass= By.xpath("//form/fieldset[2]/div[3]/div/input[@id='password-confirmation']");
	public newAcountPage(WebDriver driver) {
		super(driver);

	}
	
	public void crearCuenta(String primerNom, String segundoNom) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(btnCrearCuenta));
			this.click(btnCrearCuenta);
			this.send(inputPrimerNom, primerNom);
			this.send(inputSegundoNom, segundoNom);
		}catch(Exception e) {

		}
	}
	
	public void crearcuenta2(String email, String pass, String confPass) {
		try {
			this.send(inputEmail, email);
			this.send(inputPass, pass);
			this.send(inputConfPass, confPass+Keys.TAB+Keys.ENTER);
		}catch(Exception e) {
			
		}
	}

}
