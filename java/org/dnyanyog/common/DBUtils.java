package org.dnyanyog.common;  // Updated package name

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
    private static String url = "jdbc:mysql://localhost:3306/school_management";
    private static String userName = "root";
    private static String password = "12345";

    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet executeSelectQuery(String query) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(query);
    }
}
