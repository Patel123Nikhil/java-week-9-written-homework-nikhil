package javahomeworkweek_9;
// Write a Java program to reverse an array of integer values.

import java.util.Arrays;

public class Programme3 {

    public static void main(String[] args) {
        int[] my_array1 = {
                1420, 1430, 1440, 1450,
                1460, 1470, 1480, 1490,
                1500, 1510, 1520};
        System.out.println("Original array : " + Arrays.toString(my_array1));
        for (int i = 0; i < my_array1.length / 2; i++) {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : " + Arrays.toString(my_array1));
    }

}
