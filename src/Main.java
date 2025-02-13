public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        var clientDeviceYea = 2015;
        if (clientOS == 0 && clientDeviceYea < 2015) {
            System.out.println("Установите облегченную версию для IOS");
        }
        if (clientOS == 1 && clientDeviceYea < 2015) {
            System.out.println("Установите облегченную версию для Android");
        }
        if (clientDeviceYea >= 2015) {
            System.out.println("Установите обычную версию");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        }
        else {System.out.println(year + "год неявляется високосным");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        System.out.println("Потребуется  дней:  " + days);
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " месяц это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "месяц это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "месяц это осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}