package cz.maxikek;

import java.sql.*;

public class InsertExample {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/luxor", "root", "");

        String newnazev = "skrrrBook";
        String newautor = "Raymond Cism";
        String newobsah = "dzou mama";
        int newcena = 69420;

        PreparedStatement preparedStatement = connection.prepareStatement
                ("INSERT INTO knihy VALUES(NULL, ?, ?, ?, ?);");

        preparedStatement.setString(1, newnazev);
        preparedStatement.setString(2, newautor);
        preparedStatement.setString(3, newobsah);
        preparedStatement.setInt(4, newcena);

        preparedStatement.executeUpdate();

        connection.close();
    }

}
