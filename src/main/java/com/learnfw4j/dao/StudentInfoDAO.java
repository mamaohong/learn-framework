package com.learnfw4j.dao;

import com.learnfw4j.domain.StudentInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public interface StudentInfoDAO {
    Logger logger = LoggerFactory.getLogger(StudentInfoDAO.class);
    List<StudentInfo> findAll();
    StudentInfo insertStudentInfo(StudentInfo studentInfo);
    List<StudentInfo> insertStudentInfos(List<StudentInfo> studentInfos);
    int updateStudentJavaById(String sid, float java);
    int updateStudentMathById(String sid, float math);
    void deleteStudentInfoById(String sid);
}
