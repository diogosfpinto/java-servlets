Projeto para estudos de WebServlet Java.

1. Como executar o projeto em Docker
    
´mvn clean install´

Para criar a imagem Docker: 

´./docker-run´

Para executar um container:

´docker run --rm --name java-servlet -p 8080:8080 java-servlets:1.0
