import java.util.ArrayList;
import java.util.List;

public class Project{
    
    private Student[] student;
    private String title, school, supervisor;
    
    public Project(){}
    public Project(Student[]student, String title, String school, String supervisor) {        
        this.student = student;
        this.title = title;
        this.school = school;
        this.supervisor = supervisor;
    }
    
    public Student[] getStudent(){
        return student;
    }
    
    public void addStudent(Student input){
        Student [] newArr = new Student [student.length+1];
        System.arraycopy(student, 0, newArr, 0, student.length);
        newArr[newArr.length-1] = input;
        this.student = newArr;
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
