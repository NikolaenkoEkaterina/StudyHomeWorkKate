package com.example.study.HomeWork1;

import java.util.Scanner;

/**
 * Напишите программу, которая просит пользователя
 * ввести количество чисел для ввода.
 * Затем, используя цикл for, программа должна
 * принимать числа от пользователя и выводить их сумму.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите количество чисел: ");

        while (!console.hasNextInt()) {
                System.out.println("Вы ввели не число! Введите число: ");
                console.next(); //пропуск ввода
            }
        int quantity = console.nextInt();


        System.out.println("Введите числа для суммирования в одну строку через пробел: ");
        int sum = 0;
        for (int i = 0; i < quantity; i++) {
            while (!console.hasNextInt()) {
                System.out.println("Вы ввели не числа! Введите числа: ");
                console.next();
            }
            int numbers = console.nextInt();
            sum += numbers;
        }
        console.close();
        System.out.println("Сумма: " + sum);
    }

}
