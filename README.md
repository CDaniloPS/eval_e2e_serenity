# Project opencartserenity
> Ejercicio de automatizacion E2E con SerenityBDD y Cucumber.

## Table of Contents
* [Technologies Used](#Prerequisitos)
* [Implementation](#Implementacion)
* [Flow](#flujo)
* [Instructions to run the test]
* [Project Status](#project-status)


## Technologies Used
	- Maquina local con el sistema operativo Windows 10
	- Intellij IDEA 2023.1.4 (Community Edition)
	- JDK versión 17 (archivo jdk-17_windows-x64_bin)
	- Gradle 8.2


## Implementation
    - Descargar e Instalar JDK versión 17
	- Descargar y descomprimir Gradle 8.2 y agregar	la ruta al bin a variables de entorno.
	- Descargar e instalar de la pagina https://www.jetbrains.com/ la version  Intellij IDEA 2023.1.4 (Community Edition)
	- Descargar el zip del proyecto eval_e2e_serenity del repositorio de git https://github.com/CDaniloPS/eval_e2e_serenity.git. 
	- Descomprimir el proyecto con el nombre eval_e2e_serenity en el workspace
	- En Intellij ir a File/new/project from existing sources y seleccionar el proyecto eval_e2e_serenity. 
    - En el proyecto seleccionar el menu Build/Rebuilt_Project para que verifique para descargar las dependencias faltantes.

## Flow
Prueba funcional de un flujo de compra en la pagina de opencart.abstracta.us:
- Agregar dos productos al carrito.
- Visualizar el carrito.
- Completar el Checkout como invitado Guest Checkout.
- Finalizar la compra hasta confirmacion: Your order has been placed!

## Instructions to run the test

-Op1. Seleccionar el proyecto eval_e2e_serenity y dar click derecho para seleccionar Open_In/Terminal
- en el terminal escribir /gradlew y dar ENTER para que genere el diagnostico de dependencias y reporte de Serenity junto con la ejecucion del test.

-Op2. Luego de realizar el paso anterior para ejecutar el test se puede ir Dentro del proyecto eval_e2e_serenity ir a src/test/java/com/e2e/runners y seleccione el 
      archivo WebRunnerTest.java, dar click derecho para seleccionar Run WebRunnerTest.


## Project Status
Project is:  _complete_
