package Operators;
import java.util.Scanner;
//получается сделать или только для определенного размера массива или сравнить только 1е число
public class Task7 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int arr[] = new int[a];
        if (a > 0) {
            System.out.print("Введите значения массива: ");
            int x = console.nextInt();
            int y = console.nextInt();
            int z = console.nextInt();

            if( x == 1 || x == 2 || x == 3 ){
                System.out.print("Данное значение имеется в константах");
            }else if( y == 1 || y == 2 || y == 3 ){
                System.out.print("Данное значение имеется в константах");
            }else if(z == 1 || z == 2 || z == 3){
                System.out.print("Данное значение имеется в константах");
            }else{
                System.out.print("Такой константы нет!");
            }

            }
        }
    }


