package com.skytalys.streams;

import com.github.javafaker.Faker;
import com.skytalys.model.CustomerCategory;

public class CustomerStreamRepository {

    public CustomerCategory randomCategory(){
        Faker faker = new Faker();
        int random = faker.number().numberBetween(0, CustomerCategory.values().length);
        return CustomerCategory.values()[random];
    }
}
