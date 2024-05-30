package com.example.study.HomeWork1;

import java.util.Scanner;

/**
 * Разработайте программу, которая использует вложенные циклы for
 * для создания таблицы умножения заданного размера.
 * Пользователь должен ввести размер таблицы, а программа должна
 * выводить таблицу умножения для чисел от 1 до введенного числа.
 */
public class Task4 {
    public static void main(String[] args) {
        Mistakes mistake = Mistakes.NOT_A_NUMBER;

        Scanner console = new Scanner(System.in);
        System.out.println("Внесите размер таблицы: ");

        while (!console.hasNextInt()) {
            System.out.println(mistake.getMistakes());
            console.next();
        }

        int size = console.nextInt();
        for (int i = 1; i <= 10; i++) { //должен отвечать за строки

            System.out.println();
            for (int j = 1; j <= size; j++) { //должен отвечать за столбцы, брать значение из внешнего цикла
                int result = i * j;
                System.out.print(j + " * " + i + " = " + result);
                System.out.println();
            }
            System.out.println();
        }
        console.close();
    }
}
