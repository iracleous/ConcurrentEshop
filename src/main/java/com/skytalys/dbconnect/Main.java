package com.skytalys.dbconnect;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("start");
        Connection connection =
                  ConnectionSingleton.getConnection();

        String dropTableCommand = "DROP TABLE IF EXISTS products";
        String createTableCommand = "CREATE TABLE IF NOT EXISTS products (id serial primary key, name varchar(50));";
        String insertCommand ="INSERT INTO products (name) VALUES ( ?);";

       System.out.println(ConnectionSingleton.executeQuery(connection, dropTableCommand) );
       System.out.println(ConnectionSingleton.executeQuery(connection, createTableCommand) );

        PreparedStatement preparedStatement = connection.prepareStatement(insertCommand);
        preparedStatement.setString(1, "chips");
         int rowsInserted = preparedStatement.executeUpdate();
        System.out.println(rowsInserted + " row(s) inserted.");
//read
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM products");

        while (resultSet.next())
        {
            String columnValue = resultSet.getString("name");
            System.out.println("Column Value: " + columnValue);
        }


    }
}
