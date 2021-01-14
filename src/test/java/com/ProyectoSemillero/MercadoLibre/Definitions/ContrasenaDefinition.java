package com.ProyectoSemillero.MercadoLibre.Definitions;

import com.ProyectoSemillero.MercadoLibre.Steps.ContrasenaStep;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ContrasenaDefinition {
	@Steps
	ContrasenaStep contrasenaExistenteStep;
//--------------------------------contraseña correcta-------------------------------------------------------
	@When("^ingresar contraseña \"([^\"]*)\" \"([^\"]*)\"$")
	public void ingresar_contraseña(String celda, String hojaCalculo) throws Exception {
	    contrasenaExistenteStep.ingresar_contraseña(celda, hojaCalculo);
	}

	@Then("^Validar inicio sesion$")
	public void validar_inicio_sesion() throws Exception {
	    contrasenaExistenteStep.validar_inicio_sesion();
	}
//-------------------------------contraseña incorrecta-----------------------------------------------------------------	
	@Then("^Validarcontraseña incorrecta$")
	public void validarcontraseña_incorrecta() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    contrasenaExistenteStep.validarcontraseña_incorrecta();
	}




}
