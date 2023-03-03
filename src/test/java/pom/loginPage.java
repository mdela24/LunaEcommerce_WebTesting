package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends funcionesBasicas {
	
	By btnSigIn= By.xpath("(//a[contains(.,'Sign In')])[1]");
	By inputUserName = By.xpath("//form/fieldset/div/div/input[@name='login[username]']");
	By inputPassword = By.xpath("//form/fieldset/div[3]/div/input[@name='login[password]']");
	By inputCatcha=By.xpath("//input[contains(@name,'captcha[user_login]')]");
	By catcha = By.xpath("//img[@src='https://magento.softwaretestingboard.com/pub/media/captcha/base/ca2056cda930e89bbcace68fa110d12f.png']");

	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	public void login(String email, String password) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(btnSigIn));
			this.click(btnSigIn);
			this.send(inputUserName, email);
			this.send(inputPassword, password+Keys.TAB+Keys.ENTER);
		}catch(Exception e) {
			System.out.println("[Luma-Ecommerce] El metodo login ha fallado en: "+e);
		}
	}

}
