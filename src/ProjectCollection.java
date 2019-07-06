/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2014p
 */
public class ProjectCollection {
    private int currProject;
    private LinkList projectList;
    public ProjectCollection(){
        currProject = 0;  
        projectList = new LinkList();
    }
    
    public int getNumOfProjects(){
        return projectList.getNoOfElement();
    }
    
    public Object getProject(int num){
        return projectList.get(num);
    }
    
    public void addProject(Event emp){
        projectList.addLast(emp);
    }
    
    public int getNext(){
        try{
        return ++currProject;
        }catch(Exception e){return getLast();}
    }
    
    public int getPrev(){
        try{
        return --currProject;
        }catch(Exception e){return getFirst();}
    }
    
    public int getFirst(){
        return 0;
    }
    
    public int getLast(){
        return projectList.getNoOfElement();
    }
}
