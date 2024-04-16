package com.skytalys.parsers;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.skytalys.model.Department;

import java.io.File;
import java.io.IOException;

public class JsonParser {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Department department = new Department(3, "Sales");
        objectMapper.writeValue(new File("data/department.json"), department);
    }
 }
