package Operators;
import java.util.*;

public class Task12 {

    public static void main(String[] args) {
        System.out.print("Введите I like Java!!!");
        Scanner console = new Scanner(System.in);
        String x = console.nextLine();

        boolean a = x.contains("Java");
        boolean b = x.startsWith("I like");
        boolean c = x.endsWith("!!!");
        String d = "Java";
        if (a) {
            System.out.println("Строка содержит подстроку “Java” ");
        } else {
            System.out.println("Строка не содержит подстроку “Java” ");

        }
        if (b) {
            System.out.println("Строка начинается с подстроки “I like” ");
        } else {
            System.out.println("Строка не начинается с подстроки “I like” ");
        }
        if (c) {
            System.out.println("Строка заканчивается “!!!”");

        } else {
            System.out.println("Строка не заканчивается “!!!” ");
        }
        if (a && b && c) {
            System.out.println(x.toUpperCase());
        } else {
            System.out.println("Одно из условий не верно");
        }
        System.out.println (d.replace('a', 'o'));
    }
}

