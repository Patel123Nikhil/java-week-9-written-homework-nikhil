package javahomeworkweek_9;
/*Write a Java program to retrieve an element (at a specified index) from a given
        array list*/

import java.util.ArrayList;
import java.util.List;

public class Programme6 {

        public static void main(String[] args) {
         Programme6 obj = new Programme6();
         obj.myProgramme();
        }
          public void myProgramme(){
            // Creae a list and add some bodypart to the list
            List<String> bodyPart = new ArrayList<String>();
            bodyPart.add("Eye");
            bodyPart.add("Nose");
            bodyPart.add("Ear");
            bodyPart.add("Hand");
            bodyPart.add("Leg");
            // Print the list
            System.out.println(bodyPart);
            // Retrive the first and third element
            String element = bodyPart.get(0);
            System.out.println("First element: "+element);
            element = bodyPart.get(2);
            System.out.println("Third element: "+element);
        }

    }

