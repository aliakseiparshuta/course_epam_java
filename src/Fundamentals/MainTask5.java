package Fundamentals;

import java.util.Scanner;

public class MainTask5 {
    public static void main(String[] args) {
        /*5.   Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
        Осуществить проверку корректности ввода чисел.*/

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        while (i.)

        try {

            System.out.println(months[i-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No such month");
        }

    }
}
