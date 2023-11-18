docker build -t spring-soap:0.0.1 .
docker run --name spring-soap -p 8080:8080 -d spring-soap:0.0.1
