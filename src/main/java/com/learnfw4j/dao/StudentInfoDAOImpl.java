package com.learnfw4j.dao;

import com.datasource.DatabaseUtil;
import com.learnfw4j.domain.StudentInfo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentInfoDAOImpl implements StudentInfoDAO {
    public List<StudentInfo> findAll() {
        List<StudentInfo> studentInfos = new ArrayList<StudentInfo>();
        try {
            Connection connection = DatabaseUtil.getConnection();
            String sql = "select * from student_info";
            assert connection != null;
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                StudentInfo studentInfo = new StudentInfo();
                studentInfo.setStudentId(rs.getString("student_id"));
                studentInfo.setName(rs.getString("name"));
                studentInfo.setGrade(rs.getInt("grade"));
                studentInfo.setClazz(rs.getInt("class"));
                studentInfo.setJava(rs.getFloat("java"));
                studentInfo.setMath(rs.getFloat("math"));
                studentInfo.setChinese(rs.getFloat("chinese"));
                studentInfo.setEnglish(rs.getFloat("chinese"));
                studentInfos.add(studentInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentInfos;
    }

    public StudentInfo insertStudentInfo(StudentInfo studentInfo) {
        Connection connection = null;
        try {
            connection = DatabaseUtil.getConnection();
            String sql = "insert into student_info (student_id, name, grade, class, java, chinese, math, english) values (?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setNString(1, studentInfo.getStudentId());
            preparedStatement.setNString(2, studentInfo.getName());
            preparedStatement.setInt(3, studentInfo.getGrade());
            preparedStatement.setInt(4, studentInfo.getClazz());
            preparedStatement.setFloat(5, studentInfo.getJava());
            preparedStatement.setFloat(6, studentInfo.getChinese());
            preparedStatement.setFloat(7, studentInfo.getMath());
            preparedStatement.setFloat(8, studentInfo.getEnglish());
            int rows = preparedStatement.executeUpdate();
            logger.info("insert option, affected " + rows + "rows.");
        } catch (SQLException e) {
            logger.error("error...", e);
        } finally {
            if(connection != null)
                DatabaseUtil.returnConnection(connection);
        }
        return studentInfo;
    }

    public List<StudentInfo> insertStudentInfos(List<StudentInfo> studentInfos) {
        for(StudentInfo info : studentInfos) {
            insertStudentInfo(info);
        }
        return studentInfos;
    }

    public int updateStudentJavaById(String sid, float java) {
        int rows = 0;
        try {
            Connection connection = DatabaseUtil.getConnection();
            String sql = "update student_info set java=? where student_id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setFloat(1,java);
            preparedStatement.setNString(2, sid);
            rows = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    public int updateStudentMathById(String sid, float math) {
        int rows = 0;
        try {
            Connection connection = DatabaseUtil.getConnection();
            String sql = "update student_info set math=? where student_id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setFloat(1,math);
            preparedStatement.setNString(2, sid);
            rows = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    public void deleteStudentInfoById(String sid) {
        try {
            Connection connection = DatabaseUtil.getConnection();
            String sql = "delete from student_info where student_id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setNString(1,sid);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
