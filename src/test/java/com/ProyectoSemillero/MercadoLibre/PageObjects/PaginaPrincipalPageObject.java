package com.ProyectoSemillero.MercadoLibre.PageObjects;

import org.openqa.selenium.By;

import com.ProyectoSemillero.MercadoLibre.Utilidades.Utilidades;

import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class PaginaPrincipalPageObject extends PageObject {
	Utilidades utilidades;
	String txtPalabra = "/html/body/header/div/form/input";
	String popUpAdultos = "//h2[@class='modal__title' and contains(text(),'Ver resultados para Adultos')]";
	String buscar = "/html/body/header/div/form/button";
	String categorias = "//*[@id=\"id_category\"]";
	String verTodosCategorias = "//*[@id=\"id_category\"]/label";
	String seleccionarAdultos = "//label[@class='adults__label' and contains(text(),'Adultos')]";
	String ingresar = "//*[@id=\"nav-header-menu\"]/a[2]";

//-----------------------------------------------Filtro Adultos Automatico-------------------------------///	
	public void escribir_palabra(String celda, String hojaCalculo) throws Exception {
		String datosExcel = utilidades.llenar_formulario(Integer.parseInt(celda), 1, Integer.parseInt(hojaCalculo));
		utilidades.accionEscribir(txtPalabra, datosExcel);
		utilidades.accionClick(buscar);
	}

	public void validar_Pop_Up_contenido_para_adulto() throws Exception {
		Assert.assertEquals(true, find(By.xpath(popUpAdultos)).isVisible());
	}
//-----------------------------------------------Filtro Adultos Manual---------------------------------///

	public void seleccionar_catergoria_adultos() throws Exception {
		if(find(By.xpath(categorias)).isVisible()) {
			if(find(By.xpath(verTodosCategorias)).isVisible()) {
				utilidades.accionClick(verTodosCategorias);
				if(find(By.xpath(seleccionarAdultos)).isVisible()) {
					utilidades.accionClick(seleccionarAdultos);
				}
			}
		}
	}
	
//----------------------------------------------Busqueda NO adultos----------------------------------------//

	public void validar_No_hay_resultados_en_la_categoria_adultos() throws Exception {
		seleccionar_catergoria_adultos();  
		Assert.assertEquals(false, find(By.xpath(popUpAdultos)).isVisible());
	 }
//----------------------------------------------- Usuario Existente --------------------------------------//
	
	
	public void presionar_en_Ingresar() throws Exception {
	   utilidades.accionClick(ingresar); 
	}

}
