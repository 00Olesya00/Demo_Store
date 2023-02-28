package org.example.Demo;

import org.example.Demo.product.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.Demo.service.OrderService;

import java.util.Scanner;

public class DemoStoreApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.Demo");
//

        //System.out.println(product.getNameProduct() );
//        OrderService orderService = context.getBean(OrderService.class);
//        orderService.createOrderFromProduct(1);

        Cart cart = context.getBean(Cart.class);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Добавьте товар в корзину при помощи команды 'add' указав его id или удалите при помощи команды 'remove' так же указав его id");
            String in = sc.nextLine();
            String[] token = in.split(" ");
            if (token[0].equals("add")) {
                cart.addProductToCartById(Integer.parseInt(token[1].trim()));
                System.out.println(cart);
            }
            if (token[0].equals("remove")) {
                cart.removeProductCartById(Integer.parseInt(token[1].trim()));
                System.out.println(cart);
            }
            if (token[0].equals("exit")) break;
        }
    }
}

