/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2014p
 */
public class Event {

    private Project[] projects;
    private String eventTitle;

    public Event(Project[] projects, String eventTitle) {
        this.projects = projects;
        this.eventTitle = eventTitle;
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
   
    public void setProjects(Project[] projects){
        this.projects = projects;
    }
}
