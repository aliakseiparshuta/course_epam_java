package Fundamentals;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class OptionalTask1 {
    public static void shortLong (int[] numbers){
//        1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        int min = String.valueOf(numbers[0]).length();
        int min1 = numbers[0];
        int max = String.valueOf(numbers[0]).length();
        int max1 = numbers[0];
        for (int i = 1; i<numbers.length; i++){
            if (min > String.valueOf(numbers[i]).length()){
                min = String.valueOf(numbers[i]).length();
                min1 = numbers[i];
            }
            if (max < String.valueOf(numbers[i]).length()){
                max = String.valueOf(numbers[i]).length();
                max1 = numbers[i];
            }
        }
        System.out.println("Самое короткое число : " + min1 + " его длина : " + min);
        System.out.println("Самое длинное число : " + max1 + " его длина : " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нужное количество цифр");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Заполните массив");
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = Math.abs(sc.nextInt());
        }
        shortLong(numbers);

    }
}
