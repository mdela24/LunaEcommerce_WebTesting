package ejecuciones;

import org.openqa.selenium.WebDriver;

import pom.loginPage;
import pom.myAcount;
import pom.newAcountPage;

public class objetos {
	protected WebDriver driver = hooks.getDriver();
	protected newAcountPage newAcount = new newAcountPage(driver);
	protected loginPage login = new loginPage(driver);
	protected myAcount acount = new myAcount(driver);
}
