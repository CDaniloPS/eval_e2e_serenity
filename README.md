# Project opencartserenity
> Ejercicio de automatizacion E2E.

## Table of Contents
* [Technologies Used](#Prerequisitos)
* [Implementation](#Implementacion)
* [Flow](#flujo)
* [Instructions to run the test]
* [Project Status](#project-status)


## Technologies Used
	- Maquina local con el sistema operativo Windows 10
	- Spring Tool Suite 4 para Eclipse (archivo spring-tool-
	  suite-4-4.18.0.RELEASE-e4.27.0-win32.win32.x86_64.self-extracting)
	- JDK versión 17 (archivo jdk-17_windows-x64_bin)


## Implementation
    - Descargar e instalar de la pagina https://spring.io/tools y crear un workspace
	- Descargar el proyecto eval_e2e_serenity del repositorio de git e2e. 
	- Descargar el proyecto con el nombre eval_e2e_serenity en el workspace de Spring tool
	- En Spring tool Suite ir a File/Import y seleccionar dentro de General -> Existing Projects into 
	  Workspace y en siguiente seleccionar el proyecto eval_e2e_serenity y cargar.
    - Al archivo build.gradle dar click derecho y seleccionar Gradle/Refresh Gradle Proyect, para descargar las dependencias faltantes.

## Flow
Prueba funcional de un flujo de compra en la pagina de opencart.abstracta.us:
- Agregar dos productos al carrito.
- Visualizar el carrito.
- Completar el Checkout como invitado Guest Checkout.
- Finalizar la compra hasta confirmacion: Your order has been placed!

## Instructions to run the test

-Op1. Seleccionar el proyecto eval_e2e_serenity y dar click derecho para seleccionar Run As y usar 
      la opcion JUnit Test, en la nueva ventana seleccionar BuyOpenCartGlue.java y pulsar 
	  en OK para ejecutar.
-Op2. Dentro del proyecto eval_e2e_serenity ir a src/test/java/com/e2e/glue y seleccione el 
      archivo BuyOpenCartGlue.java, dar click derecho para seleccionar Run As y usar la opcion 
	  JUnit Test para ejecutar.


## Project Status
Project is:  _complete_
