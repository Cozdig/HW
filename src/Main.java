public class Main {
    public static void main(String[] args) {
        //1
        int[] money =  {15_000, 20_000, 10_000, 5_000, 19_000};
        int sum = 0;
        for (int i = 0; i < money.length; i++){
            sum += money[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //2
        int[] weakMoney = {100, 20, 400, 1000, 50};
        int min = weakMoney[0];
        int max = weakMoney[0];
        for (int i = 0; i < weakMoney.length; i++){
            if (weakMoney[i] < min){
                min = weakMoney[i];
            } else if (weakMoney[i] > max) {
                max = weakMoney[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");
        //3
        int[] monthMoney = {1000, 2000, 1500, 2100, 900};
        int allMoney = 0;
        for (int i = 0; i < monthMoney.length; i++){
            allMoney += monthMoney[i];
        }
        float mediumMoney = allMoney / monthMoney.length;
        System.out.println("Средняя сумма трат за месяц составила " + mediumMoney + " рублей");
        //4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char correctName = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = correctName;
        }
        System.out.println(reverseFullName);
    }
}