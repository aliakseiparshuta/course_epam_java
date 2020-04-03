package Fundamentals;

public class MainTask4 {
    public static void main(String[] args) {
//        4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
        int sum = 0;
        int prod = 1;
        for (String str : args){
            sum += Integer.parseInt(str);
            prod *= Integer.parseInt(str);
        }
        System.out.println("sum of numbers = " + sum);
        System.out.println("product of numbers = " + prod);


    }
}
