package com.ProyectoSemillero.MercadoLibre.Steps;

import com.ProyectoSemillero.MercadoLibre.PageObjects.LoginPageObject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class ContrasenaStep {
	
	LoginPageObject loginPageObject;
//----------------------------------- contraseña correcta --------------------------------
	@Step
	public void ingresar_contraseña(String celda, String hojaCalculo) throws Exception {
		loginPageObject.ingresar_contraseña(celda, hojaCalculo);
		Serenity.takeScreenshot();
	}

	@Step
	public void validar_inicio_sesion() throws Exception {
	    loginPageObject.validar_inicio_sesion();
	    Serenity.takeScreenshot();
	}
//----------------------------------- contraseña incorrecta-----------------------------------
	@Step
	public void validarcontraseña_incorrecta() throws Exception {
		loginPageObject.validarcontraseña_incorrecta();
		Serenity.takeScreenshot();
	}


}
