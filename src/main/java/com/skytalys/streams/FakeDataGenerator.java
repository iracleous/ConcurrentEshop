package com.skytalys.streams;

import com.github.javafaker.Faker;

public class FakeDataGenerator {

    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        productRepository.fillListWithData();
        productRepository.printList();

}

}
