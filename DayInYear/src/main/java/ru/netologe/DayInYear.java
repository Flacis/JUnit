package ru.netologe;

import java.util.Scanner;

public class DayInYear {

    public void daysInYear(int i) {
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        while (true) {
            System.out.println("Введите год в формате: \"yyyy\"");
            int year = scanner.nextInt();
            System.out.println("Введите количество-дней");
            int days = scanner.nextInt();
            if (days == qtyDaysInYear(year)) {
                System.out.println("Верно");
                points += 1;
            } else if (366 != qtyDaysInYear(year)) {
                System.out.println("Не верно в этом году 365");
                System.out.println("Набрано очков: " + points);
                break;
            } else {
                System.out.println("Не верно в этом году 366");
                System.out.println("Набрано очков: " + points);
                break;
            }
        }
    }

    public static int qtyDaysInYear(int year) {
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            return 366;
        } else {
            return 365;
        }
    }
}
