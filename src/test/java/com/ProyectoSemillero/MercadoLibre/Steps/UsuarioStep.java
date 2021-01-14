package com.ProyectoSemillero.MercadoLibre.Steps;

import com.ProyectoSemillero.MercadoLibre.PageObjects.LoginPageObject;
import com.ProyectoSemillero.MercadoLibre.PageObjects.PaginaPrincipalPageObject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class UsuarioStep {
	
	LoginPageObject loginPageObject;
	PaginaPrincipalPageObject paginaPrincipalPageObject;
//-----------------------------------------------usuario existente------------------------------------
	@Step
	public void presionar_en_Ingresar() throws Exception {
	    paginaPrincipalPageObject.presionar_en_Ingresar();
	    Serenity.takeScreenshot();
	}

	@Step
	public void ingresar_usuario(String celda, String hojaCalculo) throws Exception {
	    loginPageObject.ingresar_usuario(celda, hojaCalculo);
	    Serenity.takeScreenshot();
	}

	@Step
	public void validar_existencia_del_usuario() throws Exception {
	    loginPageObject.validar_existencia_del_usuario();
	    Serenity.takeScreenshot();
	}
//--------------------------------------------------usuario No existente--------------------------
	@Step
	public void validar_NO_existencia_del_usuario() throws Exception {
		loginPageObject.validar_NO_existencia_del_usuario();
		Serenity.takeScreenshot();
	}


}
