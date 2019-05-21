package com.learnfw4j.utils;

import java.sql.*;
import java.util.Properties;

public class JDBCUtil {
    public static void test() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Driver driver = DriverManager.getDriver("com.mysql.jdbc.Driver");
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password","123456");
        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.1.6:12345/testdb?auotReconnect=true&useUnicode=true&characterEncoding=utf8",properties);
        PreparedStatement statement = connection.prepareStatement("select * from test;");
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }
        connection.close();
    }
}
