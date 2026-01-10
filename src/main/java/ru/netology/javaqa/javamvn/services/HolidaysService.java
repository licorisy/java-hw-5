package ru.netology.javaqa.javamvn.services;

public class HolidaysService {
    public int calculate(int income, int expenses, int threshold) {
        int Count = 0;       // счётчик месяцев отдыха
        int Money = 0;          // сумма денег на счету
        for (int month = 0; month < 12; month++) {
            if (Money >= threshold) {           // проверяем, достаточно ли денег для отдыха
                Money -= expenses;              // сначала оплачиваем обычные расходы
                Money /= 3;                     // затем оставшиеся средства сокращаем втрое
                Count++;
            } else {
                Money += income - expenses;     // работаем и получаем разницу между заработком и расходами
            }
        }

        return Count;
    }
}
