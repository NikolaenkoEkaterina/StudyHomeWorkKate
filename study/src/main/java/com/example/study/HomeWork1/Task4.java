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
        Scanner console = new Scanner(System.in);
        System.out.println("Внесите размер таблицы: ");
        int size = console.nextInt();
        for (int i = 1; i <= size; i++) { //должен отвечать за строки
            int result1 = size * i;
            System.out.println();
            for (int j = 1; j <= size; j++) { //должен отвечать за столбцы, брать значение из внешнего цикла
                int result2 = result1 * j;
                System.out.print(i + " * " + j + " = " + result2);
                System.out.println();
            }
            System.out.println();
        }
        console.close();
    }
}
