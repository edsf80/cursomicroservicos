package br.edu.ifpb.ecommerceapi.rest;

import br.edu.ifpb.ecommerceapi.entity.Product;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartRestService {

    @PostMapping
    public @ResponseBody
    ResponseEntity<Product> addToCart(@RequestBody Product product) {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Product> request = new HttpEntity<>(product);
        ResponseEntity<Product> response = restTemplate
                .exchange("http://localhost:8280/cart/", HttpMethod.POST, request, Product.class);

        return response;
    }

    @GetMapping
    public List<Product> getCart() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Product>> response = restTemplate.exchange(
                "http://localhost:8280/cart/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Product>>() {
                });
        List<Product> products = response.getBody();

        return products;

    }

    @DeleteMapping("/{id}")
    public void removeFromCart(@PathVariable int id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete("http://localhost:8280/cart/"+id);
    }
}
