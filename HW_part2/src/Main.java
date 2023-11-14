import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //  Задание.1.Вывести построчно в консоль слова Стива Джобса
        System.out.println("Your time is limited");
        System.out.println("so don’t waste it");
        System.out.println("living someone else’s life");

        // Задание.2. Посчитать процент от числа
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число от которого нужно посчитать процент: ");
        int a = scan.nextInt();
        System.out.println("Введите для расчета размер процента от первоначальногно числа");
        int b = scan.nextInt();
        System.out.println("Сумма процентов:" + a * b / 100);

        // Задание.3. Ввести 3 отдельные цифры и сложить в одно число.
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Введите первое число, которое нужно сложить: ");
        int d = scan1.nextInt();
        System.out.print("Введите второе число, которое нужно сложить: ");
        int f = scan1.nextInt();
        System.out.print("Введите третье число, которое нужно сложить: ");
        int g = scan1.nextInt();
        int result = d + f + g;
        System.out.println("Сумма трех чисел: " + result);


        // Задача.4.Переворот шестизначного числа + провека количества символов (НЕ РЕАЛИЗОВАНО)
        System.out.println("Введите шестизначное число");
        Scanner scan2 = new Scanner(System.in);
        //scan2.nextLine();
        //Integer.parseInt();
        //System.out.println(scan2.toString());
        //if (scan2 != 6) {
        //} else {
        //System.out.println("Вы ввели не шестизначное число");}
        int numberToReverse = scan2.nextInt();
        StringBuilder builder = new StringBuilder(String.valueOf(numberToReverse));
        builder.reverse();
        System.out.println("Число наоборот" + builder);

// Задача.5.Ввод значений и проверка на соответсвия изх временам года.
        System.out.println("Введите порядковый номер месяца календарного года");
        Scanner scan3 = new Scanner(System.in);
        int month = scan3.nextInt();
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Winter");
        }
        if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        }
        if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        }
        if (month == 9 || month == 10 || month == 11) {
            System.out.println("Winter");
        }
        if (month > 1 || month < 12) {
            System.out.println("УНИКУМ!!!! Ты указал не существующий календарный месяц!!!");
        }

        // Задача.6. Написать программу конвертации величин метрической системы.(НЕ РАБОТАЕТ)
        System.out.println("Введите количество метров для конвертации длинны");
        Scanner scan4 = new Scanner(System.in);
        int length = scan4.nextInt();
        System.out.println("Выберете величину длинны для преобразования: 1 - Мили, 2 - Дюймы, 3 - Ярды");
        Scanner scan5 = new Scanner(System.in);
        int magnitude = scan5.nextInt();
        int miles = 1;
        //miles = 0.00062137;
        int Inches = 2;
        //Inches = 39.3701;
        int ayrds = 3;
        // ayrds = 1.0936;
        if (length == 1) {
        System.out.println("Величина в милях равна = ", +(magnitude * 0.00062137));
        }
       if (length == 2) {
       System.out.println("Величина в дюймах равна = ", +(magnitude * 39.3701));
       }
       if (length == 3) {
       System.out.println("Величина в ярдах равна = ", +(magnitude * 1.0936));
        }
        }
    }
