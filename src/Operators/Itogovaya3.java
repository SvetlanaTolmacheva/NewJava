package Operators;
import java.util.Scanner;

public class Itogovaya3 {

    public static void main(String[] args) {
        System.out.print("Введите количество строк: ");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        String arr[] = new String[x];
        if (x > 0) {
            System.out.print("Введите значения строк: ");
            for (int i = 0; i < x; i++) {
                arr[i] = console.nextLine();
//            int count = 0;
//            for (int i = 0; i < x.lenth(); i++) {
//                count++;
//
//               System.out.println("Количество строк: " +x);
//                System.out.println("Строка 1: " +i);
//                System.out.println("Ответ ");

            }
        }
    }
}