package com.skytalys.streams;

import com.github.javafaker.Faker;
import com.skytalys.model.Product;

import java.util.ArrayList;

public class ProductRepository {

    private final ArrayList<Product> products = new ArrayList<Product>();

    public void fillListWithData(){
        Faker faker = new Faker();
        for (int i = 0; i < 100; i++) {
            // Generate fake data
            Product product = new Product();
            product.setId(i);
            product.setName(faker.commerce().productName());
            product.setPrice(faker.number().randomDouble(2, 1, 1000));
            product.setDescription(faker.lorem().sentence());
            product.setQuantity( faker.number().numberBetween(1, 5));
            products.add(product);
        }
    }

    public void printList(){
        products.forEach(System.out::println);
    }

}
