#Author: Daniel Alexander Grajales Prieto
#Proyecto: Proyecto Semillero - Mercado Libre Inicio Sesion
@tag
Feature: Proyecto Semillero Modulo Inicio Sesion

  @Usuario
  Scenario Outline: Usuario Existente
    Given Ingresar a Mercado Libre y Seleccionar Pais <celda> <hoja de calculo>
    When Presionar en Ingresar
    And ingresar usuario <celda> <hoja de calculo>
    Then Validar existencia del usuario

    Examples: 
      | celda | hoja de calculo |
      | "1"   | "3"             |

  @UsuarioContraseña
  Scenario Outline: Contraseña Existente
    Given Ingresar a Mercado Libre y Seleccionar Pais <celda> <hoja de calculo>
    When Presionar en Ingresar
    And ingresar usuario <celda> <hoja de calculo>
    And ingresar contraseña <celda> <hoja de calculo>
    Then Validar inicio sesion

    Examples: 
      | celda | hoja de calculo |
      | "1"   | "4"             |

  @UsuarioNOexistente
  Scenario Outline: Usuario NO Existente
    Given Ingresar a Mercado Libre y Seleccionar Pais <celda> <hoja de calculo>
    When Presionar en Ingresar
    And ingresar usuario <celda> <hoja de calculo>
    Then Validar NO existencia del usuario

    Examples: 
      | celda | hoja de calculo |
      | "1"   | "5"             |

  @UsuarioContraseñaNoexistente
  Scenario Outline: contraseña NO Existente
    Given Ingresar a Mercado Libre y Seleccionar Pais <celda> <hoja de calculo>
    When Presionar en Ingresar
    And ingresar usuario <celda> <hoja de calculo>
    And ingresar contraseña <celda> <hoja de calculo>
    Then Validarcontraseña incorrecta

    Examples: 
      | celda | hoja de calculo |
      | "1"   | "6"             |
      
      
    @prueba 
    Scenario Outline: contraseña NO Existente
    Given Ingresar a Mercado Libre y Seleccionar Pais <celda> <hoja de calculo>
    When Presionar en Ingresar
    And ingresar usuario <celda> <hoja de calculo>
    And ingresar contraseña <celda> <hoja de calculo>
    Then Validarcontraseña incorrecta prueba<prueba>

    Examples: 
      | celda | hoja de calculo |prueba|
      | "1"   | "6"             |25|
      
