package org.example.Demo.product;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init(){
        products = new ArrayList<>();
        products.add(new Product(1,"Хлеб",20.04));
        products.add(new Product(2,"Молоко",100.55));
        products.add(new Product(3,"Вафли",50.78));
        products.add(new Product(4,"Бананы",72.40));
        products.add(new Product(5,"Лук",18.25));
    }

    public Product findById(int id){
        return products.stream().filter(p -> p.getId()==id).findFirst().orElseThrow(()->new RuntimeException("Продукт не найден"));
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }
}

