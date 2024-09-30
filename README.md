# Proyecto de Gestión de Personas, Domicilios, Libros y Autores con Spring Boot

Este proyecto consiste en la creación de un sistema de gestión de personas, domicilios, localidades, libros y autores utilizando **Spring Boot**. Cada entidad del modelo de datos cuenta con su correspondiente controlador REST, servicio y repositorio para manejar las operaciones CRUD (Create, Read, Update, Delete) y las relaciones entre ellas.

## Descripción del Modelo de Datos

### Clases

- **Persona**
  - Atributos: `id`, `nombre`, `apellido`, `dni`
  - Relaciones:
    - Tiene una relación uno a uno con **Domicilio**.
    - Tiene una relación uno a muchos con **Libro**.

- **Domicilio**
  - Atributos: `id`, `calle`, `numero`
  - Relaciones:
    - Tiene una relación uno a uno con **Persona**.
    - Tiene una relación muchos a uno con **Localidad**.

- **Localidad**
  - Atributos: `id`, `denominacion`
  - Relaciones:
    - Tiene una relación uno a muchos con **Domicilio**.

- **Libro**
  - Atributos: `id`, `titulo`, `fecha`, `genero`, `paginas`, `autor`
  - Relaciones:
    - Tiene una relación muchos a uno con **Persona** (el dueño del libro).
    - Tiene una relación muchos a uno con **Autor**.

- **Autor**
  - Atributos: `id`, `nombre`, `apellido`, `biografia`
  - Relaciones:
    - Tiene una relación uno a muchos con **Libro**.

## Estructura del Proyecto

Cada entidad del modelo cuenta con las siguientes capas:

1. **Repositorio**: Interface que extiende `JpaRepository`, la cual maneja la persistencia y permite interactuar con la base de datos. Cada repositorio hereda de una clase base genérica que proporciona operaciones CRUD comunes.

2. **Servicio**: Capa de lógica de negocio que contiene los métodos necesarios para realizar las operaciones de negocio sobre las entidades. Todos los servicios heredan de una clase base genérica que implementa las operaciones CRUD básicas, lo que permite reutilizar código entre diferentes entidades.

3. **Controlador REST**: Exposición de los servicios a través de endpoints RESTful que permiten realizar operaciones CRUD sobre las entidades. Los controladores REST heredan de una clase base que contiene la lógica común para la exposición de estos servicios, como las rutas y métodos básicos.

## Uso de Clases Base

Todas las entidades, servicios, repositorios y controladores utilizan clases base para simplificar la gestión y el manejo del código. 

- **Clases Base de Entidades**: Todas las entidades heredan de una clase base que contiene el campo `id`, el cual está anotado con `@Id` y `@GeneratedValue(strategy = GenerationType.IDENTITY)`. Esto simplifica la gestión del identificador único en cada entidad y permite un código más limpio y reutilizable.

- **Clases Base de Servicio y Repositorio**: Los servicios y repositorios heredan de clases base genéricas que implementan las operaciones CRUD comunes, lo que facilita la reutilización del código y mejora la organización del proyecto.

## Configuración

- **Spring Boot**: Este proyecto utiliza Spring Boot para la gestión de dependencias, estructura del proyecto y creación automática de la base de datos a partir del modelo de entidades.
  
- **Base de Datos**: Se puede configurar una base de datos como **H2** para desarrollo rápido.

- **JPA y Hibernate**: El proyecto utiliza **JPA** para el mapeo objeto-relacional y **Hibernate** como la implementación por defecto. Las relaciones entre las entidades están definidas utilizando anotaciones como `@OneToOne`, `@OneToMany` y `@ManyToOne`.

## Ejecución

1. Descargar el proyecto en formato `.zip`.
2. Extraer los archivos y abrir el proyecto en **IntelliJ IDEA**.
3. Ejecutar el proyecto utilizando la base de datos H2 configurada por defecto.

## Endpoints

Se puede acceder a los endpoints a través de **Postman** o cualquier cliente HTTP. Los endpoints permiten realizar las operaciones CRUD sobre las entidades **Persona**, **Domicilio**, **Localidad**, **Libro** y **Autor**.
