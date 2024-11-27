# Autenticación de Usuarios con Spring Boot

Este proyecto es una demostración simple de un sistema de autenticación de usuarios que permite el registro y login utilizando diversas tecnologías populares en el desarrollo de aplicaciones web.

## Funcionalidades

- **Registro de Usuarios**: Los usuarios pueden registrarse proporcionando su nombre, apellido, correo electrónico y contraseña. La contraseña se guarda de forma segura utilizando un codificador de contraseñas (PasswordEncoder).
  
- **Inicio de Sesión**: Los usuarios pueden iniciar sesión con su correo electrónico y contraseña previamente registrados. Si las credenciales son correctas, se les redirige a la página principal.

- **Visualización de Usuarios**: Después de iniciar sesión, el sistema muestra una tabla con todos los usuarios registrados, permitiendo ver sus datos como nombre, apellido y correo electrónico.

- **Seguridad**: La aplicación implementa **Spring Security** para manejar la autenticación de los usuarios y proteger las rutas sensibles, asegurando que solo los usuarios autenticados puedan acceder a las páginas relevantes.

## Tecnologías Utilizadas

- **Spring Boot**: Framework utilizado para desarrollar aplicaciones Java de forma rápida y sencilla.
- **Spring Security**: Proporciona la autenticación y autorización necesarias para proteger las rutas y recursos de la aplicación.
- **Thymeleaf**: Motor de plantillas para renderizar las vistas HTML en el lado del servidor.
- **Hibernate**: Framework ORM para interactuar con la base de datos, facilitando el mapeo objeto-relacional.
- **MySQL**: Base de datos utilizada para almacenar la información de los usuarios.
- **Bootstrap**: Framework CSS para el diseño responsive y la creación de interfaces de usuario atractivas.

## Requisitos

- **Java 8 o superior**
- **Maven** para gestionar las dependencias del proyecto.
- **MySQL** para la base de datos.

## Instrucciones de Instalación

1. Clona el repositorio en tu máquina local:
   ```bash
   git clone <url-del-repositorio>

3. Crea una base de datos MySQL llamada `user_registration_db` (o el nombre que prefieras) y configura los detalles de conexión en el archivo `application.properties`.

4. Ejecuta la aplicación utilizando Maven:

   ```bash
   mvn spring-boot:run

5. Accede a la aplicación en tu navegador en la siguiente dirección:
   
   `http://localhost:8080`

## Información del Proyecto

- **Nombre del Proyecto:** Registro e Inicio de Sesión con Spring Boot y Spring Security
- **Autor:** Anuar Avalos Orozco
- **Materia:** Desarrollo de Aplicaciones Web
- **Carrera:** Ingeniería de Software y Redes
- **Universidad:** Universidad del Valle de México (UVM)

## Descripción del Proyecto

Este proyecto es una demostración simple de un sistema de autenticación que incluye el registro de usuarios y un proceso de inicio de sesión utilizando tecnologías modernas como **Spring Boot**, **Spring Security**, **Thymeleaf**, **MySQL**, y **Bootstrap**. La aplicación permite a los usuarios registrarse, iniciar sesión y acceder a una interfaz básica que muestra los detalles de los usuarios registrados.

## Previsualización
### Vista del Login
![login](https://github.com/user-attachments/assets/fbc43cfb-d39c-4e7b-8368-223ba407219a)

### Vista del Registro
![register](https://github.com/user-attachments/assets/4ec50483-78ad-4144-9a2f-2186bcd7dec4)

### Mensaje registro exitoso
![registro exitoso](https://github.com/user-attachments/assets/03f3c2f3-e60d-4411-af4d-0080ca27f776)

### Vista del inicio
![inicio](https://github.com/user-attachments/assets/4238d435-f6e0-4c62-89b5-d0abeb66bc97)

### Mensaje de cerrado exitoso
![cerrado exitoso](https://github.com/user-attachments/assets/9af58480-9093-41cc-af45-ce72ae876571)



