/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2014p
 */
public class Student {

    protected String name, course;
    protected char gender;
    protected String adminNum;

    public Student(String adminNum, String name, String course, char gender) {
        this.adminNum = adminNum;
        this.name = name;
        this.course = course;
        this.gender = gender;

    }

    public void setadminNum(String adminNum) {
        this.adminNum = adminNum;
    }

    public String getadminNum() {
        return adminNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }
public String displayStudentInfo() {
        return "Name: " + getName() + "\n"
                + "Admin No: " + getadminNum() + "\n"
                + "Course: " + getCourse() + "\n"
                + "Gender: " + getGender()+"\n\n";
    }
}
