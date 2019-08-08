package com.github.abstractkim.practice.inflearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/springdata";
        String userName = "bskim";
        String password = "pass";

        try(Connection connection = DriverManager.getConnection(url, userName, password)){
            System.out.println("Connection Info:" + connection);
//            String sql = "CREATE TABLE ACCOUNT (id int, username varchar(255), password varchar(255))";
            String sql = "INSERT INTO ACCOUNT  VALUES (1, 'bskim', 'pass')";
            try(PreparedStatement statement = connection.prepareStatement(sql)){
                statement.execute();
            }
        }
    }
}
