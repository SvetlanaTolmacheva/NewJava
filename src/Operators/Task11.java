package Operators;

import java.util.*;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner console = new Scanner(System.in);
//        String x = console.nextLine(); не поняла как строковую сравнить с int
        int x = console.nextInt();
        System.out.println("Введите число: ");
        int y = console.nextInt();
        int max = Math.max(x, y);
        System.out.println("Большее число " + max);
        int min = Math.min(x, y);

        double z = min;

        System.out.println("Меньшее число " + z);
    }
}

