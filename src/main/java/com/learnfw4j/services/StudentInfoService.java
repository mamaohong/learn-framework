package com.learnfw4j.services;

import com.learnfw4j.bo.StatisticInfo;
import com.learnfw4j.domain.StudentInfo;
import com.learnfw4j.dto.CommRes;

public interface StudentInfoService {
    CommRes findAll();
    CommRes insertStudentInfo(StudentInfo studentInfo);
    // CommRes insertStudentInfos(List<StudentInfo> studentInfos);
    CommRes updateStudentJavaById(String sid, float java);
    // CommRes updateStudentMathById(String sid, float math);
    void deleteStudentInfoById(String sid);
    StatisticInfo getStatisticInfo();
}
