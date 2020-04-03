package Fundamentals;

import java.util.Random;
import java.util.Scanner;

public class MainTask3 {
    public static void main(String[] args) {
//        3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers are needed?");
        int[] arr = new int[scanner.nextInt()];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20 + 1);
        }

        for (int a : arr) {
            System.out.println(a);
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
