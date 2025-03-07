public class Main {
    public static void main(String[] args) {
        //1
        int money = 0;
        int month = 0;
        while (money <= 2_459_000) {
            money += 15_000;
            month += 1;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
        //2
        int number = 0;
        while (number != 10) {
            number += 1;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int num = 10; num >= 1; num--) {
            System.out.print(num + " ");
        }
        //3
        int peoples = 12_000_000;
        int year = 0;
        while (year != 10) {
            year++;
            peoples = peoples + ((peoples / 1_000) * (17 - 8));
            System.out.println("Год " + year + ", численность населения составляет " + peoples);
        }
        //4-5
        int firstMoney = 15_000;
        int month1 = 0;
        while (firstMoney <= 12_000_000) {
            firstMoney = firstMoney + firstMoney / 100 * 7;
            month1 += 1;
            if (month1 % 6 == 0) {
                System.out.println("За " + month1 + " месяц, сумма накоплений равна " + firstMoney);
            }
        }
        //6
        int secondMoney = 15_000;
        int month2 = 0;
        while (month2 < 108) {
            secondMoney = secondMoney + secondMoney / 100 * 7;
            month2 += 1;
            if (month2 % 6 == 0) {
                System.out.println("За " + month2 + " месяц, сумма накоплений равна " + secondMoney);
            }
        }
        //7
        int friday = 5;
        int monthDays = 0;
        int weeks = 0;
        while (monthDays < 31) {
            if (monthDays == friday) {
                System.out.println("Сегодня пятница, " + monthDays + "-е число. Необходимо подготовить отчет");
            }
            else if (friday == monthDays - weeks){
                System.out.println("Сегодня пятница, " + monthDays + "-е число. Необходимо подготовить отчет");
            }
            monthDays += 1;

            if (monthDays % 7 == 0) {
                weeks +=7;

            }

        }
        //8
        int thisYear = 2025;
        int comet = 79;
        while (comet < thisYear + 100){
            comet += 79;
            if (comet > thisYear - 200 && comet < thisYear + 100){
                System.out.println(comet);
            }
        }
    }
}