# CursoSpring2024-05-springboot-interceptor 🚦

### 📋 Descripción del Proyecto
Este proyecto forma parte de una práctica de clase sobre **interceptores en Spring Boot**. La aplicación utiliza un interceptor para medir el **tiempo de carga** de cada solicitud HTTP en rutas específicas y permite controlar el flujo de peticiones mediante la configuración de rutas incluidas y excluidas.

### 🎯 Objetivo
El objetivo de esta práctica es aprender a implementar y configurar **interceptores** en una aplicación Spring Boot, comprendiendo cómo utilizar `HandlerInterceptor` y otras configuraciones avanzadas de `WebMvcConfigurer` para manejar solicitudes y manipular respuestas.

En esta práctica, aprenderás a:

- Configurar un interceptor para medir el tiempo de carga de solicitudes HTTP. ⏱️
- Utilizar `@Configuration` y `@Component` para gestionar el ciclo de vida de los interceptores. 🔄
- Configurar rutas específicas para la activación del interceptor usando `addPathPatterns` y `excludePathPatterns`. 🛣️

### 🔍 Funcionalidades
- **Interceptor de Tiempo de Carga**:
  - Configuración del interceptor `LoadingTimeInterceptor` para medir el tiempo de ejecución de las rutas `/app/foo` y `/app/bar`.
  - Log de la duración de cada solicitud, registrado en milisegundos.
- **Exclusión de Rutas**:
  - Posibilidad de excluir rutas específicas mediante `excludePathPatterns`.
- **Manipulación de Respuestas**:
  - Ejemplo comentado de cómo configurar una respuesta en formato JSON si se desea denegar el acceso a ciertas rutas.

### 🛠️ Tecnologías utilizadas
- **Java 17**
- **Spring Boot** para el desarrollo de la aplicación
- **Maven** como herramienta de construcción
- **Actuator** para monitoreo y administración

### ⚙️ Configuración
El proyecto incluye un archivo `application.properties` para almacenar configuraciones adicionales según se requiera.

### 📂 Estructura del proyecto
- `controllers` - Contiene el controlador de endpoints (`FooController`) que expone rutas de ejemplo (`/foo`, `/bar`, `/baz`).
- `interceptors` - Clases que representan los interceptores de la aplicación (`LoadingTimeInterceptor`).
- `config` - Configuración de `MvcConfig` donde se definen los interceptores y sus rutas.
