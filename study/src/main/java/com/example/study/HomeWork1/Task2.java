package com.example.study.HomeWork1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Создайте программу, которая запрашивает у пользователя размер массива, 
 * а затем элементы массива. Используя цикл for-each, 
 * программа должна вычислить и вывести среднее значение всех элементов массива.
 */
public class Task2 {
    public static void main(String[] args) {
        Mistakes mistake = Mistakes.NOT_A_NUMBER;
        Mistakes mistakes = Mistakes.NOT_A_POSITIVE_NUMBER;

        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива: ");

        while (!console.hasNextInt()) {
            System.out.println(mistake.getMistakes());
            console.next();
        }

        //Тут пыталась сделать проверку: является ли число положительным. Не получается.
        //Приходится вводить 2 раза и тогда программа работает дальше. А если оставлять console.next();
        //то вводить надо уже 3 раза. Когда есть этот цикл, то, даже, когда изначально в консоли
        //ввожу положительное число, приходится его вводить 2 раза.
//        while (console.nextInt() < 0) {
//            System.out.println(mistakes.getMistakes());
//            //console.next();
//        }
        int size = console.nextInt();
        int[] values = new int[size];


        System.out.println("Введите значения массива: ");
        for (int i = 0; i < size; i++) {
            values[i] = console.nextInt();
            System.out.println(Arrays.toString(values)); // смотрим в консоли, как заполняется массив на каждой итерации
        }

        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        console.close();

        int meanValue = sum / size;
        System.out.println("Среднее значение: " + meanValue);
        
    }
}
