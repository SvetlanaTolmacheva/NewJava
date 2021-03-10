package Operators;
import java.util.Scanner;

public class Itogovaya3 {

    public static void main(String[] args) {
        System.out.print("Введите количество строк: ");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        String arr[] = new String[a];
        if (a > 0) {
            System.out.print("Введите значения строк: ");
            String x = console.nextLine();
            String y = console.nextLine();
            String z = console.nextLine();
            int count = 0;
            for (int i = 0; i < x.length(); i++) {
                count++;
//
//                System.out.println( +x);
            }
        }
    }
}