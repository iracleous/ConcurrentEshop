package com.skytalys.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class ProductSupplier {
    private int id;
    private String name;
    private Product product;
}