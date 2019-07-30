/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author 2014p
 */
public class EventCollection implements Serializable {

    private int currEvent;
    private LinkList eventList;

    public EventCollection() {
        currEvent = 0;
        eventList = new LinkList();
    }

    public EventCollection readFromFile() {
        EventCollection evtCollection = new EventCollection();

        try {
            File f = new File("C:/Users/2014p/Documents/GitHub/FYP_System/Event.dat");
            ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(f));
            evtCollection = (EventCollection) inStream.readObject();
            
            for (int i = 0; i < evtCollection.getNumOfEvents(); i++) {
                Event evt = evtCollection.getEvent(i);
                addEvent(evt);
            }    
            inStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not Found Exception");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return evtCollection;
    }

    public void writeToFile() {
        File f = new File("C:/Users/2014p/Documents/GitHub/FYP_System/Event.dat");

        try {
            ObjectOutputStream outStream = new ObjectOutputStream(
                    new FileOutputStream(f));
            outStream.writeObject(this);
            outStream.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public int getNumOfEvents() {
        return eventList.getNoOfElement();
    }

    public Event getEvent(int num) {
        return (Event) eventList.get(num);
    }

    public void addEvent(Event evt) {
        eventList.addLast(evt);
    }

    public int getNext() {
        try {
            return ++currEvent;
        } catch (Exception e) {
            return getLast();
        }
    }

    public int getPrev() {
        try {
            return --currEvent;
        } catch (Exception e) {
            return getFirst();
        }
    }

    public int getFirst() {
        return 0;
    }

    public int getLast() {
        return eventList.getNoOfElement();
    }
}
