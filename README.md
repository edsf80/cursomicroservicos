# Curso de Microserviços

Roteiro minicurso Spring Cloud

1. Baixar todos os arquivos do github e demonstrar o monolito.
2. Importar o projeto config server.
3. No product adicionar as dependencias do config client.

```
&lt;dependency&gt;
	&lt;groupId&gt;org.springframework.cloud&lt;/groupId&gt;
	&lt;artifactId&gt;spring-cloud-starter-config&lt;/artifactId&gt;
&lt;/dependency&gt;
```

4. No product criar o bootstrap.properties e adicionar a propriedade spring.application.name=ecommerce-product spring.cloud.config.uri=http://localhost:8180

5. Fazer o split do projeto em dois, importar cart que está no git e apagar parte de cart do product.

6. Importar projeto api e executar chamadas através dele.

7. Configurar product para se conectar ao Eureka Server. Adicionar dependencia do eureka client no pom

&lt;dependency&gt;
	&lt;groupId&gt;org.springframework.cloud&lt;/groupId&gt;
	&lt;artifactId&gt;spring-cloud-starter-netflix-eureka-client&lt;/artifactId&gt;
&lt;/dependency&gt;	

Adicionar no config do proudct: eureka.client.serviceUrl.defaultZone=http://localhost:8380/eureka/

8. Configurar API e cart para eureka.

9. Configurar api para usar Feign e Ribbon.

10. Adicionar dependências no pom:

&lt;dependency&gt;
	&lt;groupId&gt;org.springframework.cloud&lt;/groupId&gt;
	&lt;artifactId&gt;spring-cloud-starter-netflix-ribbon&lt;/artifactId&gt;
&lt;/dependency&gt;
&lt;dependency&gt;
	&lt;groupId&gt;org.springframework.cloud&lt;/groupId&gt;
	&lt;artifactId&gt;spring-cloud-starter-openfeign&lt;/artifactId&gt;
&lt;/dependency&gt;

11. Adicionar no Application.java @EnableFeignClients
12. Adicionar nos daos @FeignClient(name = "ecommerce-product")
@RibbonClient(name = "ecommerce-product")


