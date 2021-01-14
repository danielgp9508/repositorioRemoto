package com.ProyectoSemillero.MercadoLibre.Definitions;

import com.ProyectoSemillero.MercadoLibre.Steps.UsuarioStep;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UsuarioDefinition {
	@Steps
	UsuarioStep usuarioExistenteStep;

	@When("^Presionar en Ingresar$")
	public void presionar_en_Ingresar() throws Exception {
		usuarioExistenteStep.presionar_en_Ingresar();
	}

	@When("^ingresar usuario \"([^\"]*)\" \"([^\"]*)\"$")
	public void ingresar_usuario(String celda, String hojaCalculo) throws Exception {
		usuarioExistenteStep.ingresar_usuario(celda, hojaCalculo);
	}

	@Then("^Validar existencia del usuario$")
	public void validar_existencia_del_usuario() throws Exception {
		usuarioExistenteStep.validar_existencia_del_usuario();
	}
//-----------------------------------------------usuario no existente-------------------------------------------
	@Then("^Validar NO existencia del usuario$")
	public void validar_NO_existencia_del_usuario() throws Exception {
		usuarioExistenteStep.validar_NO_existencia_del_usuario();
	}

}
