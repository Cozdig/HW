public class Main {
    public static void main(String[] args) {
        // 1
        String firstName = " Ivan ";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);

        //2
        String bigFullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + bigFullName);
        //3
        fullName = "Иванов Семён Семёнович".replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника — " + fullName);
    }
}