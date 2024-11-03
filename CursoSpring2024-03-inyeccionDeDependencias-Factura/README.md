# CursoSpring2024-03-InyeccionDeDependencias-Factura 🧾

### 📋 Descripción del Proyecto
Este proyecto forma parte de una práctica de clase sobre **inyección de dependencias** en Spring Boot para una aplicación de facturación. La aplicación gestiona diferentes **componentes y dependencias** de una factura, incluyendo clientes, productos y el cálculo de importes, usando Spring como framework principal para la configuración de dependencias y el ciclo de vida de los componentes.

### 🎯 Objetivo
El objetivo de esta práctica es aprender a usar la **inyección de dependencias** y la gestión de componentes en Spring Boot. Además, se pretende comprender cómo utilizar anotaciones como `@Autowired`, `@Qualifier`, `@Component`, y `@Bean` para organizar y configurar una aplicación modular.

En esta práctica, aprenderás a:

- Configurar **beans** para componentes de facturación, como productos y clientes, y establecer sus relaciones. 🧩
- Usar la inyección de dependencias en Spring Boot para gestionar las relaciones entre objetos. 🔄
- Configurar propiedades desde un archivo de configuración (`data.properties`) e inyectarlas en el código. ⚙️

### 🔍 Funcionalidades
- **Inyección de Dependencias**:
  - Configuración de listas de productos de oficina y de deporte usando `@Bean` en `AppConfig`.
  - Uso de `@Qualifier` para seleccionar listas específicas de productos en la factura.
- **Facturación de productos**:
  - Calculo del importe total de una factura sumando el precio de cada producto multiplicado por la cantidad.
- **Configuración de clientes**:
  - Inyección de valores de configuración para los datos del cliente (`client.name` y `client.lastname`) en la clase `Client`.
  - Uso de `@RequestScope` para que la configuración de cliente sea específica de cada solicitud HTTP.
- **Endpoint para ver la factura**:
  - Ruta `/invoices/show` para ver los detalles de la factura y su cliente asociado.

### 🛠️ Tecnologías utilizadas
- **Java 17**
- **Spring Boot** para el desarrollo de la aplicación
- **Maven** como herramienta de construcción
- **Jakarta Servlet** para manejar solicitudes HTTP

### ⚙️ Configuración
El proyecto utiliza el archivo `data.properties` para almacenar valores de configuración, como el nombre y apellido del cliente y las descripciones de las facturas, que luego son inyectados en los componentes relevantes.

#### Archivo `data.properties`:
client.name=Nacho
client.lastname=Bootez invoice.description=Factura de Deporte
invoice.description.office=Factura de Oficina


### 📂 Estructura del proyecto
- `controllers` - Contiene el controlador para manejar las solicitudes relacionadas con la facturación (`InvoiceController`).
- `models` - Clases que representan el modelo de la aplicación (`Invoice`, `Client`, `Item`, `Product`).
- `config` - Configuración de `AppConfig` donde se definen los `@Bean` para listas de productos y dependencias específicas.
