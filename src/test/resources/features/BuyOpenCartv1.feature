Feature: Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en la página opencart

  Background:
   # Given que el usuario ingresa a la pagina http://opencart.abstracta.us/
   
    Scenario: Comprar producto en opencart 
    Given que Guest ingresa a la home page
    When he agrega dos productos al carrito
    And he visualiza carrito
    Then he llena el Checkout como invitado Guest
    And he finaliza la compra
