package org.example;
import  java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите первое число");
        int b = scanner.nextInt();
        int c = a * b;
        System.out.println("Ответ: " + c);
    }
}
