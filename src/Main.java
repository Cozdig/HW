public class Main {
    public static void checkYear(int year){
        if (year < 1584){
            System.out.println((year + " год не является високосным"));
        }
        else if (year % 100 == 0 && year % 400 != 0 || year % 4 != 0){
            System.out.println((year + " год не является високосным"));
        }
        else if (year % 4 == 0 || year % 400 == 0){
            System.out.println((year + " год является високосным"));
        }

    }

    public static void checkVersion(int clientOS, int yearPhone){
        if (yearPhone < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (yearPhone < 2015 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void checkDelivery(int deliveryDistance, int days){
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: " + days);
        }
        else if (deliveryDistance < 60){
            int upDays = days + 1;
            System.out.println("Потребуется дней: " + upDays);
        }
        else if (deliveryDistance < 100){
            int upDays = days + 2;
            System.out.println("Потребуется дней: " + upDays);
        }
        else {
            System.out.println("Доставки нет");
        }
    }
    public static void main(String[] args) {
        //1
        int year = 2021;
        checkYear(year);

        //2
        int clientOS = 0;
        int yearPhone = 2020;
        checkVersion(clientOS,yearPhone);

        //3
        int deliveryDistance = 95;
        int days = 1;
        checkDelivery(deliveryDistance,days);

    }
}