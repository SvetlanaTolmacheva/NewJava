package Operators;

import java.util.Scanner;

public class Task4 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            {
                System.out.println("Введите число x");
                double   x = scanner.nextDouble();

                System.out.println("Введите число y");
                double  y = scanner.nextDouble();

                System.out.println("Введите число z");
                double  z = scanner.nextDouble();

                double  a=(x+y+z)/3;
                System.out.println("среднее арифметическое равно: " +a);
                double b=a/2;
                System.out.println("Делим на 2: " +b );
                System.out.println("Округлить в меньшую сторону: " +Math.floor(b));
                double c = Math.floor(b);
                if (c > 3) {
                    System.out.println("Программа выполнена корректно" );
                }

            }
        }
    }

