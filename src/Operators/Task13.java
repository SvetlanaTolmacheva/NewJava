package Operators;
import java.util.*;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
       System.out.println("Введите строку из слов, разделенных пробелами");
    Scanner console = new Scanner(System.in);
    String x = console.nextLine();
//        Выведите слова, состоящие только из латиницы.
           System.out.println(x.split(" ").length);

}}
