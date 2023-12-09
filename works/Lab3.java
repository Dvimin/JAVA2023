package works;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Логические операции "&&", "||", "!"
        System.out.println("Введите два числа для проверки их знака:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > 0 && num2 > 0) {
            System.out.println("Оба числа положительные!");
        } else if (num1 < 0 || num2 < 0) {
            System.out.println("Хотя бы одно число отрицательное!");
        } else if (num1 == 0 || num2 == 0) {
        System.out.println("Хотя бы одно число равно нулю!");
    }
        else {
            System.out.println("Оба числа равны нулю.");
        }

        // Тернарная операция "x < y ? x : y"
        System.out.println("Введите два числа для проверки тернарной операции:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int minValue = (x < y) ? x : y;
        System.out.println("Минимальное число: " + minValue);

        // Поразрядные логические операции & | ^ ~
        System.out.println("Введите два числа для поразрядных операций:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int bitwiseAnd = a & b;
        int bitwiseOr = a | b;
        int bitwiseXor = a ^ b;
        int bitwiseComplementA = ~a;
        int bitwiseComplementB = ~b;

        System.out.println("Поразрядное И: " + bitwiseAnd);
        System.out.println("Поразрядное ИЛИ: " + bitwiseOr);
        System.out.println("Поразрядное исключающее ИЛИ: " + bitwiseXor);
        System.out.println("Поразрядное отрицание для A: " + bitwiseComplementA);
        System.out.println("Поразрядное отрицание для B: " + bitwiseComplementB);

        // Операции сдвига >> << >>>
        System.out.println("Введите число для операций сдвига:");
        int number = scanner.nextInt();

        // Правый сдвиг на 2
        int rightShifted = number >> 2;
        // Левый сдвиг на 3
        int leftShifted = number << 3;
        // Беззнаковый правый сдвиг на 2
        int unsignedRightShifted = number >>> 2;

        System.out.println("Правый сдвиг на 2: " + rightShifted);
        System.out.println("Левый сдвиг на 3: " + leftShifted);
        System.out.println("Беззнаковый правый сдвиг на 2: " + unsignedRightShifted);
    }
}
