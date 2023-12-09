package works;

import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пример с использованием byte
        byte byteValue = 2;
        switch (byteValue) {
            case 1:
                System.out.println("Значение равно 1");
                break;
            case 2:
                System.out.println("Значение равно 2");
                break;
            case 3:
                System.out.println("Значение равно 3");
                break;
            default:
                System.out.println("Значение не равно 1, 2 или 3");
        }

        // Пример с использованием short
        short shortValue = 500;
        switch (shortValue) {
            case 100:
                System.out.println("Значение равно 100");
                break;
            case 500:
                System.out.println("Значение равно 500");
                break;
            case 1000:
                System.out.println("Значение равно 1000");
                break;
            default:
                System.out.println("Значение не равно 100, 500 или 1000");
        }

        // Пример с использованием char
        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("Значение равно 'A'");
                break;
            case 'B':
                System.out.println("Значение равно 'B'");
                break;
            case 'C':
                System.out.println("Значение равно 'C'");
                break;
            default:
                System.out.println("Значение не равно 'A', 'B' или 'C'");
        }

        // Пример с использованием int
        int intValue = 3;
        switch (intValue) {
            case 1:
                System.out.println("Значение равно 1");
                break;
            case 3:
                System.out.println("Значение равно 3");
                break;
            case 5:
                System.out.println("Значение равно 5");
                break;
            default:
                System.out.println("Значение не равно 1, 3 или 5");
        }

        // Пример с использованием String
        String stringValue = "Hello";
        switch (stringValue) {
            case "Hello":
                System.out.println("Значение равно 'Hello'");
                break;
            case "World":
                System.out.println("Значение равно 'World'");
                break;
            case "Java":
                System.out.println("Значение равно 'Java'");
                break;
            default:
                System.out.println("Значение не равно 'Hello', 'World' или 'Java'");
        }

        // Дополнительный пример
        System.out.println("Введите месяц (например, 'Январь'):");
        String month = scanner.nextLine().toLowerCase();

        switch (month) {
            case "январь":
            case "февраль":
            case "декабрь":
                System.out.println("Это зимний месяц");
                break;
            case "март":
            case "апрель":
            case "май":
                System.out.println("Это весенний месяц");
                break;
            case "июнь":
            case "июль":
            case "август":
                System.out.println("Это летний месяц");
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Неизвестный месяц");
        }
    }
}
