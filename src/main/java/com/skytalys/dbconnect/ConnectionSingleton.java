package com.skytalys.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {

  private static final String connectionString = "jdbc:postgresql://127.0.0.1:5432/eshop";
  private static final String dbUser = "dimitris";
  private static final String dbPassword = "@pass0rd@@@";

  private static Connection  connection;

  public static Connection  getConnection ( ){
     if(connection == null){
         connection  =   createConnection();
     }
      return connection;
  }

   private static Connection createConnection(  ){
         try (Connection conn = DriverManager.getConnection(
               connectionString, dbUser, dbPassword )) {
           if (conn != null) {
               System.out.println("Connected to the database!");
               return conn;
           } else {
               System.out.println("Failed to make connection!");
               return null;
           }
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
   }
 }
