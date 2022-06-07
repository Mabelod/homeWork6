package ru.skypro;

public class task3 {
    public static void main(String[] args) {
        int deliveryDistance = 61;
        int days = estimatedDeliveryTime(deliveryDistance);
        System.out.println("Потребуется дней: " + days);
    }
     public static int estimatedDeliveryTime(int distance){
        int days = 1;
        boolean interval1 = distance > 20;
        boolean interval2 = distance > 60;

        if (interval1) {
            days++;
        }

        if (interval2) {
            days++;
        }
        return days;
    }
}
