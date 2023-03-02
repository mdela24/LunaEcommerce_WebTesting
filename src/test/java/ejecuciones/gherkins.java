package ejecuciones;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class gherkins extends objetos {
	
	@Given("^agregamos la informacion personal \"(.*?)\" \"(.*?)\"$")
	public void agregamos_la_informacion_personal(String primerNom, String segundoNom) throws Throwable {
		newAcount.crearCuenta(primerNom, segundoNom);
	}

	@When("^agregamos la informacion de contacto \"(.*?)\" \"(.*?)\" \"(.*?)\"$")
	public void agregamos_la_informacion_de_contacto(String email, String pass, String confPass) throws Throwable {
		newAcount.crearcuenta2(email, pass, confPass);
	}

	@Then("^creamos la cuenta$")
	public void creamos_la_cuenta() throws Throwable {

	}
	
	@Given("^ingresamos el usuario \"(.*?)\" y el password \"(.*?)\" y nos logeamos$")
	public void ingresamos_el_usuario_y_el_password_y_nos_logeamos(String email, String password) throws Throwable {
		login.login(email, password);
	}
	
	@When("^ingresamos a la cuenta creada$")
	public void ingresamos_a_la_cuenta_creada() throws Throwable {
		acount.MyAcount();
	}
	
	@When("^Cambiar la contraseña \"(.*?)\", ingresar la nueva contraseña \"(.*?)\" y confirmarla \"(.*?)\"$")
	public void cambiar_la_contraseña_ingresar_la_nueva_contraseña_y_confirmarla(String currentPass, String newPass, String confNewPass) throws Throwable {
		acount.editMyAcount(currentPass, newPass, confNewPass);
	}

	@Given("^ingresamos el usuario \"(.*?)\" y el password \"(.*?)\"$")
	public void ingresamos_el_usuario_y_el_password(String email, String password) throws Throwable {
		login.login(email, password);
	}
}
