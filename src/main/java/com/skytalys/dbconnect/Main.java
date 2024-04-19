package com.skytalys.dbconnect;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Connection connectionSingleton =
                  ConnectionSingleton.getConnection();

    }
}
