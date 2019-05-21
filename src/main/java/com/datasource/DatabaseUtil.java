package com.datasource;

import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;


import java.sql.Connection;
import java.sql.SQLException;


public class DatabaseUtil {
    private static final GenericObjectPool<Connection> pool;

    static {
        PooledConnectionFactory factory = new PooledConnectionFactory();
        GenericObjectPoolConfig<Connection> config = new GenericObjectPoolConfig<Connection>();
        config.setMaxTotal(50);
        config.setMinIdle(0);
        config.setMaxIdle(40);
        pool = new GenericObjectPool<Connection>(factory, config);
    }
    public static Connection getConnection() throws SQLException {
        try {
            return pool.borrowObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void returnConnection(Connection connection) {
        pool.returnObject(connection);
    }

    public static void closeDatabase() {
        pool.close();
    }
}
