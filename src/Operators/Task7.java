package Operators;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        System.out.print("Введите размер массива: ");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();

        String arr[] = new String[x];

        if (x > 0) {

            System.out.print("Введите значения массива: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = console.nextLine();}

                if (arr[i].equals(a)) {
                    System.out.print("Данное значение имеется в константах");
                } else if (arr[i].equals(b)) {
                    System.out.print("Данное значение имеется в константах");
                } else if (arr[i].equals(c)) {
                    System.out.print("Данное значение имеется в константах");
                } else {
                    System.out.print("Такой константы нет!");
                }

            }
        }
    }

