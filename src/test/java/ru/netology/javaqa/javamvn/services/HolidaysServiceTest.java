package ru.netology.javaqa.javamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HolidaysServiceTest {

    @Test
    public void SmallMoney() {
        HolidaysService service = new HolidaysService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        Assertions.assertEquals(3, service.calculate(10_000, 3_000, 20_000));
    }

    @Test
    public void BigMoney() {
        HolidaysService service = new HolidaysService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        Assertions.assertEquals(2, service.calculate(100_000, 60_000, 150_000));
    }

}
