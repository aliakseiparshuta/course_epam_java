package Fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask1 {
    public static void main(String[] args) throws IOException {
//        1.     Приветствовать любого пользователя при вводе его имени через командную строку.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your name");
        String name = reader.readLine();
        System.out.println("Hello" + " " + name);
        }
}
