package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
  public static int[]  amountOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calculateSum(amountOfSales);
        assertEquals(expected, actual);

    }

    @Test
    void calculateAverageSales() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.calculateAverageSales(amountOfSales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMaxSalesMonth() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.calculateMaxSalesMonth(amountOfSales);
        assertEquals(expected,actual);
    }

    @Test
    void calculateMinSalesMonth() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.calculateMinSalesMonth(amountOfSales);
        assertEquals(expected,actual);
    }


    @Test
    void calculateMonthsWithLowestAverageValue() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.calculateMonthsWithLowestAverageValue(amountOfSales);
        assertEquals(expected,actual);
    }

    @Test
    void calculateMonthsWithHighestAverageValue() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.calculateMonthsWithHighestAverageValue(amountOfSales);
        assertEquals(expected,actual);
    }
}