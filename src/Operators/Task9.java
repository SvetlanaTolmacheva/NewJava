package Operators;
import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        double arr[] = new double [x];
        if (x > 0) {
            System.out.print("Введите значения массива: ");
            for (int i = 0; i < x; i++) {
                arr[i] = console.nextDouble();
            }
        } else {
            System.out.println("Длина массива должна быть больше 0!");
        }
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        double z;
        z = sum / arr.length;
        System.out.print("Значения строки 1 умноженные на среднее арифметическое : ");
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] * z + " ");
        }
    }
}
// не получается массив перевести в дабл

//  System.out.print("Введите размер массива: ");
//          Scanner console = new Scanner(System.in);
//          int x = console.nextInt();
//          int arr[] = new int[x];
//          if (x > 0) {
//          System.out.print("Введите значения массива: ");
//          for (double i = 0; i < x; i++) {
//        double[i] = console.nextDouble();
//        }
//        } else {
//        System.out.println("Длина массива должна быть больше 0!");
//        }
//        double sum = 0;
//        for (double i : arr) {
//        sum += x;
//        }
//        double z;
//        z = sum / arr.length;
//        System.out.print("Значения строки 1 умноженные на  на среднее арифметическое : ");
//        for (int i = 0; i < x; i++) {
//        System.out.print(arr[i] * z + " ");
//        }
//        }
//        }
