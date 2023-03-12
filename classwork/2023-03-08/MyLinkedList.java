import java.io.*;
import java.util.*;
import java.lang.*;

public class MyLinkedList{
  private Node head;

  public MyLinkedList(){
    head = null;
  }


  /* Add a new node which data value to the front of the list */
  public void add(String value){
    Node newHead = new Node( value);
    if (head == null) {
      head = newHead;
      return;
    }
    newHead.setNext( head);
    head = newHead;
  }
  

  /* Returns the value in the node at location index. */
  public String get(int index) {
    Node walker = head;
    int counter = 0;
    while (counter < index){
      walker = walker.getNext();
      counter++;
    }
    return walker.getData();
  }
  

  /* Return the list as a string */
  public String toString(){
    // Create a reference to head. It will help loop through the list
    Node walker = head;
    String accum = "";
    while (walker.getNext() != null){
      accum += walker.toString();
      walker = walker.getNext();
    }
    accum += walker.toString();
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
  
  
  /* Returns the node at location index.
     THIS FUNCTION IS MADE TO EASE THE PROCESS OF WRITING add(int index, String value) AND remove(int index)
  */
  public Node getNode(int index) {
    Node walker = head;
    int counter = 0;
    
    while (counter < index){
      walker = walker.getNext();
      counter++;
    }
    return walker;
  }
  

  /*Adds a new node which contains value at index */
  public void add(int index, String value){
    Node newNode = new Node(value);
    newNode.setNext( getNode( index +1));
    if( index == 0){
      head = newNode;
    } else{
      getNode( index -1).setNext( newNode);
    }
  }


  /* Returns the index of the first node in the list that contains value. */
  public int indexOf(String value){
    Node walker = head;
    int counter = 0;
    int listSize = size();
    while (counter < listSize){
      if( walker.getData().equals( value)){ return counter;}
      walker = walker.getNext();
      counter++;
    }    
    return -1;
  }


  /* Remove node at location index */
  public void remove(int index){
    int listSize = size();
    if( index == 0){
      head = head.getNext();
    } else if(index == listSize -1){
      getNode(index -1).setNext( null);
    } else{
      getNode(index -1).setNext( getNode( index +1));
    }
  }
}                    
