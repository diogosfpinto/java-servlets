Projeto para estudos de WebServlet Java.

1. Como executar o projeto em Docker
    
´mvn clean install´

2. Para criar a imagem Docker: 

´./docker-run´

3. Para executar um container:

´docker run --rm --name java-servlet -p 8080:8080 java-servlets:1.0

4. Acessar API's via navegador ou Postman

'http://localhost:8080/java-servlets-1.0/{endpoint}'
