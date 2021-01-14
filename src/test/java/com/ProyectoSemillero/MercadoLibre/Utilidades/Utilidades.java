package com.ProyectoSemillero.MercadoLibre.Utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import com.openhtmltopdf.css.newmatch.Selector;

import net.serenitybdd.core.pages.PageObject;

public class Utilidades extends PageObject {
	Selector selector = new Selector();
	
	public void accionClick(String xpath) {
		find(By.xpath(xpath)).click();
	}
	
	public void accionEscribir(String xpath, String palabra) {
		find(By.xpath(xpath)).sendKeys(palabra);
	}
	
	public String accionObtenerTexto(String xpath) {
		return find(By.xpath(xpath)).getText();
	}
	
	public void accionSubmit(String xpath) {
		find(By.xpath(xpath)).submit();
	}
	
	public String llenar_formulario(int row, int cell, int hojaCalculo) throws IOException {
		// Write code here that turns the phrase above into concrete actions
		File src = new File("src/test/resources/files/ExcelCucumber.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook srcBook = new XSSFWorkbook(fis);
		XSSFSheet sourceSheet = srcBook.getSheetAt(hojaCalculo);

		XSSFRow sourceRow = sourceSheet.getRow(row);
		XSSFCell celda = sourceRow.getCell(cell);
		String userExcel = celda.getStringCellValue();
		System.out.println("Valor: " + userExcel);
		return userExcel;

	}
	
}
