package ru.netology.javaqa.javamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class HolidaysServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })

    public void SmallMoney(int expected, int income, int expenses, int threshold) {
        HolidaysService service = new HolidaysService();

        Assertions.assertEquals(expected, service.calculate(income, expenses, threshold));
    }

    // @Test
    //  public void BigMoney() {
    //      HolidaysService service = new HolidaysService();

    //      int income = 100_000;
    //     int expenses = 60_000;
    //     int threshold = 150_000;
//Assertions.assertEquals(2, service.calculate(100_000, 60_000, 150_000));
}


