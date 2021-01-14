package com.ProyectoSemillero.MercadoLibre.PageObjects;

import java.io.IOException;

import com.ProyectoSemillero.MercadoLibre.Utilidades.Utilidades;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.mercadolibre.com")
public class PaisPageObject extends PageObject {
	Utilidades utilidades;
	
	String txtPais = "//*[@id='pais']";
	public void seleccionar_Pais(String celda, String hojaCalculo) throws NumberFormatException, IOException {
		String datosExcel = utilidades.llenar_formulario(Integer.parseInt(celda), 0, Integer.parseInt(hojaCalculo));
		txtPais = txtPais.replace("pais", datosExcel);
		utilidades.accionClick(txtPais);
	}

}
