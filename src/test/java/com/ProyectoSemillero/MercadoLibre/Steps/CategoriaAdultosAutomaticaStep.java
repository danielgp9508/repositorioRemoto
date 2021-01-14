package com.ProyectoSemillero.MercadoLibre.Steps;

import java.io.IOException;

import com.ProyectoSemillero.MercadoLibre.PageObjects.PaginaPrincipalPageObject;
import com.ProyectoSemillero.MercadoLibre.PageObjects.PaisPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class CategoriaAdultosAutomaticaStep {
	PaisPageObject paisPageObject;
	PaginaPrincipalPageObject paginaPrincipalPageObject;
	
	@Step
	public void ingresar_a_Mercado_Libre_y_Seleccionar_Pais(String celda, String hojaCalculo ) throws NumberFormatException, IOException {
	    paisPageObject.open();
	    paisPageObject.getDriver().manage().window().maximize();
	    paisPageObject.seleccionar_Pais(celda, hojaCalculo);
	    Serenity.takeScreenshot();
	}

	@Step
	public void escribir_palabra(String celda, String hojaCalculo) throws Exception {
		paginaPrincipalPageObject.escribir_palabra(celda, hojaCalculo);
		Serenity.takeScreenshot();
	}

	@Step
	public void validar_Pop_Up_contenido_para_adulto() throws Exception {
	    paginaPrincipalPageObject.validar_Pop_Up_contenido_para_adulto();
	    Serenity.takeScreenshot();
	}

}
