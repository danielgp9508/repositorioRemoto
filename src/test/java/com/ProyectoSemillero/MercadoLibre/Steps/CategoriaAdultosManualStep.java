package com.ProyectoSemillero.MercadoLibre.Steps;

import com.ProyectoSemillero.MercadoLibre.PageObjects.PaginaPrincipalPageObject;

import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class CategoriaAdultosManualStep {
	PaginaPrincipalPageObject paginaPrincipalPageObject;
	
	@Step
	public void seleccionar_catergoria_adultos() throws Exception {
	    paginaPrincipalPageObject.seleccionar_catergoria_adultos();
	    Serenity.takeScreenshot();
	}
}
