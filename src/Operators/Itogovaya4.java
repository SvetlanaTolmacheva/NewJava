
package Operators;
import java.util.Scanner;

class Itogovaya4 {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String n = scanner.nextLine();
        for(int i = 1; i <= 3; i++){
        if (n.equals("Заархивированный вирус")) {
            System.out.print("Правильно!");
            break;
        } else if (n.equals("Подсказка")){
            System.out.print("это вирус");
        } else {
            System.out.print("Подумай еще!");

        }
    }
}
    }
//}