package com.skytalys.streams;

import com.skytalys.model.Product;

import java.util.List;
import java.util.Map;

public class FakeDataGenerator {

    public static void main(String[] args) {
        ProductStreamRepository productStreamRepository = new ProductStreamRepository();
        productStreamRepository.fillListWithData();
      //  productRepository.printList();
        System.out.println("--------------------------------------");
         productStreamRepository.sortProducts();
        productStreamRepository.printList();

        List<Product> products = productStreamRepository
                .getProductsStartsWith("A");
        products.forEach(System.out::println);


        List<String> descriptionList = productStreamRepository.getProductDescriptions();
        System.out.println("--------------------------------------");
       descriptionList.forEach(System.out::println);

        System.out.println("--------------------------------------");
        System.out.println("products above 200 euros = "
                + productStreamRepository.countProductsAbovePriceLevel(200));

        System.out.println("--------------------------------------");
        System.out.println("exist products with name Aerodynamic Steel Plate  = "
                + productStreamRepository.existsProductWithName("Aerodynamic Steel Plate"));

        Map<Integer, List<Product>> map = productStreamRepository.createGroupsPerQuantity();

        map.forEach((quantity, group) -> {
            System.out.println("***************************");
            System.out.println("Quantity=" + quantity );
            System.out.println("--------------------");
            group.forEach(System.out::println);
        });

    }

}
