/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2014p
 */
public class Project extends Student {

    protected String title, school, supervisor, Test;

    public Project(String title, String school, String supervisor, 
            String adminNum, String name, String course, char gender) {
        
        super(adminNum, name, course, gender);
        this.title = title;
        this.school = school;
        this.supervisor = supervisor;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }
    public String displayProjectInfo() {
        return "School: " + getSchool() + "\n"
                + "Title: " + getTitle() + "\n"
                + "supervisor : " + getSupervisor();
    }
}
