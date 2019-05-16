package dao;

import entities.StudentInfo;

import java.util.List;

public interface StudentInfoDAO {
    List<StudentInfo> findAll();
    StudentInfo insertStudentInfo(StudentInfo studentInfo);
    List<StudentInfo> insertStudentInfos(List<StudentInfo> studentInfos);
    StudentInfo updateStudentJavaById(String sid, float java);
    StudentInfo updateStudentMathById(String sid, float math);
    void deleteStudentInfoById(String sid);
}
