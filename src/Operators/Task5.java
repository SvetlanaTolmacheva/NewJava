package Operators;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите 2 числа: ");
        num1 = reader.nextInt();
        num2 = reader.nextInt();
        System.out.print("Выберете один из символов ‘+’, ‘-’, ‘*’ или ‘/’.: ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Ошибка");
                return;
        }
       System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}