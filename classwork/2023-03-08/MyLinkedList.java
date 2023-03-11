import java.io.*;
import java.util.*;


public class MyLinkedList{

  private Node head;

  public MyLinkedList(){
    head = null;
  }


  /* Add a new node which data value to the front of the list */
  public void add(String value){
    Node newHead = new Node(data);
    if (head == null) {
      head = newHead;
      return;
    }
    newHead.setNext( head);
    head = newHead;
  }

  /* Returns the value in the node at location index. */
  public String get(int index){
    Node walker = head;
    int counter = 0;
    
    while (counter < index && walker.getNext() != null){
      walker = walker.getNext();
      counter++;
    }
    return walker.getData();
  }

  /* Return the list as a string */
  public String toString(){
    // Create a reference to head. It will help loop through the list
    Node walker = head;
    String accum;
    while (walker.getNext() != null){
      accum += walker.toString()
      walker = walker.getNext();
    }
    accum += walker.toString()
    return accum;
  }

  /* Returns the number of elements in the list */
  public int size(){
    Node walker = head;
    int counter = 1;
    while (walker.getNext() != null){
      walker = walker.getNext();
      counter++;
    }
    return counter;
  }


  /*Adds a new node which contains value at index */
  public void add(int index, String value){

  }


  /* Returns the index of the first node in the list that contains value. */
  public int indexOf(String value){
    return 0;
  }


  /* Remove node al location index */

  public void remove(int index){
  }
}
