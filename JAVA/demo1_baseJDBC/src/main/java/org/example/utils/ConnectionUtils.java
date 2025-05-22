package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    public static Connection getSQLConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/StudentDB";
        String username = "root";
        String password = "formation";

        Connection connection = DriverManager.getConnection(url,username,password);
        return connection;
    }

}
