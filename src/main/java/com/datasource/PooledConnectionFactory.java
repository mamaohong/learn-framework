package com.datasource;

import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PooledConnectionFactory implements PooledObjectFactory<Connection> {

    private static final String DATABASE_CONFIG = "database_config.properties";
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static {
        InputStream propStream = PooledConnectionFactory.class.getClassLoader().getResourceAsStream(DATABASE_CONFIG);
        Properties properties = new Properties();
        try {
            properties.load(propStream);
            driver = properties.getProperty("sql.driver");
            url = properties.getProperty("sql.url");
            username = properties.getProperty("sql.username");
            password = properties.getProperty("sql.password");
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public PooledObject<Connection> makeObject() throws Exception {
        System.out.println("create a connection....");
        Connection connection = DriverManager.getConnection(url,username, password);
        return new DefaultPooledObject<Connection>(connection);
    }

    public void destroyObject(PooledObject<Connection> pooledObject) throws Exception {
        System.out.println("delete a connection....");
        if(!pooledObject.getObject().isClosed())
            pooledObject.getObject().close();
    }

    public boolean validateObject(PooledObject<Connection> pooledObject) {
        try {
            return pooledObject.getObject().isValid(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void activateObject(PooledObject<Connection> pooledObject) throws Exception {

    }

    public void passivateObject(PooledObject<Connection> pooledObject) throws Exception {

    }
}
