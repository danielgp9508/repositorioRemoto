package com.ProyectoSemillero.MercadoLibre.Definitions;

import com.ProyectoSemillero.MercadoLibre.Steps.CategoriaAdultosAutomaticaStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CategoriaAdultosAutomaticaDefinition {
	@Steps
	CategoriaAdultosAutomaticaStep categoriaAdultosAutomaticaStep;
	
	@Given("^Ingresar a Mercado Libre y Seleccionar Pais \"([^\"]*)\" \"([^\"]*)\"$")
	public void ingresar_a_Mercado_Libre_y_Seleccionar_Pais(String celda, String hojaCalculo ) throws Exception {
	    categoriaAdultosAutomaticaStep.ingresar_a_Mercado_Libre_y_Seleccionar_Pais(celda, hojaCalculo);
	}

	@When("^Escribir palabra \"([^\"]*)\" \"([^\"]*)\"$")
	public void escribir_palabra(String celda, String hojaCalculo) throws Exception {
	    categoriaAdultosAutomaticaStep.escribir_palabra(celda, hojaCalculo);
	}

	@Then("^Validar Pop-Up contenido para adulto$")
	public void validar_Pop_Up_contenido_para_adulto() throws Exception {
		categoriaAdultosAutomaticaStep.validar_Pop_Up_contenido_para_adulto();
	}

}
