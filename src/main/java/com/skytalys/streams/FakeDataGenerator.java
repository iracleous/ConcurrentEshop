package com.skytalys.streams;

import com.github.javafaker.Faker;
import com.skytalys.model.Product;

import java.util.List;

public class FakeDataGenerator {

    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        productRepository.fillListWithData();
      //  productRepository.printList();
        System.out.println("--------------------------------------");
         productRepository.sortProducts();
      //  productRepository.printList();

        List<Product> products = productRepository
                .getProductsStartsWith("A");
        products.forEach(System.out::println);


        List<String> descriptionList = productRepository.getProductDescriptions();
        System.out.println("--------------------------------------");

        descriptionList.forEach(System.out::println);
    }

}
