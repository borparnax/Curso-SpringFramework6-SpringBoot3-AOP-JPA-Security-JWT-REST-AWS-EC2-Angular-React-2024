# CursoSpring2024-04-springboot-error 🚨

### 📋 Descripción del Proyecto
Este proyecto es parte de una práctica de clase sobre **manejo de errores** en Spring Boot. La aplicación maneja diferentes excepciones, como **excepciones de usuario no encontrado, errores de formato numérico y operaciones no válidas**, mediante el uso de controladores de errores y anotaciones específicas de Spring para mejorar la experiencia de usuario en la gestión de fallos.

### 🎯 Objetivo
El objetivo de esta práctica es aprender a implementar un **sistema de manejo de errores** en una aplicación Spring Boot. También se busca entender cómo se utilizan anotaciones como `@ExceptionHandler`, `@RestControllerAdvice`, y `ResponseEntity` para capturar y responder a excepciones de manera organizada.

En esta práctica, aprenderás a:

- Configurar controladores para capturar excepciones específicas de la aplicación. ⚠️
- Implementar respuestas de error personalizadas usando `@RestControllerAdvice`. 🛠️
- Configurar excepciones de Spring Boot para manejar errores de manera centralizada, mejorando el ciclo de vida de manejo de excepciones. 🔄

### 🔍 Funcionalidades
- **Manejo de Errores**:
  - Captura de excepciones comunes como `ArithmeticException`, `NumberFormatException`, y `NullPointerException`.
  - Respuesta personalizada cuando un usuario no es encontrado con `UserNotFoundException`.
  - Uso de `NoHandlerFoundException` para manejar rutas no válidas de la API.
- **Respuestas de Error Estandarizadas**:
  - Creación de una clase `Error` para estructurar las respuestas de error.
  - Inyección de mensajes y códigos de estado HTTP en las respuestas para facilitar la depuración y mejorar la experiencia de usuario.

### 🛠️ Tecnologías utilizadas
- **Java 17**
- **Spring Boot** para el desarrollo de la aplicación
- **Maven** como herramienta de construcción

### ⚙️ Configuración
El proyecto utiliza el archivo `application.properties` para definir propiedades de configuración, como el manejo de rutas no encontradas (`spring.mvc.throw-exception-if-no-handler-found=true`) y la desactivación de mappings automáticos (`spring.web.resources.add-mappings=false`).

#### Archivo `application.properties`:
```properties
spring.mvc.throw-exception-if-no-handler-found=true
spring.web.resources.add-mappings=false
```

### 📂 Estructura del proyecto
- `controllers` - Contiene el controlador de manejo de excepciones (`HandlerExceptionController`).
- `models` - Clases que representan el modelo de la aplicación (`User`, `Role`, `Error`).
- `config` - Configuración de `AppConfig` donde se definen los `@Bean` para la lista de usuarios preconfigurados.
- `services` - Contiene el servicio `UserService` y su implementación para gestión de usuarios y búsqueda por ID.
- `exceptions` - Excepción personalizada `UserNotFoundException` para manejo de errores específicos en la aplicación.
