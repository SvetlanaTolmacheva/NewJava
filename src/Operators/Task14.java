package Operators;
import java.util.*;

public class Task14 {
    public static void main(String[] args) {

        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 31) - 20);
            System.out.println(array[i]);
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            System.out.println("макс" + max);
//        Из максимального и минимального значения выведите наибольшее по модулю.
        }
    }
}


