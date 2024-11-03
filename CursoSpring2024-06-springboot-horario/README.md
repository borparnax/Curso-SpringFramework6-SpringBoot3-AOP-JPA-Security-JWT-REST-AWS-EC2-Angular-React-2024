# CursoSpring2024-06-springboot-horario 🕒

### 📋 Descripción del Proyecto
Este proyecto es parte de una práctica de clase sobre **interceptores en Spring Boot** para gestionar el acceso de usuarios según el horario de atención. La aplicación utiliza un interceptor para verificar si las solicitudes HTTP a rutas específicas se realizan dentro del horario permitido, configurado a través de propiedades externas.

### 🎯 Objetivo
El objetivo de esta práctica es aprender a implementar y configurar **interceptores en Spring Boot** para controlar el flujo de solicitudes en función de reglas horarias. También se explora cómo utilizar `HandlerInterceptor` y configuraciones de Spring para validar el acceso en función de variables externas.

En esta práctica, aprenderás a:

- Configurar un interceptor para restringir el acceso a ciertas rutas basándose en el horario. ⏰
- Utilizar `@Value` para inyectar configuraciones desde el archivo `application.properties`. ⚙️
- Manejar respuestas personalizadas con mensajes JSON para accesos fuera de horario. 🚫

### 🔍 Funcionalidades
- **Restricción de Acceso por Horario**:
  - El interceptor `CalendarInterceptor` verifica que las solicitudes se realicen entre las `config.calendar.open` y `config.calendar.close` horas.
  - Respuestas personalizadas en JSON fuera del horario de atención.
- **Mensajes Personalizados**:
  - Mensajes de bienvenida en solicitudes válidas dentro del horario.
- **Inyección de Configuración Externa**:
  - Propiedades `config.calendar.open` y `config.calendar.close` desde `application.properties`.

### 🛠️ Tecnologías utilizadas
- **Java 17**
- **Spring Boot** para el desarrollo de la aplicación
- **Maven** como herramienta de construcción
- **Actuator** para monitoreo

### ⚙️ Configuración
El proyecto utiliza el archivo `application.properties` para definir las horas de apertura (`config.calendar.open`) y cierre (`config.calendar.close`).

#### Archivo `application.properties`:
```properties
config.calendar.open=11
config.calendar.close=18
```

### 📂 Estructura del proyecto
- `controllers` - Contiene el controlador principal (`AppController`) que expone las rutas de prueba.
- `interceptors` - Clases que representan los interceptores de la aplicación (`CalendarInterceptor`).
- `config` - Configuración de `MvcConfig` para definir el interceptor y sus rutas.
