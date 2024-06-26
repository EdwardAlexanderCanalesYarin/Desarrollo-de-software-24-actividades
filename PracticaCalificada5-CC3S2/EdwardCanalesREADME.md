# Practica calificada 5
## Ejercicio 1: Configuración y uso de docker
### Teoría:
### Práctico:
![Img1](Image/PC5Img1.png)  
La posicion del Dockerfile es al mismo nivel build.gradle, _FROM openjdk:17_ es la imagen base obtenida de Docker Hub [Docker Hub - imagen openjdk](https://hub.docker.com/_/openjdk), _WORKDIR myapp_ es para establecer el directorio de trabajo del contenedor, _COPY ./src/main/java /myapp_ copia el codigo fuente, _RUN javac org/example/*.java_ compila todos los archivos del codigo fuente, _EXPOSE 8080_ expone el puerto para podernos conectar a este contenedor, _CMD ["java", "org.example.Main"]_ es el comando que tiene que ejecutarse para que nuestra aplicacion corra.  

![Img2](Image/PC5Img2.png)  
``` docker build -t myapp:1 .``` este comando sirve para crear una imagen en base de un archivo Dockerfile. myapp es el nombre que uno mismo asigna, 1 es el tag (tambien uno mismo lo asigna)

