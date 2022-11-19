public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");

        int clientIos = 1;
        if (clientIos == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientIos ==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задание 2
        System.out.println("Задание 2");

        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015 && clientIos == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientIos ==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientIos == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылкее");
        } else if (clientDeviceYear >= 2015 && clientIos ==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задвние 3
        System.out.println("Задвние 3");

        int year =2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Является високосным годом");
        } else {
            System.out.println(year + " год не является високосным");
        }
        // Задвние 4
        System.out.println("Задвние 4");

        int deliveryDistance = 95;
        int deliiveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + (deliiveryDays));
        } else  if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + (deliiveryDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (deliiveryDays + 2));
        }
        // Задвние 5
        System.out.println("Задвние 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}