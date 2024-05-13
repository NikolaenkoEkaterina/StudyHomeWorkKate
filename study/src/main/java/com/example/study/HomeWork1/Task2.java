package com.example.study.HomeWork1;

import java.util.Scanner;

/**
 * Создайте программу, которая запрашивает у пользователя размер массива, 
 * а затем элементы массива. Используя цикл for-each, 
 * программа должна вычислить и вывести среднее значение всех элементов массива.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = console.nextInt();
        int[] values = new int[size];

        System.out.println("Введите значения массива: ");
        //здесь не получилось использовать for-each,он прям не просится. И подумала: и так сойдёт
        for (int i = 0; i < size; i++) {
            values[i] = console.nextInt();
        }
        //вот тут уже куда приятней использоватьfor-each.
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        console.close();

        int meanValue = sum / size;
        System.out.println("Среднее значение: " + meanValue);
        
    }
}
