
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: creamos una cuenta
    Given agregamos la informacion personal <nombre> <segNombre> 
    When agregamos la informacion de contacto <email> <password> <confPass>
    Then creamos la cuenta

    Examples: 
      | nombre    | segNombre | email                      | password     | confPass     |
      | "Emerson" | "Carlos"  | "emersono.olmos@gmail.com" | "Mdela24rap." | "Mdela24rap." |


 @tag2
  Scenario Outline: nos logueamos a la pagina
    Given ingresamos el usuario <email> y el password <password> y nos logeamos
    When ingresamos a la cuenta creada
    And Cambiar la contraseña <password>, ingresar la nueva contraseña <newPass> y confirmarla <conPass>

    Examples: 
   | email                      | password      | newPass      | conPass      |
   | "emersono.olmos@gmail.com" | "Mdela24rap." | "Mdela24ra." | "Mdela24ra." |

  @tag3
  Scenario Outline: nos logueamoscon la nueva contraseña a la pagina
    Given ingresamos el usuario <email> y el password <newPass> 

    Examples: 
   | email                      |  newPass      | 
   | "emersono.olmos@gmail.com" |  "Mdela24ra." | 
   
    @tag4
  Scenario Outline: Agregamos productos de la primera pagina al carro de compras
    Given escogemos los productos <productos> y los ingresamos al carro de compra
    And ingresamos datos para procesar el pago <provincia>, <codigoPostal>
   

    Examples: 
   | productos             | provincia    | codigoPostal |
   | "women  pink t-shirt" | "La Florida" | "8240000"    |