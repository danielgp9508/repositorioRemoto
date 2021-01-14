#Author: Daniel Alexander Grajales Prieto
#Proyecto: Proyecto Semillero - Mercado Libre Categoria Adultos
@tag
Feature: Proyecto Semillero Modulo categoría para Adultos

  @tag1
  Scenario Outline: Filtro automático con paralabra 
    Given Ingresar a Mercado Libre y Seleccionar Pais <celda> <hoja de calculo>
    When Escribir palabra <celda> <hoja de calculo>
    Then Validar Pop-Up contenido para adulto

    Examples: 
      | celda | hoja de calculo  |
      | "1" | "0" |

  @tag2
  Scenario Outline: Catergoria manual para adultos con palabra 
    Given Ingresar a Mercado Libre y Seleccionar Pais <celda> <hoja de calculo>
    When Escribir palabra <celda> <hoja de calculo>
    And Seleccionar catergoria adultos
    Then Validar Pop-Up contenido para adulto

    Examples: 
      | celda | hoja de calculo  |
      | "1" | "1" |
      | "2" | "1" |
            
  @tag3
  Scenario Outline: No hay resultados en la categoria adultos con palabra 
    Given Ingresar a Mercado Libre y Seleccionar Pais <celda> <hoja de calculo>
    When Escribir palabra <celda> <hoja de calculo>
    Then Validar No hay resultados en la categoria adultos

    Examples: 
      | celda | hoja de calculo  |
      | "1" | "2" |
      | "2" | "2" |
      
  