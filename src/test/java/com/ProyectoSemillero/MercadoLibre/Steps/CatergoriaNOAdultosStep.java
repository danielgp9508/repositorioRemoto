package com.ProyectoSemillero.MercadoLibre.Steps;

import com.ProyectoSemillero.MercadoLibre.PageObjects.PaginaPrincipalPageObject;

import cucumber.api.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class CatergoriaNOAdultosStep {
	PaginaPrincipalPageObject paginaPrincipalPageObject;
	
	 @Step
	 public void validar_No_hay_resultados_en_la_categoria_adultos() throws Exception {
		 paginaPrincipalPageObject.validar_No_hay_resultados_en_la_categoria_adultos();
		 Serenity.takeScreenshot();
	 }
	
}
