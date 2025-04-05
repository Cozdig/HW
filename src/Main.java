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

    public static int checkDelivery(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance < 20) {
            days = 1;
        } else if (deliveryDistance < 60) {
            days = days + 2;
        } else if (deliveryDistance < 100) {
            days = days + 3;
        }
        return days;
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
        int deliveryDistance = 100;
        System.out.println(checkDelivery(deliveryDistance));

    }
}