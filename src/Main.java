public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (clientOS ==0 && clientDeviceYear >=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //Задание 3
        System.out.println("Задание 3");
        int year = 2021;
        int divisionFour = year % 4; //остаток деления на 4
        int divisionHundred = year % 100; //остаток деления на 100
        int divisionFourHundred = year % 400;
        if (divisionFourHundred == 0 && divisionHundred == 0) {
            System.out.println(year + " год является високосным");
        } else if (divisionFour == 0 && divisionHundred > 0) {
            System.out.println(year + " год является високосным");
        } else if (divisionHundred == 0) {
            System.out.println(year + " год является невисокосным");
        } else {
            System.out.println(year + " год является невисокосным");
        }


        //Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <=60) {
            deliveryDays = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <=100) {
            deliveryDays = 3;
        } else {
                        System.out.println("К Вам карта не доставляется. Слишком далеко");
        }
        System.out.println("Потребуется дней: " + deliveryDays);

        //Задаине 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }



            }
}