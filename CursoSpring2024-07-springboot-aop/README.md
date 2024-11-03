# CursoSpring2024-07-springboot-aop 🎯

### 📋 Descripción del Proyecto
Este proyecto es una práctica de clase sobre **Aspect-Oriented Programming (AOP)** en Spring Boot. Utiliza AOP para implementar funcionalidades transversales, como el **registro de llamadas de métodos** y el manejo de excepciones en un servicio de saludos.

### 🎯 Objetivo
El objetivo de esta práctica es comprender el uso de **AOP en Spring Boot** para manejar aspectos transversales de una aplicación. Se exploran anotaciones de AOP como `@Before`, `@After`, `@AfterReturning`, `@AfterThrowing`, y `@Around` para interceptar métodos y registrar información útil.

En esta práctica, aprenderás a:

- Configurar **Pointcuts** para interceptar métodos específicos de un servicio. 🎯
- Implementar `Aspectos` que manejan la ejecución de métodos antes, después, y alrededor del punto de invocación. 🔄
- Utilizar `@Order` para definir el orden de ejecución de los aspectos. 🗂️

### 🔍 Funcionalidades
- **Intercepción de Métodos con AOP**:
  - Aspectos `GreetingAspect` y `GreetingFooAspect` para registrar la ejecución de los métodos del servicio `GreetingService`.
- **Logs Detallados de Ejecución**:
  - Registro de la invocación y el resultado de métodos en diferentes fases (`Before`, `After`, `AfterReturning`, `AfterThrowing`, `Around`).
- **Manejo de Excepciones**:
  - Aspectos que manejan y registran excepciones arrojadas en los métodos de `GreetingService`.

### 🛠️ Tecnologías utilizadas
- **Java 17**
- **Spring Boot** para el desarrollo de la aplicación
- **Spring AOP** para implementar programación orientada a aspectos
- **Maven** como herramienta de construcción

### 📂 Estructura del proyecto
- `controllers` - Contiene el controlador principal (`GreetingController`) que expone los endpoints `/greeting` y `/greeting-error`.
- `services` - Clases de servicio para la lógica de saludos (`GreetingService` y `GreetingServiceImpl`).
- `aop` - Definición de aspectos para interceptar métodos (`GreetingAspect`, `GreetingFooAspect`, `GreetingServicePointcuts`).
