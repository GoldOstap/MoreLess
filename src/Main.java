// Больше Меньше

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int num =0;
        int min = 0;
        int max = 0;
        int answer;
        int counter = 0;
        boolean fl = true;
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Введите min: ");
        min = scan.nextInt();
        System.out.print("Введите max: ");
        max = scan.nextInt();
        System.out.println();
        num = rnd.nextInt((max - min) + 1) + min;

         do {
            System.out.print("Введите число: ");
            answer = scan.nextInt();
            if (num < answer)  System.out.println("меньше");
            else
                if (num > answer)  System.out.println("больше");
                else if (num == answer) fl = false;
                counter++;
            } while (fl);

        System.out.println ("Угадал за "+counter+" попыток");

    }
}