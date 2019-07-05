/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2014p
 */
public class ListNode {
    private ListNode next = null;
    private Object data = null;
    
    public ListNode(Object obj){
        this(obj, null);
    }
    
    public ListNode(Object obj, ListNode nextNode){
        data = obj;
        next = nextNode;
    }
    
    public Object getData(){
        return data;
    }
    
    public void setData(Object obj){
        this.data = obj;
    }
    
    public ListNode getNext(){
        return next;
    }
    
    public void setNext(ListNode next){
        this.next = next;
    }
    
}
