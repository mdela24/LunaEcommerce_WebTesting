
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

    Examples: 
   | email                      | password     | 
   | "emersono.olmos@gmail.com" | "Mdela24rap." | 
