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

    public void readFromFile(String fileName) {
        File f = new File("Person.dat");

        try {
            ObjectInputStream inStream = new ObjectInputStream(
                    new FileInputStream(f));
            Event readEvent = (Event) inStream.readObject();

            while (readEvent != null) {
                addEvent(readEvent);
            }
            
            inStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void writeFromFile() {
        File f = new File("Person.dat");

        try {
            ObjectOutputStream outStream = new ObjectOutputStream(
                    new FileOutputStream(f));
            for (int i = 0; i < currEvent; i++) {
                outStream.writeObject(eventList.get(i));
            }
            outStream.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public int getNumOfEvents() {
        return eventList.getNoOfElement();
    }

    public Object getEvent(int num) {
        return eventList.get(num);
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
