package com.learnfw4j.dao;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentInfoDAOImplTest {

    @Test
    public void insertStudentInfo() {
        StudentInfoDAOImpl studentInfoDAO = new StudentInfoDAOImpl();
        studentInfoDAO.insertStudentInfo(null);
    }

    @Test
    public void findAll() {
        StudentInfoDAOImpl studentInfoDAO = new StudentInfoDAOImpl();
        System.out.println(studentInfoDAO.findAll());
    }

    @Test
    public void insertStudentInfo1() {
    }

    @Test
    public void insertStudentInfos() {
    }

    @Test
    public void updateStudentJavaById() {
        StudentInfoDAOImpl studentInfoDAO = new StudentInfoDAOImpl();
        studentInfoDAO.updateStudentJavaById("2014220303023", 60);
    }

    @Test
    public void updateStudentMathById() {
    }

    @Test
    public void deleteStudentInfoById() {
    }
}