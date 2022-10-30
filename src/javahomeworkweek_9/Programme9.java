package javahomeworkweek_9;
/*Create a HashMap object called people that will store String keys and Integer
        values: And use for each loop to iterate the value from Map*/

import java.util.HashMap;

public class Programme9 {
    // Import the HashMap class

    public static void main(String[] args) {
        // Create a HashMap object called peoplename
        HashMap<String, Integer> colleagueNmae = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        colleagueNmae.put("Manish", 35);
        colleagueNmae.put("Ajay", 45);
        colleagueNmae.put("Himesh", 27);
        colleagueNmae.put("Disha", 40);
        colleagueNmae.put("Viral", 40);
        colleagueNmae.put("Vaibhavi", 40);
        for (String i : colleagueNmae.keySet()) {
            System.out.println("key : " + " value: " + colleagueNmae.get(i));
        }
    }
}
