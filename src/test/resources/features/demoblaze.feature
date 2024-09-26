Feature: Pruebas E2E en Demoblaze

  Scenario: CA01 - Registro de cuenta
    Given que ingresamos a la url demoblaze
    When se nos muestra la pantalla inicial
    Then hacemos clic en Sign UP para crear una cuenta con user: "user123", pass: "pass123"

  Scenario: CA02 - Inicio de sesión
    Given que contamos con una cuenta
    When se nos muestra la pantalla inicial
    Then hacemos clic en Log in para ingresar con user: "user123", pass: "pass123"

  Scenario: CA03 - Verificación del nombre de usuario
    Given que hicimos login
    When se nos muestra la pantalla inicial
    Then nos debe aparecer nuestro nombre de usuario "user123" en la esquina superior derecha

