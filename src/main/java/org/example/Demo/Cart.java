package org.example.Demo;

import org.example.Demo.product.Product;
import org.example.Demo.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    private List<Product> products;
    private ProductRepository productRepository;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
    }

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public void addProductToCartById(int id){
        products.add(productRepository.findById(id));
    }

    public void removeProductCartById(int id) {
        products.remove(products.stream().filter(p -> p.getId() == id).findFirst().orElseThrow(() -> new RuntimeException("Продукт не найден")));
    }

    @Override
    public String toString() {
        return " Продукты в корзине - " + products ;
    }
}

