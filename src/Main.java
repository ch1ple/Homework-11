public class Main {
    public static void printCheckLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static void printDetermineTheVersion(int clientOS, int clientDeviceYear) {
        int currentYear = 2023;
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void printCountDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        printCheckLeapYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2020;
        printDetermineTheVersion(clientOS, clientDeviceYear);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        printCountDeliveryDays(deliveryDistance);
    }
}