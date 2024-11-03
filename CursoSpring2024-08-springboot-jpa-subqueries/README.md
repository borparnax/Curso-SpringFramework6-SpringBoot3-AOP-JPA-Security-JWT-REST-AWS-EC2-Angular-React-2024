# CursoSpring2024-08-springboot-jpa 📊

### 📋 Descripción del Proyecto
Este proyecto es una práctica de clase sobre **JPA (Java Persistence API)** en Spring Boot. Se centra en la manipulación de una base de datos MySQL con una entidad `Person` que representa personas con campos de nombre, apellido y lenguaje de programación. La aplicación utiliza operaciones de CRUD y consultas personalizadas para acceder y gestionar los datos.

### 🎯 Objetivo
El objetivo de esta práctica es aprender a implementar y utilizar **JPA con Spring Boot** para gestionar datos relacionales de manera persistente. Se abordan temas como el mapeo de entidades, consultas personalizadas y transacciones.

En esta práctica, aprenderás a:

- Configurar y mapear entidades JPA a tablas de bases de datos. 🗄️
- Crear consultas personalizadas usando `@Query` en repositorios de Spring Data JPA. 🔍
- Gestionar transacciones y personalizar operaciones CRUD con JPA. 🔄

### 🔍 Funcionalidades
- **Operaciones CRUD**:
  - Crear, leer, actualizar y eliminar registros de la entidad `Person` en la base de datos MySQL.
- **Consultas Personalizadas**:
  - Consultas avanzadas con `@Query` para obtener información específica, como el nombre más corto, el último registro, rangos de ID, y conteos de valores únicos en la base de datos.
- **Transacciones**:
  - Gestión de transacciones en operaciones de escritura y lectura para garantizar la consistencia de los datos.

### 🛠️ Tecnologías utilizadas
- **Java 17**
- **Spring Boot** para el desarrollo de la aplicación
- **Spring Data JPA** para el acceso a datos
- **MySQL** como base de datos
- **Maven** como herramienta de construcción

### ⚙️ Configuración
Es importante revisar y ajustar el contenido de `application.properties` para la conexión a MySQL y los parámetros de JPA. Asimismo, el archivo `import.sql` en el directorio `resources` contiene datos iniciales para la tabla `persons`.

### 📂 Estructura del proyecto
- **entities** - Contiene las entidades JPA (`Person`) mapeadas a las tablas de la base de datos.
- **repositories** - Interfaces de repositorio (`PersonRepository`) para operaciones CRUD y consultas personalizadas.
- **dto** - Clases de transferencia de datos (DTO) como `PersonDto` para operaciones específicas de consultas.
- **resources** - Contiene `application.properties` para la configuración de la base de datos y `import.sql` para la carga de datos inicial.

### 🔍 Consultas Disponibles
El repositorio `PersonRepository` incluye varias consultas personalizadas para extraer información detallada de la base de datos. A continuación, algunas de las consultas que se pueden realizar:

- **Consulta por rangos**:
  - `findByIdBetweenOrderByNameAsc(Long id1, Long id2)`: Obtiene personas cuyo `id` está entre los valores `id1` e `id2`, ordenadas por nombre en orden ascendente.
  - `findByNameBetweenOrderByNameDescLastnameDesc(String name1, String name2)`: Encuentra personas con nombres entre `name1` y `name2`, ordenadas por nombre en orden descendente y apellido en orden ascendente.

- **Consultas de agregación**:
  - `getResumeAggregationFunction()`: Devuelve un resumen con el ID mínimo, ID máximo, suma de IDs, longitud promedio de nombres y conteo de registros en la tabla `persons`.
  - `getTotalPerson()`: Cuenta el total de registros en la tabla.
  - `findAllProgrammingLanguageDistinctCount()`: Cuenta el número de lenguajes de programación únicos.

- **Consultas con funciones de cadena de caracteres**:
  - `findAllFullNameConcat()`: Devuelve el nombre completo de cada persona (nombre + apellido) en su formato original.
  - `findAllFullNameConcatUpper()`: Devuelve el nombre completo de cada persona en mayúsculas.
  - `findAllFullNameConcatLower()`: Devuelve el nombre completo de cada persona en minúsculas.

- **Consultas por nombre y longitud**:
  - `getPersonNameLength()`: Devuelve el nombre de cada persona junto con la longitud de su nombre.
  - `getShorterName()`: Encuentra el nombre más corto entre todas las personas y su longitud.

- **Consultas por atributos específicos**:
  - `findByProgrammingLanguage(String programmingLanguage)`: Encuentra todas las personas que programan en un lenguaje específico.
  - `findAllNamesDistinct()`: Devuelve una lista de nombres únicos en la base de datos.
  - `findAllPersonDto()`: Devuelve una lista de objetos `PersonDto`, conteniendo solo el nombre y apellido de cada persona.

- **Consulta personalizada de atributos**:
  - `findAllMixPerson()`: Devuelve una lista de objetos que incluyen el lenguaje de programación y los datos de cada persona.
  - `obtenerPersonDataById(Long id)`: Devuelve un registro con todos los atributos (`id`, `name`, `lastname`, `programmingLanguage`) para una persona específica mediante su `id`.
  - `findAllObjectPersonPersonalized()`: Devuelve una lista de objetos `Person` con solo los atributos `name` y `lastname`, utilizando una consulta personalizada.

Estas consultas permiten realizar operaciones avanzadas y detalladas sobre los datos, facilitando el análisis y manipulación de la información almacenada en la base de datos de `persons`.
