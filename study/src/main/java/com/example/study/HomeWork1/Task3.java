package com.example.study.HomeWork1;

import java.util.Scanner;

/**
 * Напишите программу, которая использует цикл for с нестандартным шагом.
 * Программа должна запрашивать начальное значение,
 * конечное значение и шаг, затем выводить каждое `n`-ое число в этом диапазоне.
 */
public class Task3 {
    public static void main(String[] args) {
        Mistakes mistake = Mistakes.NOT_A_NUMBER;

        Scanner console = new Scanner(System.in);

        System.out.println("Введите начальное значение: ");

        while (!console.hasNextInt()) {
            System.out.println(mistake.getMistakes());
            console.next();
        }

        int startValue = console.nextInt();

        System.out.println("Введите конечное значение: ");

        while (!console.hasNextInt()) {
            System.out.println(mistake.getMistakes());
            console.next();
        }

        int finalValue = console.nextInt();

        System.out.println("Введите шаг: ");

        while (!console.hasNextInt()) {
            System.out.println(mistake.getMistakes());
            console.next();
        }

        int step = console.nextInt();

        System.out.println("Каждое `n`-ое число в этом диапазоне: ");
        for (int i = startValue; i < finalValue; i += step) {
            System.out.println(i + " ");
        }

        console.close();
    }
}
