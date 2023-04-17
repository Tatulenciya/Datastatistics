package ru.netology.stats;

public class StatsService {
    public int sumAllSales(int[] data) {
        int allSales = 0;
        for (int i = 0; i < data.length; i++) {
            allSales = allSales + data[i];
        }
        return allSales;
    }

    public int averageSumAllSales (int[] data) {
        return sumAllSales(data) / data.length;
    }

    public int maxSales(int[] data) {
        int maxMonth = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] >= data[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] data) {
        int minMonth = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] <= data[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int numberMonthsBelowAverage(int[] data) {
        int number = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] < averageSumAllSales(data)) {
                number++;
            }
        }

        return number;
    }

    public int numberMonthsHigherAverage(int[] data) {
        int months = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] > averageSumAllSales(data)) {
                months++;
            }
        }

        return months;
    }
}
