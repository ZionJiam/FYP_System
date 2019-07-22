
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 2014p
 */
public class Event implements Serializable {

    private Project[] projects;
    private String eventTitle;

    public Event(Project[] projects, String eventTitle) {
        this.projects = projects;
        this.eventTitle = eventTitle;
    }

    public void addProject(Project input) {
        Project[] newArr = null;

        if (projects == null) {
            newArr = new Project[1];
            newArr[0] = input;
        } else {
            newArr = new Project[projects.length + 1];
            System.arraycopy(projects, 0, newArr, 0, projects.length);
            newArr[newArr.length - 1] = input;
        }

        this.projects = newArr;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public Project[] getProjects() {
        return projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }
}
