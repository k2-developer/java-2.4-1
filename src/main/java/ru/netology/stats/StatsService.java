package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] amountOfSales) {
        int sum = 0;
        for (int amount : amountOfSales) {
            sum = sum + amount;
        }
        return sum;
    }

    public int calculateAverageSales(int[] amountOfSales) {
        int sum = 0;
        int averageSales = 0;
        for (int amount : amountOfSales) {
            sum = sum + amount;
            averageSales =  sum  / amountOfSales.length;
        }
        return averageSales;
    }




}
