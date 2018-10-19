package br.edu.ifpb.ecommerceapi.rest;

import br.edu.ifpb.ecommerceapi.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRestService {

    @GetMapping
    public @ResponseBody List<Product> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<java.util.List<Product>> response = restTemplate.exchange(
                "http://localhost:8080/product/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Product>>(){});
        List<Product> products = response.getBody();

        return products;
    }
}
