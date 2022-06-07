package ru.skypro;

public class task1 {
    public static void main(String[] args) {
        int year = 2;
        yearCalculation(year);
    }

    public static void yearCalculation(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }
}
