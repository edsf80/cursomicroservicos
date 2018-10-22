package br.edu.ifpb.ecommerceproduct.api;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.ecommerceproduct.entity.Product;

@RestController
@RequestMapping(value = "/product")
public class ProductRestController {
	
	private static List<Product> products;
	
	static {
		products = new ArrayList<>();
		products.add(new Product(1, "Produto 1", 45d));
		products.add(new Product(2, "Produto 2", 74d));
		products.add(new Product(3, "Produto 3", 95d));
	}
	
	@GetMapping
	public List<Product> getAll() {
		return this.products;
	}

}
