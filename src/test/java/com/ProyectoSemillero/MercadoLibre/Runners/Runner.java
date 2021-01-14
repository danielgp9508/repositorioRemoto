package com.ProyectoSemillero.MercadoLibre.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features/" }, glue = {
		"com.ProyectoSemillero.MercadoLibre.Definitions" }, tags = {
				"@tag1, @tag2, @tag3, @Usuario, @UsuarioContraseña, @UsuarioNOexistente, @UsuarioContraseñaNoexistente" })
public class Runner {
// @Usuario, @UsuarioContraseña, @UsuarioNOexistente, @UsuarioContraseñaNoexistente @tag1, @tag2, @tag3, @Usuario, @UsuarioContraseña
}
