package Operators;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Введите любое целое положительное число");
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
                i++;
            }
            if (sum > 0) {
                System.out.println("Сумма нечетных чисел от 1 до " + n + " равна " + sum);
            } else {
                System.out.println("Вы ввели отрицательное число");
            }
        }
    }
}





















//        Scanner scanner = new Scanner(System.in);
//        {
//            System.out.println("Введите любое целое положительное число");
//            int n = scanner.nextInt();
//            int i = 1;
//            int number = n;
//            int sum = 0;
//            while (i <= number) {
//                sum += i;
//                i++;
//            }
//            if (n >= 0) {
//                System.out.println("Сумма чисел от 1 до " + number + " равна " + sum);
//                //не получилось сложить нечетные
//            } else {
//                System.out.println("Вы ввели отрицательное число");
//            }
//        }
//    }
//}
