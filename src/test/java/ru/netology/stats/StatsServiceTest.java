package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void testSumAllSales() {
        StatsService service = new StatsService();

        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.sumAllSales(data);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSumAllSales() {
        StatsService service = new StatsService();

        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageSumAllSales(data);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMaxSales() {
        StatsService service = new StatsService();

        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(data);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMinSales() {
        StatsService service = new StatsService();

        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(data);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testNumberMonthsBelowAverage() {
        StatsService service = new StatsService();

        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.numberMonthsBelowAverage(data);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumberMonthsHigherAverage() {
        StatsService service = new StatsService();

        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.numberMonthsHigherAverage(data);

        Assertions.assertEquals(expected, actual);
    }
}
