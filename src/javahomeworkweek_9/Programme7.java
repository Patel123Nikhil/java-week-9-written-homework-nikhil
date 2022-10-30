package javahomeworkweek_9;
/*Write a Java program to test an array list is empty or not. Define array list with
        underground tube names*/

import java.util.ArrayList;

public class Programme7 {
    public static void main(String[] args) {
        // Declare array list
        ArrayList <String> list = new ArrayList();
        list.add("Northern line");
        list.add("Bakerloo line");
        list.add("Central line");
        list.add("Victoria line");
        list.add("Jubilee line");
        list.add("Southern line");
        list.add("Piccadilly line");
        list.add("City line");
        list.add("Elizabeth line");
        list.add("Overground line");
        //Array list is empty or not
        System.out.println(list.isEmpty());
    }

}
