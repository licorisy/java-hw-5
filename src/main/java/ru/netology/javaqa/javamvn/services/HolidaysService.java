package ru.netology.javaqa.javamvn.services;

public class HolidaysService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;       // счётчик месяцев отдыха
        int money = 0;          // сумма денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {           // проверяем, достаточно ли денег для отдыха
                money -= expenses;              // сначала оплачиваем обычные расходы
                money /= 3;                     // затем оставшиеся средства сокращаем втрое
                count++;
            } else {
                money += income - expenses;     // работаем и получаем разницу между заработком и расходами
            }
        }

        return count;
    }
}
