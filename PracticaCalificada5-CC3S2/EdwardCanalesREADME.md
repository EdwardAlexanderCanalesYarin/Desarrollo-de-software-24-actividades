# Practica calificada 5
## Ejercicio 1: Configuración y uso de docker
### Teoría:
* Describe los principios fundamentales de los contenedores Docker y su arquitectura interna. Explica cómo Docker maneja la seguridad y el aislamiento de contenedores.
RESPUESTA:
Los principios fundamentales de docker son: empaquetado de aplicaciones, Docker facilita empaquetar una aplicacion junto con sus requerimientos para que esta aplicacion pueda ser ejecutado en cualquier otro computador; portabilidad, dado que empaqueta aplicaciones con sus requerimientos es facil su portabilidad en otras maquinas o un servidor en la nube; aislamiento, los contenedores de Docker son ejecutados en espacios aislados. La arquitectura de Docker se compone de Docker Engine (es su motor central), imagenes Docker y contenedores Docker.  

* Compara y contrasta Docker con soluciones de virtualización tradicionales, como VMware y
VirtualBox. Discute las ventajas y desventajas de cada enfoque.
RESPUESTA:
Por un lado, una ventaja de Docker es su eficiencia de recursos (ligero) esto se debe a que los contenedores comparten el kernel del sistema operativo, por su parte, los VMware/VirtualBox ejecutan un sistema operativo completo lo que lo hace pesado. Una desventaja de los VMware/VirtualBox es que es complicada de movilizarla en comparacion con los contenedores Docker.
### Práctico:
![Img1](Image/PC5Img1.png)  
La posicion del Dockerfile es al mismo nivel build.gradle, _FROM openjdk:17_ es la imagen base obtenida de Docker Hub [Docker Hub - imagen openjdk](https://hub.docker.com/_/openjdk), _WORKDIR myapp_ es para establecer el directorio de trabajo del contenedor, _COPY ./src/main/java /myapp_ copia el codigo fuente, _RUN javac org/example/*.java_ compila todos los archivos del codigo fuente, _EXPOSE 8080_ expone el puerto para podernos conectar a este contenedor, _CMD ["java", "org.example.Main"]_ es el comando que tiene que ejecutarse para que nuestra aplicacion corra.  

![Img2](Image/PC5Img2.png)  
``` docker build -t myapp:1 .``` este comando sirve para crear una imagen en base de un archivo Dockerfile. myapp es el nombre que uno mismo asigna, 1 es el tag (tambien uno mismo lo asigna)

## Ejercicio 2: Redes y volúmenes en Docker
### Teoría:

### Práctico:
* Para crear una red personalizada (le asigno el nombre towerGame_network) se ejecuta el siguiente comando ```docker network create towerGame_network```   
![Img3](Image/PC5Img3.png)  
Luego para verificar la existencia de dicha red creada ejecuto el siguiente comando ```docker network ls```
![Img4](Image/PC5Img4.png)  
