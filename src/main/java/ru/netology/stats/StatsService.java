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
            averageSales = sum / amountOfSales.length;
        }
        return averageSales;
    }

    public int calculateMaxSalesMonth(int[] amountOfSales) {
        int index = 0;
        int result = 0;
        int currentMax = amountOfSales[0];
        for (int amount : amountOfSales) {
            index++;
            if (currentMax < amount) {
                currentMax = amount;
                result = index;
            }
        }
        return result;
    }

    public int calculateMinSalesMonth(int[] amountOfSales) {
        int index = 0;
        int result = 0;
        int currentMin = amountOfSales[0];
        for (int amount : amountOfSales) {
            index++;
            if (currentMin > amount) {
                currentMin = amount;
                result = index;
            }
        }
        return result;
    }

    public int calculateMonthsWithLowestAverageValue(int[] amountOfSales) {
        int average = calculateAverageSales(amountOfSales);
        int underAverage = 0;
        int totalMonthsLowAverage = 0;
        for (int data : amountOfSales){
            if (data < average){
                totalMonthsLowAverage++;
                underAverage = totalMonthsLowAverage;
            }
        }
        return underAverage;
    }

    public int calculateMonthsWithHighestAverageValue(int[] amountOfSales) {
        int average = calculateAverageSales(amountOfSales);
        int aboveAverage = 0;
        int totalMonthsHighAverage = 0;
        for (int data : amountOfSales){
            if (data < average){
                totalMonthsHighAverage++;
                aboveAverage = totalMonthsHighAverage;
            }
        }
        return  aboveAverage;
    }
}


