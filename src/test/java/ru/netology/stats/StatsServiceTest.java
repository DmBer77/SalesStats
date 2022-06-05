package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumOfElements() {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService sumOfElements = new StatsService();
        int sum = sumOfElements.sumSales(sales);
        int expected = 180;

        Assertions.assertEquals(expected, sum);
    }

    @Test
    public void shouldFindTheAverageOfSum() {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService avSum = new StatsService();
        double averSum = avSum.averageSum(sales);
        double expected = 15.0;

        Assertions.assertEquals(expected, averSum);
    }

    @Test
    public void shouldFindNumberOfMonthWithMaxSale() {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService maxMonth = new StatsService();
        int maximum = maxMonth.maxSales(sales);
        int expected = 8;

        Assertions.assertEquals(expected, maximum);
    }

    @Test
    public void shouldFindNumberOfMonthWithMinSale() {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService minMonth = new StatsService();
        int minimum = minMonth.minSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, minimum);
    }

    @Test
    public void shouldFindElementsWithSalesBelowTheAverage() {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService belowTheAverage = new StatsService();
        int sumOfElementsBelowTheAverage = belowTheAverage.elementsBelowTheAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, sumOfElementsBelowTheAverage);
    }

    @Test
    public void shouldFindElementsWithSalesAboveTheAverage() {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService aboveTheAverage = new StatsService();
        int sumOfElementsAboveTheAverage = aboveTheAverage.elementsAboveTheAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, sumOfElementsAboveTheAverage);
    }
}
