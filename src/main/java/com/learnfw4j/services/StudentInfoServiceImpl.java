package com.learnfw4j.services;

import com.learnfw4j.dao.StudentInfoDAOImpl;
import com.learnfw4j.domain.StudentInfo;
import com.learnfw4j.dao.StudentInfoDAO;
import com.learnfw4j.dto.CommRes;

import java.util.List;

public class StudentInfoServiceImpl implements StudentInfoService{
    private StudentInfoDAO studentInfoDAO;

    public StudentInfoServiceImpl() {
        this.studentInfoDAO = new StudentInfoDAOImpl();
    }

    public CommRes<List<StudentInfo>> findAll() {
        return CommRes.success();
    }

    public CommRes insertStudentInfo(StudentInfo studentInfo) {
        return CommRes.success();
    }

    public CommRes insertStudentInfos(List<StudentInfo> studentInfos) {
        return CommRes.success();
    }

    public CommRes updateStudentJavaById(String sid, float java) {
        return CommRes.success();
    }

    public CommRes updateStudentMathById(String sid, float math) {
        return CommRes.success();
    }

    public void deleteStudentInfoById(String sid) {

    }
}
