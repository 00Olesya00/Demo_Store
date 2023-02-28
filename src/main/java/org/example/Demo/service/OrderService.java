package org.example.Demo.service;

import org.example.Demo.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private ProductService productService;
    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public void createOrderFromProduct(int productId){
        System.out.println("Заказ создан : ");
        System.out.println(productService.getTitleById(productId));
    }
}
