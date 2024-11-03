# CursoSpring2024-09-springboot-jpa-ciclo-vida-embedded 📊

### 📋 Descripción del Proyecto
Este proyecto es una práctica de clase sobre **JPA (Java Persistence API)** y su integración con **Spring Boot**, donde se implementan consultas personalizadas y se utiliza un ciclo de vida de entidades. La aplicación maneja una base de datos **MySQL** y una entidad **`Person`** que incluye características de auditoría para registrar fechas de creación y actualización. Se exploran las operaciones CRUD, consultas avanzadas y el uso de DTOs para transferencia de datos.

### 🎯 Objetivo
El objetivo es profundizar en **JPA con Spring Boot** y aprender cómo implementar un **ciclo de vida de entidades**, así como auditoría de datos. También se explora la creación de **consultas personalizadas** para una gestión avanzada de datos.

En esta práctica, aprenderás a:

- Configurar y mapear **entidades JPA** a tablas de bases de datos con campos de auditoría. 🗄️
- Implementar el **ciclo de vida de entidades** para auditoría de creación y actualización.
- Crear **consultas personalizadas** usando `@Query` en repositorios de **Spring Data JPA**. 🔍
- Gestionar transacciones y personalizar operaciones **CRUD** en **Spring Boot**. 🔄

### 🔍 Funcionalidades
- **Operaciones CRUD**:
  - Crear, leer, actualizar y eliminar registros de la entidad **`Person`**.
- **Ciclo de Vida de Entidades y Auditoría**:
  - Implementación de campos **`createdAt`** y **`updatedAt`** para registrar la fecha de creación y modificación de cada registro.
- **Consultas Personalizadas**:
  - Consultas avanzadas con `@Query` para extraer información específica, como nombre más corto, último registro, rangos de **ID** y conteos de valores únicos en la base de datos.
- **Transacciones**:
  - Gestión de transacciones en operaciones de escritura y lectura para garantizar la **consistencia** de los datos.

### 🛠️ Tecnologías utilizadas
- **Java 17**
- **Spring Boot** para el desarrollo de la aplicación
- **Spring Data JPA** para el acceso a datos
- **MySQL** como base de datos
- **Maven** como herramienta de construcción

### ⚙️ Configuración
Es importante ajustar **`application.properties`** para la conexión a **MySQL** y la configuración de **JPA**. Además, el archivo **`import.sql`** en el directorio **`resources`** contiene datos iniciales para la tabla `persons`.

### 📂 Estructura del proyecto
- **entities** - Contiene las entidades **JPA** (`Person` y `Audit`) mapeadas a las tablas de la base de datos.
- **repositories** - Interfaces de repositorio (`PersonRepository`) para operaciones CRUD y consultas personalizadas.
- **dto** - Clases de transferencia de datos (DTO) como **`PersonDto`** para consultas específicas.
- **resources** - Contiene **`application.properties`** para la configuración de la base de datos y **`import.sql`** para la carga de datos inicial.

### 🔍 Consultas Disponibles
El repositorio **`PersonRepository`** incluye varias consultas personalizadas para extraer información detallada de la base de datos de **`persons`**. A continuación, algunas de las consultas disponibles:

- **Consultas de Agregación**:
  - **`getResumeAggregationFunction()`**: Devuelve un resumen con el ID mínimo, ID máximo, suma de IDs, longitud promedio de nombres y conteo de registros.
  - **`getTotalPerson()`**: Cuenta el total de registros en la tabla.
  - **`findAllProgrammingLanguageDistinctCount()`**: Cuenta el número de lenguajes de programación únicos.

- **Consultas de Ciclo de Vida y Auditoría**:
  - **`findByIdBetweenOrderByNameAsc(Long id1, Long id2)`**: Encuentra registros dentro de un rango de **IDs**, ordenados por nombre.
  - **`findAllObjectPersonPersonalized()`**: Devuelve una lista personalizada de personas con solo nombre y apellido.

- **Consultas de Atributos Personalizados**:
  - **`findAllFullNameConcat()`**: Devuelve el nombre completo concatenado de cada persona.
  - **`findAllFullNameConcatUpper()`**: Devuelve el nombre completo en **mayúsculas**.
  - **`findAllFullNameConcatLower()`**: Devuelve el nombre completo en **minúsculas**.
  - **`findAllNamesDistinct()`**: Devuelve una lista de **nombres únicos** en la base de datos.

- **Consultas Específicas de Programación**:
  - **`findByProgrammingLanguage(String programmingLanguage)`**: Encuentra todas las personas que programan en un **lenguaje específico**.
  - **`findAllProgrammingLanguageDistinct()`**: Devuelve una lista de lenguajes de programación únicos en la base de datos.

Estas consultas permiten realizar análisis detallados sobre los datos y una gestión avanzada de la información de **`persons`**.

---
