package com.ProyectoSemillero.MercadoLibre.Definitions;

import com.ProyectoSemillero.MercadoLibre.Steps.CatergoriaNOAdultosStep;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ContenidoNOAdultosDefinition {

	 @Steps
	 CatergoriaNOAdultosStep  catergoriaNOAdultosStep;
	 
	 @Then("^Validar No hay resultados en la categoria adultos$")
	 public void validar_No_hay_resultados_en_la_categoria_adultos() throws Exception {
		 catergoriaNOAdultosStep.validar_No_hay_resultados_en_la_categoria_adultos(); 
	 }


}
