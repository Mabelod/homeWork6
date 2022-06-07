package ru.skypro;

public class task2 {
    public static void main(String[] args) {
        int clientOS = 0;
        int clientDeviceYear = 2016;
        phone(clientOS, clientDeviceYear);
    }
    static void phone(int clientOS, int clientDeviceYear){
        boolean newIos = clientOS == 0;
        boolean oldPhone = clientDeviceYear < 2015;
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
