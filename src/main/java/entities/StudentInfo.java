package entities;

public class StudentInfo {
    private String studentId;
    private String name;
    private int grade;
    private int clazz;
    private float java;
    private float chinese;
    private float math;
    private float english;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClazz() {
        return clazz;
    }

    public void setClazz(int clazz) {
        this.clazz = clazz;
    }

    public float getJava() {
        return java;
    }

    public void setJava(float java) {
        this.java = java;
    }

    public float getChinese() {
        return chinese;
    }

    public void setChinese(float chinese) {
        this.chinese = chinese;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }
}
