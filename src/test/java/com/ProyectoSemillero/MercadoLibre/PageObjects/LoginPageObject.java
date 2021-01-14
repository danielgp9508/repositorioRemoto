package com.ProyectoSemillero.MercadoLibre.PageObjects;

import org.apache.poi.poifs.crypt.dsig.KeyInfoKeySelector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.ProyectoSemillero.MercadoLibre.Utilidades.Utilidades;
import com.fasterxml.classmate.util.ResolvedTypeCache.Key;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class LoginPageObject extends PageObject {
	Utilidades utilidades;

	String ingresarUsuario = "//*[@id=\"user_id\"]";
	String botonContinuar = "//button[@type='submit']";
	String validarContraseña = "//div[@class='center-card__header']//*[contains(text(),'Ahora, tu clave')]";
	String ingresarContrasena = "//*[@id=\"password\"]";
	String botonIngresar = "//*[@id=\"action-complete\"]";
	String validarIngreso = "//*[@id=\"nav-header-menu\"]/div";
	String usuarioIncorrecto = "//div[@class='ui-form__message' and contains(text(),'Revisa tu e-mail o usuario.')]";
	String contrasenaIncorrecta = "//div[@class='ui-form__message' and contains(text(),'Revisa tu clave.')]";

//----------------------------------------usuario existente----------------------------------------
	public void ingresar_usuario(String celda, String hojaCalculo) throws Exception {
		String datosExcel = utilidades.llenar_formulario(Integer.parseInt(celda), 1, Integer.parseInt(hojaCalculo));
		utilidades.accionEscribir(ingresarUsuario, datosExcel);
		Thread.sleep(4000);
		utilidades.accionSubmit(botonContinuar);
	}

	public void validar_existencia_del_usuario() throws Exception {
		Assert.assertEquals(true, find(By.xpath(validarContraseña)).isVisible());
	}

//----------------------------------------contraseña existente------------------------------------
	public void ingresar_contraseña(String celda, String hojaCalculo) throws Exception {
		String datosExcel = utilidades.llenar_formulario(Integer.parseInt(celda), 2, Integer.parseInt(hojaCalculo));
		utilidades.accionEscribir(ingresarContrasena, datosExcel);
		Thread.sleep(8000);
		utilidades.accionClick(botonIngresar);
	}

	public void validar_inicio_sesion() throws Exception {
		Assert.assertEquals(true, find(By.xpath(validarIngreso)).isVisible());
	}

//---------------------------------------usuario No Existente--------------------------------------
	public void validar_NO_existencia_del_usuario() throws Exception {
		Assert.assertEquals(true, find(By.xpath(usuarioIncorrecto)).isVisible());
		
	}

	// ----------------------------------- contraseña incorrecta-----------------------------------
	public void validarcontraseña_incorrecta() throws Exception {
		Assert.assertEquals(true, find(By.xpath(contrasenaIncorrecta)).isVisible());
	}

}
