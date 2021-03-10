package Operators;

import java.util.*;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner console = new Scanner(System.in);
         String x = console.nextLine();
        double a = Double.parseDouble(x);
        System.out.println("Введите число: ");
          int y = console.nextInt();
//        double b =  new Double(y);
        double max = Math.max(a, y);
        System.out.println("Большее число " + max);
        double min = Math.min(a, y);

        double z = min;

//       System.out.println("Меньшее число " + z);
    }
}