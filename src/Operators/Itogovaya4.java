package Operators;
import java.text.BreakIterator;
import java.util.Scanner;

public class Itogovaya4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
            String n = scanner.nextLine();
//            for (int i = 0; i < 3; i++) {
                if (n.equals("Заархивированный вирус")) {
                    System.out.print("Правильно!");
                } else if (n.equals("Подсказка")){
                    System.out.print("это вирус");
                    System.out.print("Подумай еще!");

                } else {
                    System.out.print("Подумай еще!");

                }
            }
        }
    }
//}