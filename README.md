# Curso de Microserviços

Roteiro minicurso Spring Cloud

1. Baixar todos os arquivos do github e demonstrar o monolito.
2. Importar o projeto config server.
3. No product adicionar as dependencias do config client.

```
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-config</artifactId>
</dependency>
```

4. No product criar o bootstrap.properties e adicionar as propriedades:

```
spring.application.name=ecommerce-product 
spring.cloud.config.uri=http://localhost:8180
```

5. Fazer o split do projeto em dois, importar cart que está no git e apagar parte de cart do product.

6. Importar projeto api e executar chamadas através dele.

7. Configurar product para se conectar ao Eureka Server. Adicionar dependencia do eureka client no pom

```
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```

Adicionar no config do proudct: 

```
eureka.client.serviceUrl.defaultZone=http://localhost:8380/eureka/
```

8. Configurar API e cart para eureka.

9. Configurar api para usar Feign e Ribbon.

10. Adicionar dependências no pom:

```
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
</dependency>
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
```

11. Adicionar no Application.java @EnableFeignClients
12. Adicionar nos daos: 

```
@FeignClient(name = "ecommerce-product")
@RibbonClient(name = "ecommerce-product")
```


