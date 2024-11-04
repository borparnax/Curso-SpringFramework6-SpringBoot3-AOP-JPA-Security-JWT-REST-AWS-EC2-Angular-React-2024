# CursoSpring2024-10-springboot-crud 🛒

### 📋 Descripción del Proyecto
Esta práctica de clase se centra en la implementación de un CRUD (Crear, Leer, Actualizar, Eliminar) para gestionar productos en **Spring Boot** usando **Java Persistence API (JPA)**. El proyecto incluye un controlador REST que maneja solicitudes para manipular productos con campos como `SKU`, `nombre`, `precio` y `descripción`, integrando validaciones y mensajes de error personalizados para mejorar la experiencia de usuario.

### 🎯 Aprendizaje y Objetivo
El propósito de esta práctica es aprender a:
  
- Implementar un CRUD completo en una API REST con Spring Boot. 🗄️
- Configurar validaciones básicas y avanzadas para validar datos de entrada, garantizando que cumplan con restricciones lógicas y de negocio. ⚠️
- Manejar errores y mensajes personalizados para guiar al usuario en el ingreso correcto de datos.
- Desarrollar y estructurar un controlador REST con respuestas HTTP apropiadas y un manejo adecuado de errores en Spring Boot. 🔄

### 🔍 Funcionalidades
- **CRUD de Productos**:
  - **Crear** (`POST /api/products`): Añadir productos a la base de datos con validación de campos para datos requeridos y precios mínimos.
  - **Leer** (`GET /api/products` y `GET /api/products/{id}`): Consultar todos los productos o un producto específico usando su `id`.
  - **Actualizar** (`PUT /api/products/{id}`): Modificar la información de un producto existente en la base de datos.
  - **Eliminar** (`DELETE /api/products/{id}`): Borrar productos de la base de datos de manera controlada.

- **Validaciones y Mensajes Personalizados**:
  - Anotaciones como `@IsRequired` y `@IsExistsDb` para asegurar que campos como `sku`, `name` y `description` están completos y correctos.
  - Validación de `precio` con un valor mínimo de 500 para asegurar una entrada válida y útil para la aplicación.
  - Mensajes de error personalizados que guían al usuario al corregir los datos erróneos.

### 🛠️ Tecnologías Utilizadas
- **Java 17**
- **Spring Boot** para construir y gestionar la API
- **Spring Data JPA** para la persistencia de datos
- **MySQL** como base de datos relacional
- **Maven** como herramienta de construcción y gestión de dependencias

### ⚙️ Configuración
En `application.properties` se encuentra la configuración de la conexión a la base de datos y ajustes generales de JPA. Además, el archivo `messages.properties` contiene mensajes personalizados para cada validación específica, facilitando la localización y personalización de los mensajes de error.

### 📂 Estructura del Proyecto
- **controllers** - Contiene `ProductController`, que maneja los endpoints REST y organiza las respuestas HTTP.
- **entities** - Incluye la entidad `Product`, mapeada a la tabla de productos en MySQL y con validaciones de campo.
- **repositories** - La interfaz `ProductRepository` permite realizar operaciones CRUD y verificar la existencia de un SKU.
- **services** - Contiene `ProductService` y `ProductServiceImpl`, que implementan la lógica de negocio y la interacción con la base de datos.
- **validation** - Componentes de validación como `ProductValidation`, que se utiliza para verificar datos en el controlador.
- **resources** - Contiene `application.properties` para configuración general y `messages.properties` para mensajes de error y validación.

### 🔍 Endpoints y Funcionalidad CRUD

- **Crear Producto**:
  - `POST /api/products`: Añade un nuevo producto con validación de cada campo. Si hay errores, devuelve mensajes específicos.
  
- **Listar Productos**:
  - `GET /api/products`: Lista todos los productos de la base de datos.
  - `GET /api/products/{id}`: Obtiene la información de un producto según su `id`.

- **Actualizar Producto**:
  - `PUT /api/products/{id}`: Actualiza la información de un producto específico, verificando que los datos sean válidos.

- **Eliminar Producto**:
  - `DELETE /api/products/{id}`: Elimina un producto especificado por `id`.

### 💬 Validaciones y Mensajes Personalizados
El proyecto utiliza anotaciones de validación personalizadas (`@IsRequired`, `@Min`) y archivos de propiedades para guiar al usuario en el ingreso correcto de datos. Estas validaciones incluyen:

- **Campos requeridos**: `sku`, `name`, y `description`.
- **Precio mínimo**: El precio debe ser 500 o más.
- **Mensajes personalizados**: `messages.properties` contiene mensajes de error específicos para ayudar al usuario a corregir entradas incorrectas.

Estas validaciones y mensajes aseguran que los datos enviados a la base de datos sean coherentes y cumplen con las reglas de negocio, mejorando la calidad y usabilidad de la API.

