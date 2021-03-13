
package Operators;


import java.util.ArrayList;
import java.util.Scanner;

public class Itogovaya3 {
    public static void main(String[] args) {
        System.out.print("Введите количество строк: ");
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        Scanner scan;

        String text;
        String resultWord = null;
        String[] textArray;

        int[] wordsArray;
        int uniqCount = 0;
        int minCount = 100;
        int maxCount = 0;

        System.out.println("Введите текст:");

        scan = new Scanner(System.in);
        text = scan.nextLine();

        textArray = text.split(" ");
        wordsArray = new int[textArray.length];

        for(int i = 0; i < textArray.length; i++) {
            textArray[i] = textArray[i].replaceAll("[“:”,-_\"'`;()]", "");
            uniqCount = uniqueSymbolsCounter(textArray[i]);
            wordsArray[i] = uniqCount;
        }

        for(int i = 0; i < wordsArray.length; i++) {
            if(maxCount < wordsArray[i]) {
                maxCount = wordsArray[i];
            }
        }

        for(int i = 0; i < wordsArray.length; i++) {
            if(maxCount == wordsArray[i]) {
                if(minCount < textArray[i].length()) {
                    resultWord = textArray[i];
                    minCount = textArray[i].length();
                }
            }
        }
        System.out.println("Количество строк: " + x);
        System.out.println("Ответ:\n" + resultWord);
    }
    private static int uniqueSymbolsCounter(String word) {
        ArrayList <Character> lst = new ArrayList<Character>();
        char[] chars = word.toCharArray();

        int count = 0;

        for(char c : chars) {
            if (!lst.contains(c)) {
                lst.add(c);
            }
        }

        count = lst.size();
        return count;
    }
}

//        System.out.print("Введите количество строк: ");
//        Scanner console = new Scanner(System.in);
//        int x = console.nextInt();
//          if (x > 0) {
//