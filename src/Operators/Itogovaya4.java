
package Operators;
import java.util.Scanner;

class Itogovaya4 {
    public static void main (String [] args) {
        String answer;
        boolean exit;
        System.out.println ("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает?");
        Scanner inputAnswer = new Scanner (System.in);

        exit = false;
        for(int i = 1; i <= 3; i++){
            if (exit == true)
                break;
            answer = inputAnswer.next ();
            switch (answer){
                case ("Заархивированный вирус"):
                    System.out.println ("Правильно!");
                    exit = true;
                    break;
                case ("Подсказка"):
                    System.out.println ("Это вирус");
                    exit = true;
                    break;
                default:
                    System.out.println("Подумай еще.");
            }
        }
    }
}