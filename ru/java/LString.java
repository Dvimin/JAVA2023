package ru.java;
public class LString{
    public static void main(String[] args) {
        // Создание строк
        String str1 = "Первая строка";
        String str2 = new String("Вторая строка");

        // Вывод  строк
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // Длина строки
        int length = str1.length();
        System.out.println("Длина str1 = " + length);

        // Сравнение строк
        boolean isEqual = str1.equals(str2);
        System.out.println("str1 и str2 равны? - " + isEqual);

        // Сравнение без учета регистра
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("Первая строка");
        System.out.println("str1 и 'Первая строка' равны без учета регистра? - " + isEqualIgnoreCase);

        // Извлечение подстроки
        String substring = str2.substring(4, 9);
        System.out.println("Подстрока из str2 (с 4 по 9) = " + substring);

        // Поиск индекса подстроки
        int index = str1.indexOf("строка");
        System.out.println("Индекс 'строка' в str1 = " + index);

        // Замена подстроки
        String replacedStr = str1.replace("строка", "строчечка");
        System.out.println("Замененная строка: " + replacedStr);

        // Разделение строки на массив подстрок
        String csv = "значение1,значение2,значение3";
        System.out.println("Строка с разделителями = " + csv);
        String[] values = csv.split(",");
        System.out.println("Разделенные значения: ");
        for (String value : values) {
            System.out.println(value);
        }

        // Удаление начальных и конечных пробелов
        String withSpaces = "   Пробелы вокруг   ";
        System.out.println("Строка с пробелами = " + withSpaces);
        String trimmed = withSpaces.trim();
        System.out.println("Строка без пробелов вокруг: " + trimmed);

        // Преобразование числа в строку
        int number42 = 42;
        String strNumber42 = String.valueOf(number42);
        String strNumber422 = "" + number42;
        System.out.println("Число = " + strNumber42 + " и " + strNumber422);

        //Преобразование числа с форматированием
        double decimalNumber = 3.14;
        String formattedStr = String.format("%.2f", decimalNumber);
        System.out.println("Число с форматированием = " + formattedStr);

        // Преобразование строки в число
        String strNumber34 = "34";
        int number34 = Integer.parseInt(strNumber34);
        double decimalNumber34 = Double.parseDouble(strNumber34);
        System.out.println("Число = " + decimalNumber34);
    }
}
