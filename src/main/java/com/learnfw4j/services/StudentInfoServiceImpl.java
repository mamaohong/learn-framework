package com.learnfw4j.services;

import com.learnfw4j.bo.StatisticInfo;
import com.learnfw4j.dao.StudentInfoDAOImpl;
import com.learnfw4j.domain.StudentInfo;
import com.learnfw4j.dao.StudentInfoDAO;
import com.learnfw4j.dto.CommRes;

import java.util.List;

public class StudentInfoServiceImpl implements StudentInfoService {
    private StudentInfoDAO studentInfoDAO;

    public StudentInfoServiceImpl() {
        this.studentInfoDAO = new StudentInfoDAOImpl();
    }

    public CommRes<List<StudentInfo>> findAll() {
        return CommRes.success(studentInfoDAO.findAll());
    }

    public CommRes insertStudentInfo(StudentInfo studentInfo) {
        if (studentInfo.getStudentId() == null || studentInfo.getStudentId().equals("")) {
            return CommRes.error();
        }
        if (studentInfo.getJava() < 0 || studentInfo.getJava() > 100) {
            return CommRes.error();
        }
        return CommRes.success(this.studentInfoDAO.insertStudentInfo(studentInfo));
    }

//    public CommRes insertStudentInfos(List<StudentInfo> studentInfos) {
//        return CommRes.success();
//    }

    public CommRes updateStudentJavaById(String sid, float java) {
        if (sid != null && !sid.equals("") && java >= 0 && java <= 100)
            return CommRes.success(this.studentInfoDAO.updateStudentJavaById(sid, java));
        return CommRes.error();
    }

//    public CommRes updateStudentMathById(String sid, float math) {
//        return CommRes.success();
//    }

    public void deleteStudentInfoById(String sid) {
        this.deleteStudentInfoById(sid);
    }

    @Override
    public StatisticInfo getStatisticInfo() {
        List<StudentInfo> studentInfos = this.studentInfoDAO.findAll();
        StatisticInfo info = new StatisticInfo();
        float sum = 0;
        for (StudentInfo studentInfo : studentInfos) {
            if (studentInfo.getJava() < 60)
                info.setUnderSixty(info.getUnderSixty() + 1);
            else if(studentInfo.getJava() >= 60 && studentInfo.getJava() < 70) {
                info.setSixtyToSeventy(info.getSixtyToSeventy() + 1);
            } else if(studentInfo.getJava() >= 70 && studentInfo.getJava() < 80) {
                info.setSeventyToEighty(info.getSeventyToEighty() + 1);
            } else if(studentInfo.getJava() >= 80 && studentInfo.getJava() < 90) {
                info.setEightToNinety(info.getEightToNinety() + 1);
            } else {
                info.setAboveNinety(info.getAboveNinety() + 1);
            }
            sum += studentInfo.getJava();
        }
        if( studentInfos.size() > 0) {
            info.setAverage(sum / studentInfos.size());
        }
        return info;
    }
}
