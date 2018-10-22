package br.edu.ifpb.ecommerceproduct.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/message")
public class MessageRestController {
	
	@Value("${message:Hello default}")
	private String message;
	
	@GetMapping
	public String getMessage() {
		return this.message;
	}

}
