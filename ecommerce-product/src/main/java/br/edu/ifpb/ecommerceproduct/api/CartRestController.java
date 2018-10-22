package br.edu.ifpb.ecommerceproduct.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.ecommerceproduct.entity.Product;

@RestController
@RequestMapping(value = "/cart")
public class CartRestController {

	private static List<Product> cart;

    static {
        cart = new ArrayList<>();
    }

    @PostMapping
    public void addToCart(@RequestBody Product product) {
        cart.add(product);
    }

    @GetMapping
    public List<Product> getCart() {
        return cart;
    }

    @DeleteMapping("/{id}")
    public void removeFromCart(@PathVariable int id) {
        Product product = new Product(id, null, 0d);
        cart.remove(product);
    }
}
