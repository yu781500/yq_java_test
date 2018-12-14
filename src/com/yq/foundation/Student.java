package com.yq.foundation;

public class Student extends Person {
    String grade;
    String course;
    String teacher;

    public Student() {
    }

    public Student(String grade, String course, String teacher) {
        this.grade = grade;
        this.course = course;
        this.teacher = teacher;
    }

    public Student(String name, int age, char gender, String grade, String course, String teacher) {
        super(name, age, gender);
        this.grade = grade;
        this.course = course;
        this.teacher = teacher;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
