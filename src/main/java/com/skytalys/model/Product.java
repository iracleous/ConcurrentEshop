package com.skytalys.model;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String name="";
    private Double price;
    private String description="";
    private int quantity;
  //  @ToString.Exclude
  //  private ProductSupplier productSupplier;
}
