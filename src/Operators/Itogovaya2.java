package Operators;
import java.util.Scanner;

public class Itogovaya2 {

    public static void main(String[] args) {

        System.out.println("Простое уравнение ");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String[] arrSplit = str.split("");
//        for (String z : arrSplit)
//            System.out.println(z);
        String a = arrSplit[0];
        String b = arrSplit[1];
        String c = arrSplit[2];
        String z = arrSplit[4];

        if (a.equals("x") && b.equals("-")) {
            int i = Integer.parseInt(c);
            int r = Integer.parseInt(z);
            int x = r + i;
            System.out.println("x = " + x);
        } else if (c.equals("x") && b.equals("-")) {
            int i = Integer.parseInt(a);
            int r = Integer.parseInt(z);
            int x = i - r;
            System.out.println("x = " + x);
        } else if (c.equals("x") && b.equals("+")) {
            int i = Integer.parseInt(a);
            int r = Integer.parseInt(z);
            int x = r - i;
            System.out.println("x = " + x);
        } else if (z.equals("x") && b.equals("-")) {
            int i = Integer.parseInt(a.trim());
            int r = Integer.parseInt(c.trim());
            int x = i - r;
            System.out.println("x = " + x);
        } else if (z.equals("x") && b.equals("+")) {
            int i = Integer.parseInt(a.trim());
            int r = Integer.parseInt(c.trim());
            int x = i + r;
            System.out.println("x = " + x);
        } else if (a.equals("x") && b.equals("+")){
            int i = Integer.parseInt(c.trim());
            int r = Integer.parseInt(z.trim());
            int x = r - i;
            System.out.println("x = " + x);
        }
    }}
