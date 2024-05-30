package com.example.study.HomeWork1;

public enum Mistakes {
    NOT_A_NUMBER ("Вы ввели не число. Введите число: "),
    NOT_A_NUMBERS ("Вы ввели не числа. Введите числа: "),
    NOT_A_POSITIVE_NUMBER ("Размер массива не может быть отрицательным! Введите положительное число: "),
    ;

    private String mistakes;

    Mistakes(String mistakes) {
        this.mistakes = mistakes;
    }

    public String getMistakes() {
        return mistakes;
    }
}
