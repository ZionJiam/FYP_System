import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Project implements Serializable{
    
    private StudentCollection student;
    private String title, school, supervisor;
    
    public Project(StudentCollection student, String title, String school, String supervisor) {        
        this.student = student;
        this.title = title;
        this.school = school;
        this.supervisor = supervisor;
    }
    
    public StudentCollection getStudentList(){
        return student;
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
