package Operators;
import java.util.Scanner;
//получается сделать или только для определенного размера массива или сравнить только 1е число
public class Task7 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        String arr[] = new String[a];
        if (a > 0) {
            System.out.print("Введите значения массива: ");
            String x = console.nextLine();
            String y = console.nextLine();
            String z = console.nextLine();

            if( x.equals(1) || x.equals(2) || x.equals(3) ){
                System.out.print("Данное значение имеется в константах");
            }else if( y.equals(1) || y.equals(2) || y.equals(3) ){
                System.out.print("Данное значение имеется в константах");
            }else if(z.equals(1) || z.equals(2) || z.equals(3)){
                System.out.print("Данное значение имеется в константах");
            }else{
                System.out.print("Такой константы нет!");
            }

            }
        }
    }


