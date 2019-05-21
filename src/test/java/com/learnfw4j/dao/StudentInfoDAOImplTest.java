package com.learnfw4j.dao;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentInfoDAOImplTest {

    @Test
    public void insertStudentInfo() {
        StudentInfoDAOImpl studentInfoDAO = new StudentInfoDAOImpl();
        studentInfoDAO.insertStudentInfo(null);
    }
}