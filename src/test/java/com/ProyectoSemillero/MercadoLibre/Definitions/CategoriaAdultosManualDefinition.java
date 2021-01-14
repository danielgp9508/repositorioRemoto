package com.ProyectoSemillero.MercadoLibre.Definitions;

import com.ProyectoSemillero.MercadoLibre.Steps.CategoriaAdultosManualStep;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CategoriaAdultosManualDefinition {
	@Steps
	CategoriaAdultosManualStep categoriaAdultosManualStep;
	
	@When("^Seleccionar catergoria adultos$")
	public void seleccionar_catergoria_adultos() throws Exception {
		categoriaAdultosManualStep.seleccionar_catergoria_adultos();
	}

}
