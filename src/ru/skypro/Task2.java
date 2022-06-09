package ru.skypro;

import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        int clientOS = 0;
        int clientDeviceYear = 2022;
        CheckPhoneModel(clientOS, clientDeviceYear);
    }

    static void CheckPhoneModel(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        boolean newIos = clientOS == 0;
        boolean oldPhone = clientDeviceYear < currentYear;
        boolean newAndroid = clientOS == 1;
        if (newIos) {
            if (oldPhone) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        }
        if (newAndroid) {
            if (oldPhone) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
}
