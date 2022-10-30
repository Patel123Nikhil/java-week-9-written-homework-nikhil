package javahomeworkweek_9;
/*Write a Java program to iterate through all elements in an array list using
        Iterator*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Programme5 {
// Java Program to iterate over List
// Using simple for loop

// Importing all classes of
// java.util package


    public static void main(String[] args) {
        Programme5 obj = new Programme5();
        obj.myProgramme();
    }

    public void myProgramme() {
        // Creating a ArrayList
        List<String> flowerName = new ArrayList<String>();

        // Adding elements to the list
        // Custom inputs
        flowerName.add("Rose");
        flowerName.add("Jasmin");
        flowerName.add("Lily");
        flowerName.add("Tulip");
        flowerName.add("Orchard");

        Iterator itr = flowerName.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        // For loop for iterating over the List
        for (int i = 0; i < flowerName.size(); i++) {
            // Print all elements of List
            //   System.out.println(flowerName.get(i));
        }
    }
}

