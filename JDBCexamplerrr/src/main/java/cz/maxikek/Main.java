package cz.maxikek;

import java.sql.*;

public class Main {
    public static void main(String args[]) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/luxor", "root", "");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM knihy");

        while(resultSet.next()) {
            System.out.println(resultSet.getString("nazev"));
            System.out.println(resultSet.getString("obsah"));
            System.out.println("-----");
        }

        connection.close();
    }
}
