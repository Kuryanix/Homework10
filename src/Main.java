public class Main {
    public static void main(String[] args) {
        // Задача 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Задача 2
        String fullNameReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameReport);

        // Задача 3
        String fullName3 = "Иванов Семён Семёнович";
        String fullNameCorrect = fullName3.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullNameCorrect);

    }
}