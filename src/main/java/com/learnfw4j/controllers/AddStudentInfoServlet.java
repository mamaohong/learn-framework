package com.learnfw4j.controllers;

import com.learnfw4j.dto.CommRes;
import com.learnfw4j.domain.StudentInfo;
import com.learnfw4j.services.StudentInfoService;
import com.learnfw4j.services.StudentInfoServiceImpl;
import com.learnfw4j.utils.ReadInputStreamUtil;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/studentinfo/add")
public class AddStudentInfoServlet extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(AddStudentInfoServlet.class);

    private StudentInfoService service;

    public AddStudentInfoServlet() {
        this.service = new StudentInfoServiceImpl();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            ServletInputStream servletInputStream = request.getInputStream();
            byte[] requestBody = ReadInputStreamUtil.readInputStream(servletInputStream);
            String requestString = new String(requestBody, "UTF-8");
            JSONObject jsonObject = new JSONObject(requestString);
            StudentInfo studentInfo = new StudentInfo();
            studentInfo.setStudentId(jsonObject.getString("studentId"));
//            studentInfo.setChinese(jsonObject.getFloat("chinese"));
//            studentInfo.setClazz(jsonObject.getInt("clazz"));
//            studentInfo.setGrade(jsonObject.getInt("grade"));
            studentInfo.setJava(jsonObject.getFloat("java"));
            studentInfo.setName(jsonObject.getString("name"));
            CommRes res = service.insertStudentInfo(studentInfo);
            response.getWriter().write(new JSONObject(res).toString());
        } catch (IOException e) {
            logger.error("some error occurred!",e);
            // e.printStackTrace();
        }
    }
}
