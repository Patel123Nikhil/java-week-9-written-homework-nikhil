package javahomeworkweek_9;
/*Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop*/

import java.util.ArrayList;
import java.util.List;

public class Programme4 {

    public static void main(String[] args) {
        // Creae a list and add some colors to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Black");
        list_Strings.add("Purple");
        list_Strings.add("Green");
        list_Strings.add("Brown");
        list_Strings.add("pink");
        // Print the list
        for (String element : list_Strings) {
            System.out.println(element);
        }
    }
}

