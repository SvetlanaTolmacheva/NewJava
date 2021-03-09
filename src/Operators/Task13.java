package Operators;
import java.util.*;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
       System.out.println("Введите строку из слов, разделенных пробелами");
    Scanner console = new Scanner(System.in);
    String x = console.nextLine();
     System.out.println(x.matches("[a-z][A-Z]"));
           System.out.println(x.split(" ").length);

}}
