import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        // Add some elements to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");

        // Test the add method
        System.out.println("List after adding elements: " + list);

        // Test the get method
        System.out.println("Element at index 2: " + list.get(2));

        // Test the size method
        System.out.println("List size: " + list.size());

        // Test the add method with index
        list.add(1, "pear");
        System.out.println("List after adding element at index 1: " + list);

        // Test the indexOf method
        System.out.println("Index of \"cherry\": " + list.indexOf("cherry"));

        // Test the remove method
        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);
        
        list.remove(0);
        System.out.println("List after removing element at index 0: " + list);
        
        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);
    }
}
