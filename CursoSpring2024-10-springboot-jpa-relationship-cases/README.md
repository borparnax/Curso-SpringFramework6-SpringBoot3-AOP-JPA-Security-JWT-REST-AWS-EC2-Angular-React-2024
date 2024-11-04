# CursoSpring2024-08-springboot-jpa-relationship 🧩

### 📋 Descripción del Proyecto
Este proyecto es una práctica de clase sobre las relaciones de entidades en **JPA (Java Persistence API)** usando Spring Boot. Se centra en la configuración y manipulación de relaciones complejas entre entidades en una base de datos MySQL. A lo largo de la práctica, se implementan relaciones **OneToMany**, **ManyToOne**, **ManyToMany**, y **OneToOne**, incluyendo su manejo bidireccional y operaciones en cascada.

### 🎯 Objetivo
El objetivo de esta práctica es aprender a implementar relaciones de entidades en un entorno de datos relacional, y cómo gestionarlas eficazmente utilizando Spring Data JPA. En esta práctica, aprenderás a:

- Configurar y mapear entidades JPA para representar relaciones en una base de datos relacional. 🗄️
- Implementar relaciones bidireccionales y entender el comportamiento de las operaciones en cascada. 🔄
- Gestionar consultas personalizadas que permitan obtener entidades relacionadas de manera eficiente. 🔍

### 🔍 Funcionalidades
- **Operaciones CRUD**:
  - Crear, leer, actualizar y eliminar registros de entidades relacionadas, como `Client`, `Address`, `Invoice`, `Course`, y `Student`.
- **Relaciones entre Entidades**:
  - Relaciones `OneToMany`, `ManyToOne`, `ManyToMany`, y `OneToOne` con configuraciones avanzadas de JPA.
- **Consultas Personalizadas**:
  - Consultas avanzadas usando `@Query` para obtener entidades con relaciones específicas y facilitar la manipulación de datos.

### 🛠️ Tecnologías Utilizadas
- **Java 17**
- **Spring Boot** para el desarrollo de la aplicación
- **Spring Data JPA** para el acceso a datos
- **MySQL** como base de datos
- **Maven** como herramienta de construcción

### ⚙️ Configuración
Es importante revisar y ajustar el contenido de `application.properties` para la conexión a MySQL y los parámetros de JPA. El archivo `import.sql` en el directorio `resources` contiene datos iniciales para las tablas `clients`, `students`, y `courses` que permiten probar las relaciones entre entidades.

### 📂 Estructura del Proyecto
- **entities** - Contiene las entidades JPA (`Client`, `Address`, `Invoice`, `Student`, `Course`) mapeadas a las tablas de la base de datos.
- **repositories** - Interfaces de repositorio para cada entidad, permitiendo operaciones CRUD y consultas personalizadas.
- **resources** - Contiene `application.properties` para la configuración de la base de datos y `import.sql` para la carga de datos inicial.

### 🔍 Relaciones Implementadas y Consultas Disponibles

#### Relaciones Entre Entidades
- **One-to-Many / Many-to-One**:
  - `Client` y `Invoice`: Un cliente (`Client`) puede tener múltiples facturas (`Invoice`), mientras que cada `Invoice` pertenece a un único `Client`.
  - `Client` y `Address`: Un `Client` puede tener múltiples direcciones (`Address`), y cada dirección está asociada a un solo `Client`.
- **One-to-One**:
  - `Client` y `ClientDetails`: Cada `Client` tiene detalles adicionales específicos almacenados en `ClientDetails`.
- **Many-to-Many**:
  - `Student` y `Course`: Un estudiante (`Student`) puede estar inscrito en múltiples cursos (`Course`), y cada curso puede tener múltiples estudiantes.

#### Consultas Personalizadas en Repositorios
El repositorio `ClientRepository` incluye consultas personalizadas para cargar entidades `Client` con sus relaciones asociadas:

- **Cargar Clientes con Direcciones**:
  - `findOneWithAddresses(Long id)`: Devuelve un cliente específico junto con sus direcciones.
- **Cargar Clientes con Facturas**:
  - `findOneWithInvoices(Long id)`: Devuelve un cliente específico junto con sus facturas.
- **Cargar Clientes con Todos los Detalles**:
  - `findOne(Long id)`: Devuelve un cliente específico con todas sus relaciones (`Invoice`, `Address`, `ClientDetails`).

