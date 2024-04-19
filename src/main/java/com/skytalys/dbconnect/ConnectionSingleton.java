package com.skytalys.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {

  private static final String connectionString = "jdbc:postgresql://127.0.0.1:5432/eshop";
  private static final String dbUser = "dimitris";
  private static final String dbPassword = "@pass0rd@@@";

  private static ConnectionSingleton connection;

  public static ConnectionSingleton getConnectionSingleton( ){
     if(connection == null){
         connection  = new ConnectionSingleton(0);
     }
      return connection;
  }

   private ConnectionSingleton(int id ){
       if (id>10)
           throw new RuntimeException();

       try (Connection conn = DriverManager.getConnection(
               connectionString, dbUser, dbPassword )) {

           if (conn != null) {
               System.out.println("Connected to the database!");
           } else {
               System.out.println("Failed to make connection!");
           }

       } catch (SQLException e) {
           System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
       } catch (Exception e) {
           e.printStackTrace();
       }

   }


    }
