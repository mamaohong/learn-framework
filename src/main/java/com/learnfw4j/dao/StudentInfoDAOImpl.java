package com.learnfw4j.dao;

import com.datasource.DatabaseUtil;
import com.learnfw4j.domain.StudentInfo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class StudentInfoDAOImpl implements StudentInfoDAO {
    public List<StudentInfo> findAll() {
        return null;
    }

    public StudentInfo insertStudentInfo(StudentInfo studentInfo) {
        try {
            Connection connection = DatabaseUtil.getConnection();
            String sql = "";
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<StudentInfo> insertStudentInfos(List<StudentInfo> studentInfos) {
        return null;
    }

    public StudentInfo updateStudentJavaById(String sid, float java) {
        return null;
    }

    public StudentInfo updateStudentMathById(String sid, float math) {
        return null;
    }

    public void deleteStudentInfoById(String sid) {

    }
}
