package Operators;

import java.util.*;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner console = new Scanner(System.in);
         String x = console.nextLine();
        System.out.println("Введите число: ");
        double a = Double.parseDouble(x);
        int y = console.nextInt();
        int max = Math.max(a, y);
        System.out.println("Большее число " + max);
        int min = Math.min(a, y);

        double z = min;

//        System.out.println("Меньшее число " + z);
    }
}

