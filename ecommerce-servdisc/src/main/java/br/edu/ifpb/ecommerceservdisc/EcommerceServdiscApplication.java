package br.edu.ifpb.ecommerceservdisc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcommerceServdiscApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceServdiscApplication.class, args);
	}
}
