package com.learnfw4j.utils;

import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class JDBCUtilTest {

    @Test
    public void test1() {
        try {
            JDBCUtil.test();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ;
    }
}