/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2014p
 */
public class StudentCollection {
    private int currStudent;
    private LinkList studentList;
    
    public StudentCollection(){
        currStudent = 0;  
        studentList = new LinkList();
    }
    
    public int getNumOfStudents(){
        return studentList.getNoOfElement();
    }
    
    public Object getStudent(int num){
        return studentList.get(num);
    }
    
    public LinkList getStudentList(){
        return studentList;
    }
    
    public void addStudent(Student stud){
        studentList.addLast(stud);
    }
    
    public void removeStudent(int num){
        studentList.remove(num);
    }
    
    public int getNext(){
        try{
        return ++currStudent;
        }catch(Exception e){return getLast();}
    }
    
    public int getPrev(){
        try{
        return --currStudent;
        }catch(Exception e){return getFirst();}
    }
    
    public int getFirst(){
        return 0;
    }
    
    public int getLast(){
        return studentList.getNoOfElement();
    }
}
