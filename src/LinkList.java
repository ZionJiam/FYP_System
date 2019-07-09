
import java.io.Serializable;

public class LinkList implements Serializable{
    private int noOfElement = 0;		// Number of elements in the list
private ListNode headnode = null;	            // Headnode of the LinkList

public LinkList() {} 
public LinkList(Object data) { 
    headnode = new ListNode(data);
}

// Checks whether the LinkList is empty
public boolean isEmpty() { 
return noOfElement == 0;
}

// Checks the number of nodes in the link list
public int getNoOfElement() {
    return noOfElement;
} 

// Finds a specific node in a linked list. 
private ListNode find(int index) { 
    ListNode currentNode = headnode;
    for(int i =0 ; i<index; i++)
        currentNode = currentNode.getNext();
    return currentNode;
}

// Returns the data object at a particular location in the Link List
public Object get(int index)  throws IndexOutOfBoundsException  {
         if(index >=0 && index < noOfElement){
          ListNode currentNode = find(index);
          Object  data = currentNode.getData();
          return data;
      }else{
          throw new IndexOutOfBoundsException(
                  "index out of bounds exception on get");
       }
}

// Adds a data object to the link list at the location specified by index
public void add(int index, Object data) throws IndexOutOfBoundsException {
          if(index >=0 && index <= noOfElement){
          if(index ==0 ){
              //insert new node at beginning of list
                ListNode newNode = new ListNode(data, headnode);
                headnode = newNode;             
          }else{
              //insert between nodes
              ListNode prevNode = find(index-1);
              ListNode newNode = new ListNode(data ,   
                                               prevNode.getNext());
              prevNode.setNext(newNode);
          }
          noOfElement++;
      }else{
          throw new IndexOutOfBoundsException(
                  "index out of bounds exception on add");
      }

}
	 
// Adds a data object at the end of the link list
public void addLast(Object data) throws IndexOutOfBoundsException {
        add(noOfElement, data);
}

// Deletes a particular node in the link list 
public void remove(int index) throws IndexOutOfBoundsException { 
    if(index >= 0 && index < noOfElement) {
      if (index == 0) {
//             delete the first node from the list
            headnode = headnode.getNext(); 
      			
      }else {
//             delete the node
 	     ListNode prevnode = find(index - 1);
            ListNode currnode = prevnode.getNext();
            prevnode.setNext(currnode.getNext());      		
      }
      noOfElement--;	
  } else {
         throw new IndexOutOfBoundsException(
               "index out of bounds exception on remove");
  }
}

// Destroys all the nodes in the link list
public void removeAll() {
     headnode = null;
      noOfElement = 0;

}

}
